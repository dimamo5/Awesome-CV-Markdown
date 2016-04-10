parser grammar MarkdownGrammar;

options {tokenVocab=MarkdownLexer;}
cv:info BLOCKSPLITTER NEWLINE+ (block BLOCKSPLITTER  NEWLINE+)+;

info: name subHeader address contacts+;
subHeader:(SHARP SHARP WORD+ NEWLINE)+;

name:SHARP WORD+ NEWLINE;

address: STAR any NEWLINE;
contacts: CLOSE_ANGLE_BRACKET icon any NEWLINE+;

block: blockName blockSubName+ boldText? subBlock+;
subBlock: blockInfoHeader (table |blockInfoBody+);

blockName: SHARP SHARP SHARP WORD+ NEWLINE+;
blockSubName: SHARP SHARP SHARP SHARP WORD+ NEWLINE+;
blockInfoHeader: STAR  blockcontent NEWLINE+;
blockInfoBody: COLON icon? any? ratio? NEWLINE+;

table: tableBlockHeader tableBlockBody+ NEWLINE+;
tableBlockHeader: tableHeader NEWLINE+;
tableBlockBody: tableBody+ NEWLINE+ BLOCKSPLITTER?;


icon: OPEN_CURLY WORD STAR_CLASS? CLOSE_CURLY;

ratio: OPEN_PARENTHESES STAR_CLASS CLOSE_PARENTHESES;

//RULES

boldText: TILT addendum+ NEWLINE+;
tableHeader: WORD+(HAT WORD+)+;
tableBody: (tablecontent) SPLIT (tablecontent)*;
addendum: (any+)?(OPEN_PARENTHESES? any+ SLASH any+ CLOSE_PARENTHESES?);

any: (WORD | INT| SYMBOL|ESCAPE )+;
tablecontent: (icon| ratio| any)+;
blockcontent: (addendum| any)+;

