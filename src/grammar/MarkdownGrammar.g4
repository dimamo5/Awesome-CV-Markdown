parser grammar MarkdownGrammar;

options {tokenVocab=MarkdownLexer;}

header: SHARP (STRING_LITERAL)+ SHARP NEWLINE subHeader;

subHeader:(SHARP SHARP (STRING_LITERAL)+ SHARP SHARP NEWLINE)+;


