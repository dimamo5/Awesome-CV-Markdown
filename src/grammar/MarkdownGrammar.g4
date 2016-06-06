parser grammar MarkdownGrammar;

options {tokenVocab=MarkdownLexer;}
@members{
    public data.Cv cv = new data.Cv();
}
cv:info BLOCKSPLITTER NEWLINE+ (block BLOCKSPLITTER  NEWLINE+)+;

info:name subHeader+ address contacts+;
subHeader: SHARP SHARP SPACE* word_space NEWLINE;

name:SHARP word_space NEWLINE;

address: STAR any NEWLINE;
contacts: CLOSE_ANGLE_BRACKET icon any NEWLINE+;

block: blockName subBlock+;
subBlock: blockSubName?
(list|table|textBlock);

textBlock:(any NEWLINE?)+;

list: blockList+;
blockList: STAR any (NEWLINE|SPACE+) (blockListCell)+;
blockListCell: CLOSE_ANGLE_BRACKET icon? any? (NEWLINE|SPACE+);

table: tableHeader NEWLINE tableBody;
tableBody: (tableLine NEWLINE)+;


icon locals[boolean allow=true]: OPEN_CURLY WORD SPACE* STAR_CLASS?{String s=$STAR_CLASS.text; if(s!=null){String[] ints= s.split("/");float esquerda=Float.valueOf(ints[0].trim()); float direita=Float.valueOf(ints[1].trim()); if(esquerda>direita){System.err.println("Nr of stars cannot be bigger than total stars");$allow=false;}else $allow=true;}} {$allow}? CLOSE_CURLY;

tableHeader: word_space (HAT SPACE* word_space)+;
tableCell:  tablecontent SPLIT ;
tableLine: tableCell+;
blockName: SHARP word_space NEWLINE+;
blockSubName: SHARP SHARP word_space NEWLINE+;

any: (WORD | INT| SYMBOL|ESCAPE|SPACE+ )+;
tablecontent: SPACE* (icon| any)+;

word_space:((WORD|SYMBOL) SPACE*)+;