lexer grammar MarkdownLexer;

/* Single chars used by the parser.   */
SPACE: ' '->skip;
TAB: '\t';
NEWLINE: (('\r''\n' ) | '\n' | 'r');
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
DOUBLE_QUOTE: '"';
SINGLE_QUOTE: '\'';
// References.
COLON: ':';
// Entities.
SEMI_COLON: ';';
// Others.
SLASH: '/';
fragment PERIOD: [\.];
EQUAL: '=';
AMPERSAND: '&';
// Used by escapedChar.
BACKSLASH: '\\';
BACKTICK: '`';
PLUS: '+';
OPEN_CURLY: '{';
CLOSE_CURLY: '}';

BLOCKSPLITTER:'------';

fragment NORMAL_CHAR: [a-zA-Z@];
fragment DIGIT: [0-9];

STRING_LITERAL: (DIGIT | NORMAL_CHAR | PERIOD )+;
REAL: DIGIT PERIOD DIGIT;



