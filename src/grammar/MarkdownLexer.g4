lexer grammar MarkdownLexer;

/* Single chars used by the parser.   */
SPACE: ' '->skip;
TAB: '\t';
NEWLINE: ('\n' | '\r')+;
// Lists and horizontal rules.
STAR: '*';
MINUS: '-';
UNDERSCORE: '_';
// Blockquotes.
CLOSE_ANGLE_BRACKET: '>';
OPEN_ANGLE_BRACKET:'<';
//Headers
SHARP: '#';
// Links.
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_SB: '[';
CLOSE_SB: ']';
// References.
COLON: ':';
// Entities.
SEMI_COLON: ';';
// Others.
SLASH: '/';
OPEN_CURLY: '{';
CLOSE_CURLY: '}';
BLOCKSPLITTER:'------';

PERIOD: [\.];
fragment NORMAL_CHAR: [a-zA-Z@];
fragment DIGIT: [0-9];

WORD: (NORMAL_CHAR)+;
FLOAT:INT PERIOD INT;
INT: DIGIT+;



