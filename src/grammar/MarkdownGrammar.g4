parser grammar MarkdownGrammar;

options {tokenVocab=MarkdownLexer;}
cv:info BLOCKSPLITTER  ((blockName? blockSubName? blockInfoHeader (blockInfoBody)+)+ BLOCKSPLITTER)*;

info: name subHeader address contacts+;
subHeader:(SHARP SHARP WORD+ NEWLINE)+;

name:SHARP WORD+ NEWLINE;

address: STAR any NEWLINE;
contacts: CLOSE_ANGLE_BRACKET icon any NEWLINE+;

blockName: SHARP SHARP SHARP WORD+ NEWLINE+;
blockSubName: SHARP SHARP SHARP SHARP WORD+ NEWLINE+;
blockInfoHeader: STAR WORD+ NEWLINE+;
blockInfoBody: COLON icon? any? ratio? NEWLINE+;

icon: OPEN_CURLY WORD STAR_CLASS? CLOSE_CURLY;

ratio: OPEN_PARENTHESES STAR_CLASS CLOSE_PARENTHESES;

//RULES
any: (WORD | INT | SYMBOL)+;

