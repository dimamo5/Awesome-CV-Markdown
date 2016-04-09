parser grammar MarkdownGrammar;

options {tokenVocab=MarkdownLexer;}
cv:info BLOCKSPLITTER  ((blockName? blockSubName? (tableBlockHeader (tableBlockBody)+)? boldText? blockInfoHeader? (blockInfoBody)+)+ BLOCKSPLITTER)*;

info: name subHeader address contacts+;
subHeader:(SHARP SHARP WORD+ NEWLINE)+;

name:SHARP WORD+ NEWLINE;

address: STAR any NEWLINE;
contacts: CLOSE_ANGLE_BRACKET icon any NEWLINE+;

blockName: SHARP SHARP SHARP WORD+ NEWLINE+;
blockSubName: SHARP SHARP SHARP SHARP WORD+ NEWLINE+;
blockInfoHeader: STAR any+ NEWLINE+;
blockInfoBody: COLON icon? any? ratio? NEWLINE+;
tableBlockHeader: tableHeader NEWLINE+;
tableBlockBody: tableBody+ NEWLINE+;


icon: OPEN_CURLY WORD STAR_CLASS? CLOSE_CURLY;

ratio: OPEN_PARENTHESES STAR_CLASS CLOSE_PARENTHESES;

boldText: TILT any+;

tableHeader: WORD+(HAT WORD+)+;
tableBody: (tablecontent) SPLIT (tablecontent)*;

//RULES
any: (WORD | INT | SYMBOL)+;
tablecontent: (icon| ratio| any)+;

