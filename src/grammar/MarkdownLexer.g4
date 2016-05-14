lexer grammar MarkdownLexer;

/* Single chars used by the parser.   */
SPACE: ' '->skip;
TAB: '\t';
NEWLINE: ('\n' | '\r')+;
STAR: '*';
MINUS: '-';
COLON:':';
CLOSE_ANGLE_BRACKET: '>';
OPEN_ANGLE_BRACKET:'<';
SHARP: '#';
OPEN_SB: '[';
CLOSE_SB: ']';
SLASH: '/';
OPEN_CURLY: '{';
CLOSE_CURLY: '}';
BLOCKSPLITTER:'------';
TILT:'~';
HAT:'^';
SPLIT:'|';
//fragment PERIOD:[\.];

fragment CHAR: [a-zA-Z];
fragment DIGIT: [0-9];
ESCAPE: '\\'MINUS|'\\' COLON|'\\' TILT|'\\' HAT|'\\' SLASH|'\\' OPEN_CURLY|'\\' CLOSE_CURLY|'\\' SPLIT|'\\' SHARP;
SYMBOL: ([\.@_'?&$+-«»&%$"!;,()]);

WORD: CHAR+;
INT: DIGIT+;
STAR_CLASS: INT( [\.] [05])? '/' INT; //isto tem de ser visto pois pode ser 98.8/100 (ver exemplo)


