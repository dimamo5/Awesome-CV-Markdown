parser grammar MarkdownGrammar;

options {tokenVocab=MarkdownLexer;}
@members{
    public Data.Table table = new Data.Table();
    public Data.Info info = new Data.Info();
}
cv:info BLOCKSPLITTER NEWLINE+ (block BLOCKSPLITTER  NEWLINE+)+;

info:name subHeader+ address contacts+;
subHeader:{info.newSub();} SHARP SHARP SPACE* word_space{info.addSub($word_space.text);} NEWLINE;

name:SHARP word_space {info.addName($word_space.text);} NEWLINE;

address: STAR any{info.addAddress($any.text);} NEWLINE;
contacts: CLOSE_ANGLE_BRACKET icon any{info.addContacts($any.text);} NEWLINE+;

block: blockName subBlock+;
subBlock: (blockSubName boldText?)? (blockList+|table|any);

blockList: STAR  any+ NEWLINE blockListCell*;
blockListCell: COLON icon? any? NEWLINE;

table: tableHeader NEWLINE tableBody;
tableBody: (tableLine NEWLINE)+;


icon locals[boolean allow=true]: OPEN_CURLY WORD SPACE* STAR_CLASS?{String s=$STAR_CLASS.text; if(s!=null){String[] ints= s.split("/");float esquerda=Float.valueOf(ints[0].trim()); float direita=Float.valueOf(ints[1].trim()); if(esquerda>direita){System.err.println("Nr of stars cannot be bigger than total stars");$allow=false;}else $allow=true;}} {$allow}? CLOSE_CURLY;

boldText: TILT any+ NEWLINE+;
tableHeader: word_space{table.addHeaderCell($word_space.text);} (HAT SPACE* word_space {table.addHeaderCell($word_space.text);})+;
tableCell: tablecontent SPLIT ;
tableLine:{table.addBodyLine();} tableCell+;
blockName: SHARP SHARP SHARP word_space NEWLINE+;
blockSubName: SHARP SHARP SHARP SHARP word_space NEWLINE+;

any: (WORD | INT| SYMBOL|ESCAPE|SPACE+ )+;
tablecontent: (icon| any{table.addBodyCell($any.text);})+;

word_space:(WORD SPACE*)+;