lexer grammar MarkdownLexer;

/* Single chars used by the parser.   */
SPACE: ' ';
TAB: '\t'->skip;
NEWLINE: ('\n' | '\r')+;
CLOSE_ANGLE_BRACKET: '>';
STAR:'*';
SHARP: '#';
SLASH: '/';
OPEN_CURLY: '{';
CLOSE_CURLY: '}';
BLOCKSPLITTER:'===';
HAT:'^';
SPLIT:'|';
EQUAL:'=';

fragment CHAR: [a-zA-Z\u00C0-\u00FF] ;
fragment DIGIT: [0-9];
ESCAPE: '\\' HAT|'\\' SLASH|'\\' OPEN_CURLY|'\\' CLOSE_CURLY|'\\' SPLIT|'\\' SHARP| '\\' STAR| '\\' EQUAL;
SYMBOL: ([\.@_'?&$+\-%&«»&%$"!;,ºª()~\\]);

WORD: CHAR+;
INT: DIGIT+;

STAR_CLASS: INT( [\.] [05])? '/' INT;

