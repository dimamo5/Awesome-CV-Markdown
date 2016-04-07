parser grammar MarkdownGrammar;

options {tokenVocab=MarkdownLexer;}

header: SHARP (STRING_LITERAL)+ SHARP;


