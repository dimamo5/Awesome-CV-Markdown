parser grammar MarkdownGrammar;

options {tokenVocab=MarkdownLexer;}

cv:info BLOCKSPLITTER (block BLOCKSPLITTER)*;

info: name subHeader address contacts+;
subHeader:(SHARP SHARP WORD+ NEWLINE)+;

name:SHARP WORD+ NEWLINE;

address: STAR any NEWLINE;
contacts: CLOSE_ANGLE_BRACKET icon any NEWLINE+;

block: SHARP SHARP WORD+ NEWLINE;

icon: OPEN_CURLY WORD STAR_CLASS? CLOSE_CURLY;

any: (WORD | INT | SYMBOL)+;
