parser grammar MarkdownGrammar;

options {tokenVocab=MarkdownLexer;}
@members{
    public Data.Cv cv = new Data.Cv();
}
cv:info BLOCKSPLITTER NEWLINE+ (block BLOCKSPLITTER  NEWLINE+)+;

info:name subHeader+ address contacts+;
subHeader:{cv.info.newSub();} SHARP SHARP SPACE* word_space{cv.info.addSub($word_space.text);} NEWLINE;

name:SHARP word_space {cv.info.addName($word_space.text);} NEWLINE;

address: STAR any{cv.info.addAddress($any.text);} NEWLINE;
contacts: CLOSE_ANGLE_BRACKET icon any{cv.info.addContacts($any.text);} NEWLINE+;

block: {cv.newBlock();} blockName subBlock+;
subBlock: (blockSubName{cv.getBlock().addSubBlockName($blockSubName.text);} boldText?{cv.getBlock().addBoldText($boldText.text);})? (blockList+|table|any);

blockList: STAR  any+ NEWLINE blockListCell*;
blockListCell: COLON icon? any? NEWLINE;

table:{cv.getBlock().setType(Data.Block.BlockType.TABLE);} tableHeader NEWLINE tableBody;
tableBody: (tableLine NEWLINE)+;


icon locals[boolean allow=true]: OPEN_CURLY WORD SPACE* STAR_CLASS?{String s=$STAR_CLASS.text; if(s!=null){String[] ints= s.split("/");float esquerda=Float.valueOf(ints[0].trim()); float direita=Float.valueOf(ints[1].trim()); if(esquerda>direita){System.err.println("Nr of stars cannot be bigger than total stars");$allow=false;}else $allow=true;}} {$allow}? CLOSE_CURLY;

boldText: TILT any+ NEWLINE+;
tableHeader: word_space{cv.getTable().addHeaderCell($word_space.text);} (HAT SPACE* word_space {cv.getTable().addHeaderCell($word_space.text);})+;
tableCell: tablecontent SPLIT ;
tableLine:{cv.getTable().addBodyLine();} tableCell+;
blockName: SHARP SHARP SHARP word_space{cv.getBlock().addBlockName($word_space.text);} NEWLINE+;
blockSubName: SHARP SHARP SHARP SHARP word_space{cv.getBlock().addSubBlockName($word_space.text);} NEWLINE+;

any: (WORD | INT| SYMBOL|ESCAPE|SPACE+ )+;
tablecontent: (icon| any{cv.getTable().addBodyCell($any.text);})+;

word_space:(WORD SPACE*)+;