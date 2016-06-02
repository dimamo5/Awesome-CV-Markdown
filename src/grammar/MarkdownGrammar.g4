parser grammar MarkdownGrammar;

options {tokenVocab=MarkdownLexer;}
@members{
    public data.Cv cv = new data.Cv();
}
cv:info BLOCKSPLITTER NEWLINE+ (block BLOCKSPLITTER  NEWLINE+)+;

info:name subHeader+ address contacts+;
subHeader:{cv.info.newSub();} SHARP SHARP SPACE* word_space{cv.info.addSub($word_space.text);} NEWLINE;

name:SHARP word_space {cv.info.addName($word_space.text);} NEWLINE;

address: STAR any{cv.info.addAddress($any.text);} NEWLINE;
contacts: CLOSE_ANGLE_BRACKET icon any{cv.info.addContacts($any.text, $icon.text);} NEWLINE+;

block: {cv.newBlock(); } blockName subBlock+;
subBlock: {cv.getBlock().newSubBlock();} (blockSubName boldText?{cv.getSubBlock().addBoldText($boldText.text);})?
(list|table|textBlock{cv.getSubBlock().addText($textBlock.text);});

textBlock:{cv.getSubBlock().setType(data.SubBlock.BlockType.TEXT);}(any NEWLINE?)+;

list: {cv.getSubBlock().setType(data.SubBlock.BlockType.LIST);} blockList+;
blockList: STAR any{cv.getList().addHeader($any.text);} NEWLINE (blockListCell)+;
blockListCell: COLON icon? any?{cv.getList().addListCell($any.text, $icon.text);} NEWLINE;

table:{cv.getSubBlock().setType(data.SubBlock.BlockType.TABLE);} tableHeader NEWLINE tableBody;
tableBody: (tableLine NEWLINE)+;


icon locals[boolean allow=true]: OPEN_CURLY WORD SPACE* STAR_CLASS?{String s=$STAR_CLASS.text; if(s!=null){String[] ints= s.split("/");float esquerda=Float.valueOf(ints[0].trim()); float direita=Float.valueOf(ints[1].trim()); if(esquerda>direita){System.err.println("Nr of stars cannot be bigger than total stars");$allow=false;}else $allow=true;}} {$allow}? CLOSE_CURLY;

boldText: TILT any+ NEWLINE+;
tableHeader: word_space{cv.getTable().addHeaderCell($word_space.text);} (HAT SPACE* word_space {cv.getTable().addHeaderCell($word_space.text);})+;
tableCell:  tablecontent SPLIT ;
tableLine: {cv.getTable().addBodyLine();} tableCell+;
blockName: SHARP SHARP SHARP word_space{cv.getBlock().addBlockName($word_space.text);} NEWLINE+;
blockSubName: SHARP SHARP SHARP SHARP word_space{cv.getSubBlock().addSubBlockName($word_space.text);} NEWLINE+;

any: (WORD | INT| SYMBOL|ESCAPE|SPACE+ )+;
tablecontent: SPACE* (icon| any{cv.getTable().addBodyCell($any.text, $icon.text);})+;

word_space:(WORD SPACE*)+;