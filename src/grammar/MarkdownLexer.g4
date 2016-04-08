lexer grammar MarkdownLexer;

/* Single chars used by the parser.   */
SPACE: ' '->skip;
TAB: '\t';
NEWLINE: ('\r'? '\n' )| '\n';
// Lists and horizontal rules.
EMPH: '*';
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
// Autolinks.
AT: '@';
// Others.
SLASH: '/';
PERIOD: '.';
EQUAL: '=';
AMPERSAND: '&';
// Used by escapedChar.
BACKSLASH: '\\';
BACKTICK: '`';
PLUS: '+';
OPEN_CURLY: '{';
CLOSE_CURLY: '}';

NORMAL_CHAR: [a-zA-Z];
STRING_LITERAL:NORMAL_CHAR([a-zA-Z0-9])*;
DIGIT: [0-9];
NUMBER:DIGIT+;