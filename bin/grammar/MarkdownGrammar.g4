parser grammar MarkdownGrammar;

options {tokenVocab=MarkdownLexer;}

cv:info BLOCKSPLITTER (block BLOCKSPLITTER)*;

info: name subHeader address contacts+;
subHeader:(SHARP SHARP (STRING_LITERAL)+ NEWLINE)+;

name:SHARP(STRING_LITERAL)+ NEWLINE;

address: STAR (STRING_LITERAL)+ NEWLINE;
contacts: CLOSE_ANGLE_BRACKET icon STRING_LITERAL NEWLINE+;

block: SHARP SHARP STRING_LITERAL NEWLINE;

testreal: REAL;

icon: OPEN_CURLY STRING_LITERAL (REAL SLASH REAL)? CLOSE_CURLY;