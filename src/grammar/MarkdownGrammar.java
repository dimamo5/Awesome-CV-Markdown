// Generated from C:/Users/diogo/IdeaProjects/markdown-cv/src/grammar\MarkdownGrammar.g4 by ANTLR 4.5.1
package grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownGrammar extends Parser {
	public static final int
			SPACE = 1, TAB = 2, NEWLINE = 3, CLOSE_ANGLE_BRACKET = 4, STAR = 5, SHARP = 6, SLASH = 7,
			OPEN_CURLY = 8, CLOSE_CURLY = 9, BLOCKSPLITTER = 10, HAT = 11, SPLIT = 12, EQUAL = 13,
			ESCAPE = 14, SYMBOL = 15, WORD = 16, INT = 17, STAR_CLASS = 18;
	public static final int
			RULE_cv = 0, RULE_info = 1, RULE_subHeader = 2, RULE_name = 3, RULE_address = 4,
			RULE_contacts = 5, RULE_block = 6, RULE_subBlock = 7, RULE_textBlock = 8,
			RULE_list = 9, RULE_blockList = 10, RULE_blockListCell = 11, RULE_table = 12,
			RULE_tableBody = 13, RULE_icon = 14, RULE_tableHeader = 15, RULE_tableCell = 16,
			RULE_tableLine = 17, RULE_blockName = 18, RULE_blockSubName = 19, RULE_any = 20,
			RULE_tablecontent = 21, RULE_word_space = 22;
	public static final String[] ruleNames = {
			"cv", "info", "subHeader", "name", "address", "contacts", "block", "subBlock",
			"textBlock", "list", "blockList", "blockListCell", "table", "tableBody",
			"icon", "tableHeader", "tableCell", "tableLine", "blockName", "blockSubName",
			"any", "tablecontent", "word_space"
	};
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24\u011b\4\2\t\2" +
					"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
					"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3" +
					"\2\6\2\64\n\2\r\2\16\2\65\3\2\3\2\3\2\6\2;\n\2\r\2\16\2<\6\2?\n\2\r\2" +
					"\16\2@\3\3\3\3\6\3E\n\3\r\3\16\3F\3\3\3\3\6\3K\n\3\r\3\16\3L\3\4\3\4\3" +
					"\4\3\4\7\4S\n\4\f\4\16\4V\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6" +
					"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7k\n\7\r\7\16\7l\3\b\3\b\3\b\6" +
					"\br\n\b\r\b\16\bs\3\t\3\t\5\tx\n\t\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\3\n" +
					"\3\n\3\n\5\n\u0084\n\n\6\n\u0086\n\n\r\n\16\n\u0087\3\13\3\13\6\13\u008c" +
					"\n\13\r\13\16\13\u008d\3\f\3\f\3\f\3\f\3\f\6\f\u0095\n\f\r\f\16\f\u0096" +
					"\5\f\u0099\n\f\3\f\6\f\u009c\n\f\r\f\16\f\u009d\3\r\3\r\5\r\u00a2\n\r" +
					"\3\r\5\r\u00a5\n\r\3\r\3\r\3\r\6\r\u00aa\n\r\r\r\16\r\u00ab\5\r\u00ae" +
					"\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\6\17\u00b8\n\17\r\17\16\17" +
					"\u00b9\3\20\3\20\3\20\7\20\u00bf\n\20\f\20\16\20\u00c2\13\20\3\20\5\20" +
					"\u00c5\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00cf\n\21\f" +
					"\21\16\21\u00d2\13\21\3\21\3\21\3\21\6\21\u00d7\n\21\r\21\16\21\u00d8" +
					"\3\22\3\22\3\22\3\23\3\23\6\23\u00e0\n\23\r\23\16\23\u00e1\3\24\3\24\3" +
					"\24\3\24\6\24\u00e8\n\24\r\24\16\24\u00e9\3\25\3\25\3\25\3\25\3\25\6\25" +
					"\u00f1\n\25\r\25\16\25\u00f2\3\26\3\26\3\26\3\26\3\26\6\26\u00fa\n\26" +
					"\r\26\16\26\u00fb\6\26\u00fe\n\26\r\26\16\26\u00ff\3\27\7\27\u0103\n\27" +
					"\f\27\16\27\u0106\13\27\3\27\3\27\3\27\3\27\6\27\u010c\n\27\r\27\16\27" +
					"\u010d\3\30\3\30\7\30\u0112\n\30\f\30\16\30\u0115\13\30\6\30\u0117\n\30" +
					"\r\30\16\30\u0118\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 " +
					"\"$&(*,.\2\2\u012b\2\60\3\2\2\2\4B\3\2\2\2\6N\3\2\2\2\b[\3\2\2\2\n`\3" +
					"\2\2\2\fe\3\2\2\2\16n\3\2\2\2\20u\3\2\2\2\22\u0080\3\2\2\2\24\u0089\3" +
					"\2\2\2\26\u008f\3\2\2\2\30\u009f\3\2\2\2\32\u00af\3\2\2\2\34\u00b7\3\2" +
					"\2\2\36\u00bb\3\2\2\2 \u00ca\3\2\2\2\"\u00da\3\2\2\2$\u00dd\3\2\2\2&\u00e3" +
					"\3\2\2\2(\u00eb\3\2\2\2*\u00fd\3\2\2\2,\u0104\3\2\2\2.\u0116\3\2\2\2\60" +
					"\61\5\4\3\2\61\63\7\f\2\2\62\64\7\5\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65" +
					"\63\3\2\2\2\65\66\3\2\2\2\66>\3\2\2\2\678\5\16\b\28:\7\f\2\29;\7\5\2\2" +
					":9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2>\67\3\2\2\2?@\3\2\2" +
					"\2@>\3\2\2\2@A\3\2\2\2A\3\3\2\2\2BD\5\b\5\2CE\5\6\4\2DC\3\2\2\2EF\3\2" +
					"\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HJ\5\n\6\2IK\5\f\7\2JI\3\2\2\2KL\3\2" +
					"\2\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2\2NO\b\4\1\2OP\7\b\2\2PT\7\b\2\2QS\7" +
					"\3\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\5" +
					".\30\2XY\b\4\1\2YZ\7\5\2\2Z\7\3\2\2\2[\\\7\b\2\2\\]\5.\30\2]^\b\5\1\2" +
					"^_\7\5\2\2_\t\3\2\2\2`a\7\7\2\2ab\5*\26\2bc\b\6\1\2cd\7\5\2\2d\13\3\2" +
					"\2\2ef\7\6\2\2fg\5\36\20\2gh\5*\26\2hj\b\7\1\2ik\7\5\2\2ji\3\2\2\2kl\3" +
					"\2\2\2lj\3\2\2\2lm\3\2\2\2m\r\3\2\2\2no\b\b\1\2oq\5&\24\2pr\5\20\t\2q" +
					"p\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\17\3\2\2\2uw\b\t\1\2vx\5(\25" +
					"\2wv\3\2\2\2wx\3\2\2\2x~\3\2\2\2y\177\5\24\13\2z\177\5\32\16\2{|\5\22" +
					"\n\2|}\b\t\1\2}\177\3\2\2\2~y\3\2\2\2~z\3\2\2\2~{\3\2\2\2\177\21\3\2\2" +
					"\2\u0080\u0085\b\n\1\2\u0081\u0083\5*\26\2\u0082\u0084\7\5\2\2\u0083\u0082" +
					"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0081\3\2\2\2\u0086" +
					"\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\23\3\2\2" +
					"\2\u0089\u008b\b\13\1\2\u008a\u008c\5\26\f\2\u008b\u008a\3\2\2\2\u008c" +
					"\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\25\3\2\2" +
					"\2\u008f\u0090\7\7\2\2\u0090\u0091\5*\26\2\u0091\u0098\b\f\1\2\u0092\u0099" +
					"\7\5\2\2\u0093\u0095\7\3\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096" +
					"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0092\3\2" +
					"\2\2\u0098\u0094\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c\5\30\r\2\u009b" +
					"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2" +
					"\2\2\u009e\27\3\2\2\2\u009f\u00a1\7\6\2\2\u00a0\u00a2\5\36\20\2\u00a1" +
					"\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5\5*" +
					"\26\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6" +
					"\u00ad\b\r\1\2\u00a7\u00ae\7\5\2\2\u00a8\u00aa\7\3\2\2\u00a9\u00a8\3\2" +
					"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac" +
					"\u00ae\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\31\3\2\2" +
					"\2\u00af\u00b0\b\16\1\2\u00b0\u00b1\5 \21\2\u00b1\u00b2\7\5\2\2\u00b2" +
					"\u00b3\5\34\17\2\u00b3\33\3\2\2\2\u00b4\u00b5\5$\23\2\u00b5\u00b6\7\5" +
					"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9" +
					"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\35\3\2\2\2\u00bb\u00bc\7\n\2" +
					"\2\u00bc\u00c0\7\22\2\2\u00bd\u00bf\7\3\2\2\u00be\u00bd\3\2\2\2\u00bf" +
					"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\3\2" +
					"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\7\24\2\2\u00c4\u00c3\3\2\2\2\u00c4" +
					"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\20\1\2\u00c7\u00c8\6" +
					"\20\2\3\u00c8\u00c9\7\13\2\2\u00c9\37\3\2\2\2\u00ca\u00cb\5.\30\2\u00cb" +
					"\u00d6\b\21\1\2\u00cc\u00d0\7\r\2\2\u00cd\u00cf\7\3\2\2\u00ce\u00cd\3" +
					"\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1" +
					"\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\5.\30\2\u00d4\u00d5\b\21" +
					"\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00cc\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8" +
					"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9!\3\2\2\2\u00da\u00db\5,\27\2" +
					"\u00db\u00dc\7\16\2\2\u00dc#\3\2\2\2\u00dd\u00df\b\23\1\2\u00de\u00e0" +
					"\5\"\22\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2" +
					"\u00e1\u00e2\3\2\2\2\u00e2%\3\2\2\2\u00e3\u00e4\7\b\2\2\u00e4\u00e5\5" +
					".\30\2\u00e5\u00e7\b\24\1\2\u00e6\u00e8\7\5\2\2\u00e7\u00e6\3\2\2\2\u00e8" +
					"\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\'\3\2\2\2" +
					"\u00eb\u00ec\7\b\2\2\u00ec\u00ed\7\b\2\2\u00ed\u00ee\5.\30\2\u00ee\u00f0" +
					"\b\25\1\2\u00ef\u00f1\7\5\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2" +
					"\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3)\3\2\2\2\u00f4\u00fe\7" +
					"\22\2\2\u00f5\u00fe\7\23\2\2\u00f6\u00fe\7\21\2\2\u00f7\u00fe\7\20\2\2" +
					"\u00f8\u00fa\7\3\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9" +
					"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd" +
					"\u00f5\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f9\3\2" +
					"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100" +
					"+\3\2\2\2\u0101\u0103\7\3\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2" +
					"\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010b\3\2\2\2\u0106\u0104" +
					"\3\2\2\2\u0107\u010c\5\36\20\2\u0108\u0109\5*\26\2\u0109\u010a\b\27\1" +
					"\2\u010a\u010c\3\2\2\2\u010b\u0107\3\2\2\2\u010b\u0108\3\2\2\2\u010c\u010d" +
					"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e-\3\2\2\2\u010f" +
					"\u0113\7\22\2\2\u0110\u0112\7\3\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3" +
					"\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0117\3\2\2\2\u0115" +
					"\u0113\3\2\2\2\u0116\u010f\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2" +
					"\2\2\u0118\u0119\3\2\2\2\u0119/\3\2\2\2&\65<@FLTlsw~\u0083\u0087\u008d" +
					"\u0096\u0098\u009d\u00a1\u00a4\u00ab\u00ad\u00b9\u00c0\u00c4\u00d0\u00d8" +
					"\u00e1\u00e9\u00f2\u00fb\u00fd\u00ff\u0104\u010b\u010d\u0113\u0118";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = {
			null, "' '", "'\t'", null, "'>'", "'*'", "'#'", "'/'", "'{'", "'}'", "'==='",
			"'^'", "'|'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
			null, "SPACE", "TAB", "NEWLINE", "CLOSE_ANGLE_BRACKET", "STAR", "SHARP",
			"SLASH", "OPEN_CURLY", "CLOSE_CURLY", "BLOCKSPLITTER", "HAT", "SPLIT",
			"EQUAL", "ESCAPE", "SYMBOL", "WORD", "INT", "STAR_CLASS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

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

	public data.Cv cv = new data.Cv();

	public MarkdownGrammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
		return "MarkdownGrammar.g4";
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
	public ATN getATN() {
		return _ATN;
	}

	public final CvContext cv() throws RecognitionException {
		CvContext _localctx = new CvContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(46);
				info();
				setState(47);
				match(BLOCKSPLITTER);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
				setState(48);
							match(NEWLINE);
						}
					}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				} while (_la == NEWLINE);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(53);
							block();
							setState(54);
							match(BLOCKSPLITTER);
							setState(56);
							_errHandler.sync(this);
							_la = _input.LA(1);
				do {
					{
						{
							setState(55);
							match(NEWLINE);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == NEWLINE);
						}
					}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				} while (_la == SHARP);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(64);
				name();
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(65);
							subHeader();
						}
					}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				} while (_la == SHARP);
				setState(70);
				address();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(71);
							contacts();
						}
					}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				} while (_la == CLOSE_ANGLE_BRACKET);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final SubHeaderContext subHeader() throws RecognitionException {
		SubHeaderContext _localctx = new SubHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				cv.info.newSub();
				setState(77);
				match(SHARP);
				setState(78);
				match(SHARP);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == SPACE) {
					{
						{
				setState(79);
							match(SPACE);
						}
					}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
				setState(85);
				((SubHeaderContext) _localctx).word_space = word_space();
				cv.info.addSub((((SubHeaderContext) _localctx).word_space != null ? _input.getText(((SubHeaderContext)
						_localctx).word_space.start, ((SubHeaderContext) _localctx).word_space.stop) : null));
				setState(87);
				match(NEWLINE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(89);
				match(SHARP);
				setState(90);
				((NameContext) _localctx).word_space = word_space();
				cv.info.addName((((NameContext) _localctx).word_space != null ? _input.getText(((NameContext)
						_localctx).word_space.start, ((NameContext) _localctx).word_space.stop) : null));
				setState(92);
				match(NEWLINE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(94);
				match(STAR);
				setState(95);
				((AddressContext) _localctx).any = any();
				cv.info.addAddress((((AddressContext) _localctx).any != null ? _input.getText(((AddressContext)
						_localctx).any.start, ((AddressContext) _localctx).any.stop) : null));
				setState(97);
				match(NEWLINE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ContactsContext contacts() throws RecognitionException {
		ContactsContext _localctx = new ContactsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_contacts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(99);
				match(CLOSE_ANGLE_BRACKET);
				setState(100);
				((ContactsContext) _localctx).icon = icon();
				setState(101);
				((ContactsContext) _localctx).any = any();
				cv.info.addContacts((((ContactsContext) _localctx).any != null ? _input.getText(((ContactsContext) _localctx).any.start, ((ContactsContext) _localctx).any.stop) : null), (((ContactsContext) _localctx).icon != null ? _input.getText(((ContactsContext) _localctx).icon.start, ((ContactsContext) _localctx).icon.stop) : null));
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
				setState(103);
							match(NEWLINE);
						}
					}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				} while (_la == NEWLINE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				cv.newBlock();
				setState(109);
				blockName();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(110);
							subBlock();
						}
					}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				}
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << STAR) | (1L << SHARP) | (1L <<
						ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final SubBlockContext subBlock() throws RecognitionException {
		SubBlockContext _localctx = new SubBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				cv.getBlock().newSubBlock();
				setState(117);
				_la = _input.LA(1);
				if (_la == SHARP) {
					{
						setState(116);
						blockSubName();
				}
				}

				setState(124);
				switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
					case 1: {
						setState(119);
						list();
				}
					break;
					case 2: {
						setState(120);
						table();
					}
					break;
					case 3: {
						setState(121);
						((SubBlockContext) _localctx).textBlock = textBlock();
						cv.getSubBlock().addText((((SubBlockContext) _localctx).textBlock != null ? _input.getText((
								(SubBlockContext) _localctx).textBlock.start, ((SubBlockContext) _localctx).textBlock
								.stop) : null));
					}
					break;
			}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TextBlockContext textBlock() throws RecognitionException {
		TextBlockContext _localctx = new TextBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_textBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				cv.getSubBlock().setType(data.SubBlock.BlockType.TEXT);
				setState(131);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(127);
								any();
								setState(129);
								_la = _input.LA(1);
								if (_la == NEWLINE) {
									{
										setState(128);
										match(NEWLINE);
						}
					}

							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
				} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				cv.getSubBlock().setType(data.SubBlock.BlockType.LIST);
				setState(137);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(136);
								blockList();
					}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
				} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final BlockListContext blockList() throws RecognitionException {
		BlockListContext _localctx = new BlockListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(141);
				match(STAR);
				setState(142);
				((BlockListContext) _localctx).any = any();
				cv.getList().addHeader((((BlockListContext) _localctx).any != null ? _input.getText((
						(BlockListContext) _localctx).any.start, ((BlockListContext) _localctx).any.stop) : null));
				setState(150);
				switch (_input.LA(1)) {
					case NEWLINE: {
						setState(144);
				match(NEWLINE);
					}
					break;
					case SPACE: {
						setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(145);
							match(SPACE);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == SPACE);
					}
					break;
					default:
						throw new NoViableAltException(this);
			}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(152);
							blockListCell();
						}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == CLOSE_ANGLE_BRACKET);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final BlockListCellContext blockListCell() throws RecognitionException {
		BlockListCellContext _localctx = new BlockListCellContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockListCell);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(157);
				match(CLOSE_ANGLE_BRACKET);
				setState(159);
				_la = _input.LA(1);
				if (_la == OPEN_CURLY) {
					{
						setState(158);
						((BlockListCellContext) _localctx).icon = icon();
				}
				}

				setState(162);
				switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
					case 1: {
						setState(161);
						((BlockListCellContext) _localctx).any = any();
				}
					break;
				}
				cv.getList().addListCell((((BlockListCellContext) _localctx).any != null ? _input.getText((
						(BlockListCellContext) _localctx).any.start, ((BlockListCellContext) _localctx).any.stop) : null), (((BlockListCellContext) _localctx).icon != null ? _input.getText(((BlockListCellContext) _localctx).icon.start, ((BlockListCellContext) _localctx).icon.stop) : null));
				setState(171);
				switch (_input.LA(1)) {
					case NEWLINE: {
				setState(165);
				match(NEWLINE);
					}
					break;
					case SPACE: {
						setState(167);
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
								case 1: {
									{
										setState(166);
										match(SPACE);
									}
								}
								break;
								default:
									throw new NoViableAltException(this);
							}
							setState(169);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
						} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
					}
					break;
					default:
						throw new NoViableAltException(this);
			}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
				cv.getSubBlock().setType(data.SubBlock.BlockType.TABLE);
				setState(174);
				tableHeader();
				setState(175);
				match(NEWLINE);
				setState(176);
				tableBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TableBodyContext tableBody() throws RecognitionException {
		TableBodyContext _localctx = new TableBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tableBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(181);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(178);
								tableLine();
								setState(179);
								match(NEWLINE);
					}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(183);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
				} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final IconContext icon() throws RecognitionException {
		IconContext _localctx = new IconContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_icon);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(185);
				match(OPEN_CURLY);
				setState(186);
				match(WORD);
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(187);
								match(SPACE);
					}
					}
				}
				setState(192);
				_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
				}
				setState(194);
				switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
					case 1: {
						setState(193);
						((IconContext) _localctx).STAR_CLASS = match(STAR_CLASS);
				}
					break;
			}
				String s = (((IconContext) _localctx).STAR_CLASS != null ? ((IconContext) _localctx).STAR_CLASS
						.getText() : null);
				if (s != null) {
					String[] ints = s.split("/"); float esquerda = Float.valueOf(ints[0].trim());
					float direita = Float.valueOf(ints[1].trim()); if (esquerda > direita) {
						System.err.println("Nr of stars cannot be bigger than total stars");
						((IconContext) _localctx).allow = false;
					} else ((IconContext) _localctx).allow = true;
				}
				setState(197);
				if (!(_localctx.allow)) throw new FailedPredicateException(this, "$allow");
				setState(198);
				match(CLOSE_CURLY);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TableHeaderContext tableHeader() throws RecognitionException {
		TableHeaderContext _localctx = new TableHeaderContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(200);
				((TableHeaderContext) _localctx).word_space = word_space();
				cv.getTable().addHeaderCell((((TableHeaderContext) _localctx).word_space != null ? _input.getText(((TableHeaderContext) _localctx).word_space.start, ((TableHeaderContext) _localctx).word_space.stop) : null));
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(202);
							match(HAT);
							setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
							while (_la == SPACE) {
					{
						{
							setState(203);
							match(SPACE);
					}
					}
								setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
							}
							setState(209);
							((TableHeaderContext) _localctx).word_space = word_space();
							cv.getTable().addHeaderCell((((TableHeaderContext) _localctx).word_space != null ? _input.getText(((TableHeaderContext) _localctx).word_space.start, ((TableHeaderContext) _localctx).word_space.stop) : null));
						}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == HAT);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TableCellContext tableCell() throws RecognitionException {
		TableCellContext _localctx = new TableCellContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tableCell);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(216);
				tablecontent();
				setState(217);
				match(SPLIT);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TableLineContext tableLine() throws RecognitionException {
		TableLineContext _localctx = new TableLineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tableLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				cv.getTable().addBodyLine();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(220);
							tableCell();
						}
					}
					setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				}
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << OPEN_CURLY) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final BlockNameContext blockName() throws RecognitionException {
		BlockNameContext _localctx = new BlockNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(225);
				match(SHARP);
				setState(226);
				((BlockNameContext) _localctx).word_space = word_space();
				cv.getBlock().addBlockName((((BlockNameContext) _localctx).word_space != null ? _input.getText((
						(BlockNameContext) _localctx).word_space.start, ((BlockNameContext) _localctx).word_space
						.stop) : null));
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(228);
							match(NEWLINE);
						}
					}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				} while (_la == NEWLINE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final BlockSubNameContext blockSubName() throws RecognitionException {
		BlockSubNameContext _localctx = new BlockSubNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blockSubName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(233);
				match(SHARP);
				setState(234);
				match(SHARP);
				setState(235);
				((BlockSubNameContext) _localctx).word_space = word_space();
				cv.getSubBlock().addSubBlockName((((BlockSubNameContext) _localctx).word_space != null ? _input
						.getText(((BlockSubNameContext) _localctx).word_space.start, ((BlockSubNameContext) _localctx)
								.word_space.stop) : null));
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(237);
							match(NEWLINE);
						}
					}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				} while (_la == NEWLINE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_any);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(251);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							setState(251);
							switch (_input.LA(1)) {
								case WORD: {
									setState(242);
									match(WORD);
								}
								break;
								case INT: {
									setState(243);
									match(INT);
								}
								break;
								case SYMBOL: {
									setState(244);
									match(SYMBOL);
								}
								break;
								case ESCAPE: {
									setState(245);
									match(ESCAPE);
								}
								break;
								case SPACE: {
									setState(247);
									_errHandler.sync(this);
									_alt = 1;
									do {
										switch (_alt) {
											case 1: {
												{
													setState(246);
													match(SPACE);
								}
								}
								break;
											default:
												throw new NoViableAltException(this);
							}
										setState(249);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
									} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
						}
						break;
								default:
									throw new NoViableAltException(this);
					}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(253);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
				} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TablecontentContext tablecontent() throws RecognitionException {
		TablecontentContext _localctx = new TablecontentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tablecontent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(255);
								match(SPACE);
					}
						}
				}
					setState(260);
				_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						setState(265);
						switch (_input.LA(1)) {
							case OPEN_CURLY:
					{
						setState(261);
						((TablecontentContext) _localctx).icon = icon();
					}
							break;
							case SPACE:
							case ESCAPE:
							case SYMBOL:
							case WORD:
							case INT: {
								setState(262);
								((TablecontentContext) _localctx).any = any();
								cv.getTable().addBodyCell((((TablecontentContext) _localctx).any != null ? _input
										.getText(((TablecontentContext) _localctx).any.start, ((TablecontentContext)
												_localctx).any.stop) : null), (((TablecontentContext) _localctx).icon != null ? _input.getText(((TablecontentContext) _localctx).icon.start, ((TablecontentContext) _localctx).icon.stop) : null));
							}
							break;
							default:
								throw new NoViableAltException(this);
				}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << OPEN_CURLY) | (1L << ESCAPE) |
						(1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Word_spaceContext word_space() throws RecognitionException {
		Word_spaceContext _localctx = new Word_spaceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_word_space);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(269);
							match(WORD);
							setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
							while (_la == SPACE) {
					{
						{
							setState(270);
							match(SPACE);
					}
					}
								setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
							}
						}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == WORD);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 14:
				return icon_sempred((IconContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean icon_sempred(IconContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return _localctx.allow;
		}
		return true;
	}

	public static class CvContext extends ParserRuleContext {
		public CvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public InfoContext info() {
			return getRuleContext(InfoContext.class, 0);
		}

		public List<TerminalNode> BLOCKSPLITTER() {
			return getTokens(MarkdownGrammar.BLOCKSPLITTER);
		}

		public TerminalNode BLOCKSPLITTER(int i) {
			return getToken(MarkdownGrammar.BLOCKSPLITTER, i);
		}

		public List<TerminalNode> NEWLINE() {
			return getTokens(MarkdownGrammar.NEWLINE);
		}

		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}

		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}

		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_cv;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterCv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitCv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitCv(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class InfoContext extends ParserRuleContext {
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public AddressContext address() {
			return getRuleContext(AddressContext.class, 0);
		}

		public List<SubHeaderContext> subHeader() {
			return getRuleContexts(SubHeaderContext.class);
		}

		public SubHeaderContext subHeader(int i) {
			return getRuleContext(SubHeaderContext.class, i);
		}

		public List<ContactsContext> contacts() {
			return getRuleContexts(ContactsContext.class);
		}

		public ContactsContext contacts(int i) {
			return getRuleContext(ContactsContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_info;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class SubHeaderContext extends ParserRuleContext {
		public Word_spaceContext word_space;
		public SubHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TerminalNode> SHARP() {
			return getTokens(MarkdownGrammar.SHARP);
		}

		public TerminalNode SHARP(int i) {
			return getToken(MarkdownGrammar.SHARP, i);
		}

		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class, 0);
		}

		public TerminalNode NEWLINE() {
			return getToken(MarkdownGrammar.NEWLINE, 0);
		}

		public List<TerminalNode> SPACE() {
			return getTokens(MarkdownGrammar.SPACE);
		}

		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_subHeader;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterSubHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitSubHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitSubHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NameContext extends ParserRuleContext {
		public Word_spaceContext word_space;
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode SHARP() {
			return getToken(MarkdownGrammar.SHARP, 0);
		}

		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class, 0);
		}

		public TerminalNode NEWLINE() {
			return getToken(MarkdownGrammar.NEWLINE, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_name;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AddressContext extends ParserRuleContext {
		public AnyContext any;
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode STAR() {
			return getToken(MarkdownGrammar.STAR, 0);
		}

		public AnyContext any() {
			return getRuleContext(AnyContext.class, 0);
		}

		public TerminalNode NEWLINE() {
			return getToken(MarkdownGrammar.NEWLINE, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_address;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ContactsContext extends ParserRuleContext {
		public IconContext icon;
		public AnyContext any;
		public ContactsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode CLOSE_ANGLE_BRACKET() {
			return getToken(MarkdownGrammar.CLOSE_ANGLE_BRACKET, 0);
		}

		public IconContext icon() {
			return getRuleContext(IconContext.class, 0);
		}

		public AnyContext any() {
			return getRuleContext(AnyContext.class, 0);
		}

		public List<TerminalNode> NEWLINE() {
			return getTokens(MarkdownGrammar.NEWLINE);
		}

		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_contacts;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterContacts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitContacts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitContacts(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public BlockNameContext blockName() {
			return getRuleContext(BlockNameContext.class, 0);
		}

		public List<SubBlockContext> subBlock() {
			return getRuleContexts(SubBlockContext.class);
		}

		public SubBlockContext subBlock(int i) {
			return getRuleContext(SubBlockContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_block;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class SubBlockContext extends ParserRuleContext {
		public TextBlockContext textBlock;
		public SubBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ListContext list() {
			return getRuleContext(ListContext.class, 0);
		}

		public TableContext table() {
			return getRuleContext(TableContext.class, 0);
		}

		public TextBlockContext textBlock() {
			return getRuleContext(TextBlockContext.class, 0);
		}

		public BlockSubNameContext blockSubName() {
			return getRuleContext(BlockSubNameContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_subBlock;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterSubBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitSubBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitSubBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TextBlockContext extends ParserRuleContext {
		public TextBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}

		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class, i);
		}

		public List<TerminalNode> NEWLINE() {
			return getTokens(MarkdownGrammar.NEWLINE);
		}

		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_textBlock;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterTextBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitTextBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitTextBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ListContext extends ParserRuleContext {
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<BlockListContext> blockList() {
			return getRuleContexts(BlockListContext.class);
		}

		public BlockListContext blockList(int i) {
			return getRuleContext(BlockListContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_list;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BlockListContext extends ParserRuleContext {
		public AnyContext any;
		public BlockListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode STAR() {
			return getToken(MarkdownGrammar.STAR, 0);
		}

		public AnyContext any() {
			return getRuleContext(AnyContext.class, 0);
		}

		public TerminalNode NEWLINE() {
			return getToken(MarkdownGrammar.NEWLINE, 0);
		}

		public List<BlockListCellContext> blockListCell() {
			return getRuleContexts(BlockListCellContext.class);
		}

		public BlockListCellContext blockListCell(int i) {
			return getRuleContext(BlockListCellContext.class, i);
		}

		public List<TerminalNode> SPACE() {
			return getTokens(MarkdownGrammar.SPACE);
		}

		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_blockList;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterBlockList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitBlockList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitBlockList(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BlockListCellContext extends ParserRuleContext {
		public IconContext icon;
		public AnyContext any;
		public BlockListCellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode CLOSE_ANGLE_BRACKET() {
			return getToken(MarkdownGrammar.CLOSE_ANGLE_BRACKET, 0);
		}

		public TerminalNode NEWLINE() {
			return getToken(MarkdownGrammar.NEWLINE, 0);
		}

		public IconContext icon() {
			return getRuleContext(IconContext.class, 0);
		}

		public AnyContext any() {
			return getRuleContext(AnyContext.class, 0);
		}

		public List<TerminalNode> SPACE() {
			return getTokens(MarkdownGrammar.SPACE);
		}

		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_blockListCell;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener)
				((MarkdownGrammarListener) listener).enterBlockListCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener)
				((MarkdownGrammarListener) listener).exitBlockListCell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitBlockListCell(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TableContext extends ParserRuleContext {
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TableHeaderContext tableHeader() {
			return getRuleContext(TableHeaderContext.class, 0);
		}

		public TerminalNode NEWLINE() {
			return getToken(MarkdownGrammar.NEWLINE, 0);
		}

		public TableBodyContext tableBody() {
			return getRuleContext(TableBodyContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_table;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TableBodyContext extends ParserRuleContext {
		public TableBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TableLineContext> tableLine() {
			return getRuleContexts(TableLineContext.class);
		}

		public TableLineContext tableLine(int i) {
			return getRuleContext(TableLineContext.class, i);
		}

		public List<TerminalNode> NEWLINE() {
			return getTokens(MarkdownGrammar.NEWLINE);
		}

		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tableBody;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterTableBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitTableBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitTableBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IconContext extends ParserRuleContext {
		public boolean allow = true;
		public Token STAR_CLASS;
		public IconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode OPEN_CURLY() {
			return getToken(MarkdownGrammar.OPEN_CURLY, 0);
		}

		public TerminalNode WORD() {
			return getToken(MarkdownGrammar.WORD, 0);
		}

		public TerminalNode CLOSE_CURLY() {
			return getToken(MarkdownGrammar.CLOSE_CURLY, 0);
		}

		public List<TerminalNode> SPACE() {
			return getTokens(MarkdownGrammar.SPACE);
		}

		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}

		public TerminalNode STAR_CLASS() {
			return getToken(MarkdownGrammar.STAR_CLASS, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_icon;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterIcon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitIcon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitIcon(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TableHeaderContext extends ParserRuleContext {
		public Word_spaceContext word_space;
		public TableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<Word_spaceContext> word_space() {
			return getRuleContexts(Word_spaceContext.class);
		}

		public Word_spaceContext word_space(int i) {
			return getRuleContext(Word_spaceContext.class, i);
		}

		public List<TerminalNode> HAT() {
			return getTokens(MarkdownGrammar.HAT);
		}

		public TerminalNode HAT(int i) {
			return getToken(MarkdownGrammar.HAT, i);
		}

		public List<TerminalNode> SPACE() {
			return getTokens(MarkdownGrammar.SPACE);
		}

		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tableHeader;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener)
				((MarkdownGrammarListener) listener).enterTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitTableHeader
					(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TableCellContext extends ParserRuleContext {
		public TableCellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TablecontentContext tablecontent() {
			return getRuleContext(TablecontentContext.class, 0);
		}

		public TerminalNode SPLIT() {
			return getToken(MarkdownGrammar.SPLIT, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tableCell;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterTableCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitTableCell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitTableCell(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TableLineContext extends ParserRuleContext {
		public TableLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TableCellContext> tableCell() {
			return getRuleContexts(TableCellContext.class);
		}

		public TableCellContext tableCell(int i) {
			return getRuleContext(TableCellContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tableLine;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterTableLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitTableLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitTableLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BlockNameContext extends ParserRuleContext {
		public Word_spaceContext word_space;
		public BlockNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode SHARP() {
			return getToken(MarkdownGrammar.SHARP, 0);
		}

		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class, 0);
		}

		public List<TerminalNode> NEWLINE() {
			return getTokens(MarkdownGrammar.NEWLINE);
		}

		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_blockName;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterBlockName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitBlockName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitBlockName(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BlockSubNameContext extends ParserRuleContext {
		public Word_spaceContext word_space;
		public BlockSubNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TerminalNode> SHARP() {
			return getTokens(MarkdownGrammar.SHARP);
		}

		public TerminalNode SHARP(int i) {
			return getToken(MarkdownGrammar.SHARP, i);
		}

		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class, 0);
		}

		public List<TerminalNode> NEWLINE() {
			return getTokens(MarkdownGrammar.NEWLINE);
		}

		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_blockSubName;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener)
				((MarkdownGrammarListener) listener).enterBlockSubName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener)
				((MarkdownGrammarListener) listener).exitBlockSubName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitBlockSubName(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AnyContext extends ParserRuleContext {
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TerminalNode> WORD() {
			return getTokens(MarkdownGrammar.WORD);
		}

		public TerminalNode WORD(int i) {
			return getToken(MarkdownGrammar.WORD, i);
		}

		public List<TerminalNode> INT() {
			return getTokens(MarkdownGrammar.INT);
		}

		public TerminalNode INT(int i) {
			return getToken(MarkdownGrammar.INT, i);
		}

		public List<TerminalNode> SYMBOL() {
			return getTokens(MarkdownGrammar.SYMBOL);
		}

		public TerminalNode SYMBOL(int i) {
			return getToken(MarkdownGrammar.SYMBOL, i);
		}

		public List<TerminalNode> ESCAPE() {
			return getTokens(MarkdownGrammar.ESCAPE);
		}

		public TerminalNode ESCAPE(int i) {
			return getToken(MarkdownGrammar.ESCAPE, i);
		}

		public List<TerminalNode> SPACE() {
			return getTokens(MarkdownGrammar.SPACE);
		}

		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_any;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TablecontentContext extends ParserRuleContext {
		public IconContext icon;
		public AnyContext any;
		public TablecontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TerminalNode> SPACE() {
			return getTokens(MarkdownGrammar.SPACE);
		}

		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}

		public List<IconContext> icon() {
			return getRuleContexts(IconContext.class);
		}

		public IconContext icon(int i) {
			return getRuleContext(IconContext.class, i);
		}

		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}

		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tablecontent;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener)
				((MarkdownGrammarListener) listener).enterTablecontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener)
				((MarkdownGrammarListener) listener).exitTablecontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitTablecontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Word_spaceContext extends ParserRuleContext {
		public Word_spaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TerminalNode> WORD() {
			return getTokens(MarkdownGrammar.WORD);
		}

		public TerminalNode WORD(int i) {
			return getToken(MarkdownGrammar.WORD, i);
		}

		public List<TerminalNode> SPACE() {
			return getTokens(MarkdownGrammar.SPACE);
		}

		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_word_space;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterWord_space(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitWord_space(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitWord_space(this);
			else return visitor.visitChildren(this);
		}
	}
}