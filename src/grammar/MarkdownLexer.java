// Generated from C:/Users/Utilizador/Desktop/MIEIC/3� ano/2� semestre/COMP/markdown-dsl/src/grammar\MarkdownLexer.g4
// by ANTLR 4.5.1
package grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownLexer extends Lexer {
    public static final int
            SPACE = 1, TAB = 2, NEWLINE = 3, STAR = 4, MINUS = 5, COLON = 6, CLOSE_ANGLE_BRACKET = 7,
            OPEN_ANGLE_BRACKET = 8, SHARP = 9, OPEN_SB = 10, CLOSE_SB = 11, SLASH = 12, OPEN_CURLY = 13,
            CLOSE_CURLY = 14, BLOCKSPLITTER = 15, TILT = 16, HAT = 17, SPLIT = 18, ESCAPE = 19,
            SYMBOL = 20, WORD = 21, INT = 22, STAR_CLASS = 23;
    public static final String[] ruleNames = {
            "SPACE", "TAB", "NEWLINE", "STAR", "MINUS", "COLON", "CLOSE_ANGLE_BRACKET",
            "OPEN_ANGLE_BRACKET", "SHARP", "OPEN_SB", "CLOSE_SB", "SLASH", "OPEN_CURLY",
            "CLOSE_CURLY", "BLOCKSPLITTER", "TILT", "HAT", "SPLIT", "CHAR", "DIGIT",
            "ESCAPE", "SYMBOL", "WORD", "INT", "STAR_CLASS"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u008d\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\6\4;\n\4\r\4\16\4<\3\5\3\5\3\6\3\6" +
                    "\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3" +
                    "\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3" +
                    "\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3" +
                    "\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26x\n\26\3\27\3\27\3\30" +
                    "\6\30}\n\30\r\30\16\30~\3\31\6\31\u0082\n\31\r\31\16\31\u0083\3\32\3\32" +
                    "\3\32\5\32\u0089\n\32\3\32\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17" +
                    "\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\25" +
                    "-\26/\27\61\30\63\31\3\2\b\4\2\f\f\17\17\5\2C\\c|\u00c2\u0101\3\2\62;" +
                    "\5\2#$&+-\u00c4\4\2\60\60^^\4\2\62\62\67\67\u0096\2\3\3\2\2\2\2\5\3\2" +
                    "\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21" +
                    "\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2" +
                    "\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2+\3\2" +
                    "\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67" +
                    "\3\2\2\2\7:\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21F" +
                    "\3\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31N\3\2\2\2\33P\3\2\2\2\35" +
                    "R\3\2\2\2\37T\3\2\2\2![\3\2\2\2#]\3\2\2\2%_\3\2\2\2\'a\3\2\2\2)c\3\2\2" +
                    "\2+w\3\2\2\2-y\3\2\2\2/|\3\2\2\2\61\u0081\3\2\2\2\63\u0085\3\2\2\2\65" +
                    "\66\7\"\2\2\66\4\3\2\2\2\678\7\13\2\28\6\3\2\2\29;\t\2\2\2:9\3\2\2\2;" +
                    "<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\b\3\2\2\2>?\7,\2\2?\n\3\2\2\2@A\7/\2\2" +
                    "A\f\3\2\2\2BC\7<\2\2C\16\3\2\2\2DE\7@\2\2E\20\3\2\2\2FG\7>\2\2G\22\3\2" +
                    "\2\2HI\7%\2\2I\24\3\2\2\2JK\7]\2\2K\26\3\2\2\2LM\7_\2\2M\30\3\2\2\2NO" +
                    "\7\61\2\2O\32\3\2\2\2PQ\7}\2\2Q\34\3\2\2\2RS\7\177\2\2S\36\3\2\2\2TU\7" +
                    "/\2\2UV\7/\2\2VW\7/\2\2WX\7/\2\2XY\7/\2\2YZ\7/\2\2Z \3\2\2\2[\\\7\u0080" +
                    "\2\2\\\"\3\2\2\2]^\7`\2\2^$\3\2\2\2_`\7~\2\2`&\3\2\2\2ab\t\3\2\2b(\3\2" +
                    "\2\2cd\t\4\2\2d*\3\2\2\2ef\7^\2\2fx\5\13\6\2gh\7^\2\2hx\5\r\7\2ij\7^\2" +
                    "\2jx\5!\21\2kl\7^\2\2lx\5#\22\2mn\7^\2\2nx\5\31\r\2op\7^\2\2px\5\33\16" +
                    "\2qr\7^\2\2rx\5\35\17\2st\7^\2\2tx\5%\23\2uv\7^\2\2vx\5\23\n\2we\3\2\2" +
                    "\2wg\3\2\2\2wi\3\2\2\2wk\3\2\2\2wm\3\2\2\2wo\3\2\2\2wq\3\2\2\2ws\3\2\2" +
                    "\2wu\3\2\2\2x,\3\2\2\2yz\t\5\2\2z.\3\2\2\2{}\5\'\24\2|{\3\2\2\2}~\3\2" +
                    "\2\2~|\3\2\2\2~\177\3\2\2\2\177\60\3\2\2\2\u0080\u0082\5)\25\2\u0081\u0080" +
                    "\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084" +
                    "\62\3\2\2\2\u0085\u0088\5\61\31\2\u0086\u0087\t\6\2\2\u0087\u0089\t\7" +
                    "\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a" +
                    "\u008b\7\61\2\2\u008b\u008c\5\61\31\2\u008c\64\3\2\2\2\b\2<w~\u0083\u0088" +
                    "\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "' '", "'\t'", null, "'*'", "'-'", "':'", "'>'", "'<'", "'#'", "'['",
            "']'", "'/'", "'{'", "'}'", "'------'", "'~'", "'^'", "'|'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "SPACE", "TAB", "NEWLINE", "STAR", "MINUS", "COLON", "CLOSE_ANGLE_BRACKET",
            "OPEN_ANGLE_BRACKET", "SHARP", "OPEN_SB", "CLOSE_SB", "SLASH", "OPEN_CURLY",
            "CLOSE_CURLY", "BLOCKSPLITTER", "TILT", "HAT", "SPLIT", "ESCAPE", "SYMBOL",
            "WORD", "INT", "STAR_CLASS"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public MarkdownLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "MarkdownLexer.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}