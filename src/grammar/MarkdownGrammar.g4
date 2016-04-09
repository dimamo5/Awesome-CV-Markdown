parser grammar MarkdownGrammar;

options {tokenVocab=MarkdownLexer;}

cv:info BLOCKSPLITTER (block BLOCKSPLITTER)*;

info: name subHeader address contacts+;
subHeader:(SHARP SHARP (string)+ NEWLINE)+;

name:SHARP string NEWLINE;

address: STAR string NEWLINE;
contacts: CLOSE_ANGLE_BRACKET icon string NEWLINE+;

block: SHARP SHARP string NEWLINE;

icon: OPEN_CURLY string (real SLASH INT)? CLOSE_CURLY;

string: (WORD | real| PERIOD)+;
real:INT|FLOAT;