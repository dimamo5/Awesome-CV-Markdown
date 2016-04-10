parser grammar MarkdownGrammar;

options {tokenVocab=MarkdownLexer;}
cv:info BLOCKSPLITTER NEWLINE+ (block BLOCKSPLITTER  NEWLINE+)+;

info: name subHeader address contacts+;
subHeader:(SHARP SHARP WORD+ NEWLINE)+;

name:SHARP WORD+ NEWLINE;

address: STAR any NEWLINE;
contacts: CLOSE_ANGLE_BRACKET icon any NEWLINE+;

block: blockName subBlock+;
subBlock: (blockSubName boldText?)? (blockList+|table|any);

blockList: STAR  any+ NEWLINE blockListCell*;
blockListCell: COLON icon? any? NEWLINE;

table: tableHeader NEWLINE tableBody;
tableBody: (tableLine NEWLINE)+;


icon: OPEN_CURLY WORD STAR_CLASS? CLOSE_CURLY;

boldText: TILT any+ NEWLINE+;
tableHeader: WORD+(HAT WORD+)+;
tableCell: tablecontent SPLIT ;
tableLine: tableCell+;
blockName: SHARP SHARP SHARP WORD+ NEWLINE+;
blockSubName: SHARP SHARP SHARP SHARP WORD+ NEWLINE+;

any: (WORD | INT| SYMBOL|ESCAPE )+;
tablecontent: (icon| any)+;

