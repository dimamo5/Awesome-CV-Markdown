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
			SPACE = 1, TAB = 2, NEWLINE = 3, STAR = 4, MINUS = 5, COLON = 6, CLOSE_ANGLE_BRACKET = 7,
			OPEN_ANGLE_BRACKET = 8, SHARP = 9, OPEN_SB = 10, CLOSE_SB = 11, SLASH = 12, OPEN_CURLY = 13,
			CLOSE_CURLY = 14, BLOCKSPLITTER = 15, TILT = 16, HAT = 17, SPLIT = 18, ESCAPE = 19,
			SYMBOL = 20, WORD = 21, INT = 22, STAR_CLASS = 23;
	public static final int
			RULE_cv = 0, RULE_info = 1, RULE_subHeader = 2, RULE_name = 3, RULE_address = 4,
			RULE_contacts = 5, RULE_block = 6, RULE_subBlock = 7, RULE_textBlock = 8,
			RULE_list = 9, RULE_blockList = 10, RULE_blockListCell = 11, RULE_table = 12,
			RULE_tableBody = 13, RULE_icon = 14, RULE_boldText = 15, RULE_tableHeader = 16,
			RULE_tableCell = 17, RULE_tableLine = 18, RULE_blockName = 19, RULE_blockSubName = 20,
			RULE_any = 21, RULE_tablecontent = 22, RULE_word_space = 23;
	public static final String[] ruleNames = {
			"cv", "info", "subHeader", "name", "address", "contacts", "block", "subBlock",
			"textBlock", "list", "blockList", "blockListCell", "table", "tableBody",
			"icon", "boldText", "tableHeader", "tableCell", "tableLine", "blockName",
			"blockSubName", "any", "tablecontent", "word_space"
	};
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0124\4\2\t\2" +
					"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
					"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
					"\3\2\3\2\3\2\6\2\66\n\2\r\2\16\2\67\3\2\3\2\3\2\6\2=\n\2\r\2\16\2>\6\2" +
					"A\n\2\r\2\16\2B\3\3\3\3\6\3G\n\3\r\3\16\3H\3\3\3\3\6\3M\n\3\r\3\16\3N" +
					"\3\4\3\4\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3" +
					"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7m\n\7\r\7\16\7n\3\b" +
					"\3\b\3\b\6\bt\n\b\r\b\16\bu\3\t\3\t\3\t\5\t{\n\t\3\t\3\t\5\t\177\n\t\3" +
					"\t\3\t\3\t\3\t\3\t\5\t\u0086\n\t\3\n\3\n\3\n\5\n\u008b\n\n\6\n\u008d\n" +
					"\n\r\n\16\n\u008e\3\13\3\13\6\13\u0093\n\13\r\13\16\13\u0094\3\f\3\f\3" +
					"\f\3\f\3\f\6\f\u009c\n\f\r\f\16\f\u009d\3\r\3\r\5\r\u00a2\n\r\3\r\5\r" +
					"\u00a5\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\6\17\u00b2" +
					"\n\17\r\17\16\17\u00b3\3\20\3\20\3\20\7\20\u00b9\n\20\f\20\16\20\u00bc" +
					"\13\20\3\20\5\20\u00bf\n\20\3\20\3\20\3\20\3\20\3\21\3\21\6\21\u00c7\n" +
					"\21\r\21\16\21\u00c8\3\21\6\21\u00cc\n\21\r\21\16\21\u00cd\3\22\3\22\3" +
					"\22\3\22\7\22\u00d4\n\22\f\22\16\22\u00d7\13\22\3\22\3\22\3\22\6\22\u00dc" +
					"\n\22\r\22\16\22\u00dd\3\23\3\23\3\23\3\24\3\24\6\24\u00e5\n\24\r\24\16" +
					"\24\u00e6\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u00ef\n\25\r\25\16\25\u00f0" +
					"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u00fa\n\26\r\26\16\26\u00fb\3" +
					"\27\3\27\3\27\3\27\3\27\6\27\u0103\n\27\r\27\16\27\u0104\6\27\u0107\n" +
					"\27\r\27\16\27\u0108\3\30\7\30\u010c\n\30\f\30\16\30\u010f\13\30\3\30" +
					"\3\30\3\30\3\30\6\30\u0115\n\30\r\30\16\30\u0116\3\31\3\31\7\31\u011b" +
					"\n\31\f\31\16\31\u011e\13\31\6\31\u0120\n\31\r\31\16\31\u0121\3\31\2\2" +
					"\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\2\u0132\2\62" +
					"\3\2\2\2\4D\3\2\2\2\6P\3\2\2\2\b]\3\2\2\2\nb\3\2\2\2\fg\3\2\2\2\16p\3" +
					"\2\2\2\20w\3\2\2\2\22\u0087\3\2\2\2\24\u0090\3\2\2\2\26\u0096\3\2\2\2" +
					"\30\u009f\3\2\2\2\32\u00a9\3\2\2\2\34\u00b1\3\2\2\2\36\u00b5\3\2\2\2 " +
					"\u00c4\3\2\2\2\"\u00cf\3\2\2\2$\u00df\3\2\2\2&\u00e2\3\2\2\2(\u00e8\3" +
					"\2\2\2*\u00f2\3\2\2\2,\u0106\3\2\2\2.\u010d\3\2\2\2\60\u011f\3\2\2\2\62" +
					"\63\5\4\3\2\63\65\7\21\2\2\64\66\7\5\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67" +
					"\65\3\2\2\2\678\3\2\2\28@\3\2\2\29:\5\16\b\2:<\7\21\2\2;=\7\5\2\2<;\3" +
					"\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@9\3\2\2\2AB\3\2\2\2B@\3" +
					"\2\2\2BC\3\2\2\2C\3\3\2\2\2DF\5\b\5\2EG\5\6\4\2FE\3\2\2\2GH\3\2\2\2HF" +
					"\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JL\5\n\6\2KM\5\f\7\2LK\3\2\2\2MN\3\2\2\2N" +
					"L\3\2\2\2NO\3\2\2\2O\5\3\2\2\2PQ\b\4\1\2QR\7\13\2\2RV\7\13\2\2SU\7\3\2" +
					"\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\5\60" +
					"\31\2Z[\b\4\1\2[\\\7\5\2\2\\\7\3\2\2\2]^\7\13\2\2^_\5\60\31\2_`\b\5\1" +
					"\2`a\7\5\2\2a\t\3\2\2\2bc\7\6\2\2cd\5,\27\2de\b\6\1\2ef\7\5\2\2f\13\3" +
					"\2\2\2gh\7\t\2\2hi\5\36\20\2ij\5,\27\2jl\b\7\1\2km\7\5\2\2lk\3\2\2\2m" +
					"n\3\2\2\2nl\3\2\2\2no\3\2\2\2o\r\3\2\2\2pq\b\b\1\2qs\5(\25\2rt\5\20\t" +
					"\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\17\3\2\2\2w~\b\t\1\2xz\5*" +
					"\26\2y{\5 \21\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\t\1\2}\177\3\2\2\2~" +
					"x\3\2\2\2~\177\3\2\2\2\177\u0085\3\2\2\2\u0080\u0086\5\24\13\2\u0081\u0086" +
					"\5\32\16\2\u0082\u0083\5\22\n\2\u0083\u0084\b\t\1\2\u0084\u0086\3\2\2" +
					"\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0086\21" +
					"\3\2\2\2\u0087\u008c\b\n\1\2\u0088\u008a\5,\27\2\u0089\u008b\7\5\2\2\u008a" +
					"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u0088\3\2" +
					"\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f" +
					"\23\3\2\2\2\u0090\u0092\b\13\1\2\u0091\u0093\5\26\f\2\u0092\u0091\3\2" +
					"\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095" +
					"\25\3\2\2\2\u0096\u0097\7\6\2\2\u0097\u0098\5,\27\2\u0098\u0099\b\f\1" +
					"\2\u0099\u009b\7\5\2\2\u009a\u009c\5\30\r\2\u009b\u009a\3\2\2\2\u009c" +
					"\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\27\3\2\2" +
					"\2\u009f\u00a1\7\b\2\2\u00a0\u00a2\5\36\20\2\u00a1\u00a0\3\2\2\2\u00a1" +
					"\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5\5,\27\2\u00a4\u00a3\3\2" +
					"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\r\1\2\u00a7" +
					"\u00a8\7\5\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\b\16\1\2\u00aa\u00ab\5\"\22" +
					"\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad\5\34\17\2\u00ad\33\3\2\2\2\u00ae\u00af" +
					"\5&\24\2\u00af\u00b0\7\5\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2" +
					"\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\35\3\2\2" +
					"\2\u00b5\u00b6\7\17\2\2\u00b6\u00ba\7\27\2\2\u00b7\u00b9\7\3\2\2\u00b8" +
					"\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2" +
					"\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\7\31\2\2\u00be" +
					"\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\20" +
					"\1\2\u00c1\u00c2\6\20\2\3\u00c2\u00c3\7\20\2\2\u00c3\37\3\2\2\2\u00c4" +
					"\u00c6\7\22\2\2\u00c5\u00c7\5,\27\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3" +
					"\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca" +
					"\u00cc\7\5\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2" +
					"\2\2\u00cd\u00ce\3\2\2\2\u00ce!\3\2\2\2\u00cf\u00d0\5\60\31\2\u00d0\u00db" +
					"\b\22\1\2\u00d1\u00d5\7\23\2\2\u00d2\u00d4\7\3\2\2\u00d3\u00d2\3\2\2\2" +
					"\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8" +
					"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\5\60\31\2\u00d9\u00da\b\22\1" +
					"\2\u00da\u00dc\3\2\2\2\u00db\u00d1\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db" +
					"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de#\3\2\2\2\u00df\u00e0\5.\30\2\u00e0" +
					"\u00e1\7\24\2\2\u00e1%\3\2\2\2\u00e2\u00e4\b\24\1\2\u00e3\u00e5\5$\23" +
					"\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7" +
					"\3\2\2\2\u00e7\'\3\2\2\2\u00e8\u00e9\7\13\2\2\u00e9\u00ea\7\13\2\2\u00ea" +
					"\u00eb\7\13\2\2\u00eb\u00ec\5\60\31\2\u00ec\u00ee\b\25\1\2\u00ed\u00ef" +
					"\7\5\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0" +
					"\u00f1\3\2\2\2\u00f1)\3\2\2\2\u00f2\u00f3\7\13\2\2\u00f3\u00f4\7\13\2" +
					"\2\u00f4\u00f5\7\13\2\2\u00f5\u00f6\7\13\2\2\u00f6\u00f7\5\60\31\2\u00f7" +
					"\u00f9\b\26\1\2\u00f8\u00fa\7\5\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3" +
					"\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc+\3\2\2\2\u00fd\u0107" +
					"\7\27\2\2\u00fe\u0107\7\30\2\2\u00ff\u0107\7\26\2\2\u0100\u0107\7\25\2" +
					"\2\u0101\u0103\7\3\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102" +
					"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u00fd\3\2\2\2\u0106" +
					"\u00fe\3\2\2\2\u0106\u00ff\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0102\3\2" +
					"\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109" +
					"-\3\2\2\2\u010a\u010c\7\3\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2" +
					"\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0114\3\2\2\2\u010f\u010d" +
					"\3\2\2\2\u0110\u0115\5\36\20\2\u0111\u0112\5,\27\2\u0112\u0113\b\30\1" +
					"\2\u0113\u0115\3\2\2\2\u0114\u0110\3\2\2\2\u0114\u0111\3\2\2\2\u0115\u0116" +
					"\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117/\3\2\2\2\u0118" +
					"\u011c\7\27\2\2\u0119\u011b\7\3\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3" +
					"\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0120\3\2\2\2\u011e" +
					"\u011c\3\2\2\2\u011f\u0118\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2" +
					"\2\2\u0121\u0122\3\2\2\2\u0122\61\3\2\2\2%\67>BHNVnuz~\u0085\u008a\u008e" +
					"\u0094\u009d\u00a1\u00a4\u00b3\u00ba\u00be\u00c8\u00cd\u00d5\u00dd\u00e6" +
					"\u00f0\u00fb\u0104\u0106\u0108\u010d\u0114\u0116\u011c\u0121";
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
				setState(48);
				info();
				setState(49);
				match(BLOCKSPLITTER);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(50);
							match(NEWLINE);
						}
					}
					setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				} while (_la == NEWLINE);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(55);
							block();
							setState(56);
				match(BLOCKSPLITTER);
							setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(57);
							match(NEWLINE);
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == NEWLINE);
						}
					}
					setState(64);
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
				setState(66);
				name();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(67);
							subHeader();
						}
					}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				} while (_la == SHARP);
				setState(72);
				address();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(73);
							contacts();
						}
					}
					setState(76);
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
				setState(79);
				match(SHARP);
				setState(80);
				match(SHARP);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == SPACE) {
					{
						{
							setState(81);
							match(SPACE);
						}
					}
					setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
				setState(87);
				((SubHeaderContext) _localctx).word_space = word_space();
				cv.info.addSub((((SubHeaderContext) _localctx).word_space != null ? _input.getText(((SubHeaderContext)
						_localctx).word_space.start, ((SubHeaderContext) _localctx).word_space.stop) : null));
				setState(89);
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
				setState(91);
				match(SHARP);
				setState(92);
				((NameContext) _localctx).word_space = word_space();
				cv.info.addName((((NameContext) _localctx).word_space != null ? _input.getText(((NameContext)
						_localctx).word_space.start, ((NameContext) _localctx).word_space.stop) : null));
				setState(94);
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
				setState(96);
				match(STAR);
				setState(97);
				((AddressContext) _localctx).any = any();
				cv.info.addAddress((((AddressContext) _localctx).any != null ? _input.getText(((AddressContext)
						_localctx).any.start, ((AddressContext) _localctx).any.stop) : null));
				setState(99);
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
				setState(101);
				match(CLOSE_ANGLE_BRACKET);
				setState(102);
				((ContactsContext) _localctx).icon = icon();
				setState(103);
				((ContactsContext) _localctx).any = any();
				cv.info.addContacts((((ContactsContext) _localctx).any != null ? _input.getText(((ContactsContext) _localctx).any.start, ((ContactsContext) _localctx).any.stop) : null), (((ContactsContext) _localctx).icon != null ? _input.getText(((ContactsContext) _localctx).icon.start, ((ContactsContext) _localctx).icon.stop) : null));
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(105);
							match(NEWLINE);
						}
					}
					setState(108);
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
				setState(111);
				blockName();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(112);
							subBlock();
						}
					}
					setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				}
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << STAR) | (1L << SHARP) | (1L
						<< ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0));
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
				setState(124);
				_la = _input.LA(1);
				if (_la == SHARP) {
					{
						setState(118);
						blockSubName();
						setState(120);
				_la = _input.LA(1);
						if (_la == TILT) {
					{
						setState(119);
						((SubBlockContext) _localctx).boldText = boldText();
					}
				}

						cv.getSubBlock().addBoldText((((SubBlockContext) _localctx).boldText != null ? _input.getText(
								((SubBlockContext) _localctx).boldText.start, ((SubBlockContext) _localctx).boldText
										.stop) : null));
				}
			}

				setState(131);
				switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
					case 1: {
						setState(126);
						list();
					}
					break;
					case 2: {
				setState(127);
						table();
				}
					break;
					case 3: {
						setState(128);
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
				setState(138);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(134);
								any();
								setState(136);
								_la = _input.LA(1);
								if (_la == NEWLINE) {
									{
										setState(135);
										match(NEWLINE);
									}
					}

					}
						}
					break;
						default:
							throw new NoViableAltException(this);
					}
					setState(140);
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

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				cv.getSubBlock().setType(data.SubBlock.BlockType.LIST);
				setState(144);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(143);
								blockList();
					}
					}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(146);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
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
				setState(148);
				match(STAR);
				setState(149);
				((BlockListContext) _localctx).any = any();
				cv.getList().addHeader((((BlockListContext) _localctx).any != null ? _input.getText((
						(BlockListContext) _localctx).any.start, ((BlockListContext) _localctx).any.stop) : null));
				setState(151);
				match(NEWLINE);
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
				} while (_la == COLON);
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
			enterOuterAlt(_localctx, 1);
			{
				setState(157);
				match(COLON);
				setState(159);
				_la = _input.LA(1);
				if (_la == OPEN_CURLY) {
					{
						setState(158);
						((BlockListCellContext) _localctx).icon = icon();
				}
				}

				setState(162);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << ESCAPE) | (1L << SYMBOL) | (1L <<
						WORD) | (1L << INT))) != 0)) {
					{
						setState(161);
						((BlockListCellContext) _localctx).any = any();
				}
				}

				cv.getList().addListCell((((BlockListCellContext) _localctx).any != null ? _input.getText(((BlockListCellContext) _localctx).any.start, ((BlockListCellContext) _localctx).any.stop) : null), (((BlockListCellContext) _localctx).icon != null ? _input.getText(((BlockListCellContext) _localctx).icon.start, ((BlockListCellContext) _localctx).icon.stop) : null));
				setState(165);
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

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
				cv.getSubBlock().setType(data.SubBlock.BlockType.TABLE);
				setState(168);
				tableHeader();
				setState(169);
				match(NEWLINE);
				setState(170);
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
				setState(175);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(172);
								tableLine();
								setState(173);
								match(NEWLINE);
					}
					}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
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
				setState(179);
				match(OPEN_CURLY);
				setState(180);
				match(WORD);
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(181);
								match(SPACE);
					}
						}
				}
					setState(186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
			}
				setState(188);
				switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
					case 1: {
						setState(187);
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
				setState(191);
				if (!(_localctx.allow)) throw new FailedPredicateException(this, "$allow");
				setState(192);
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

	public final BoldTextContext boldText() throws RecognitionException {
		BoldTextContext _localctx = new BoldTextContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boldText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(194);
				match(TILT);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(195);
							any();
				}
				}
					setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				}
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << ESCAPE) | (1L << SYMBOL) | (1L
						<< WORD) | (1L << INT))) != 0));
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(200);
							match(NEWLINE);
				}
				}
					setState(203);
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

	public final TableHeaderContext tableHeader() throws RecognitionException {
		TableHeaderContext _localctx = new TableHeaderContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(205);
				((TableHeaderContext) _localctx).word_space = word_space();
				cv.getTable().addHeaderCell((((TableHeaderContext) _localctx).word_space != null ? _input.getText(((TableHeaderContext) _localctx).word_space.start, ((TableHeaderContext) _localctx).word_space.stop) : null));
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(207);
							match(HAT);
							setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
							while (_la == SPACE) {
					{
					{
						setState(208);
						match(SPACE);
					}
					}
								setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
							}
							setState(214);
							((TableHeaderContext) _localctx).word_space = word_space();
							cv.getTable().addHeaderCell((((TableHeaderContext) _localctx).word_space != null ? _input
									.getText(((TableHeaderContext) _localctx).word_space.start, ((TableHeaderContext)
											_localctx).word_space.stop) : null));
						}
					}
					setState(219);
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
		enterRule(_localctx, 34, RULE_tableCell);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(221);
				tablecontent();
				setState(222);
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
		enterRule(_localctx, 36, RULE_tableLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				cv.getTable().addBodyLine();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(225);
							tableCell();
						}
					}
					setState(228);
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
		enterRule(_localctx, 38, RULE_blockName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(230);
				match(SHARP);
				setState(231);
				match(SHARP);
				setState(232);
				match(SHARP);
				setState(233);
				((BlockNameContext) _localctx).word_space = word_space();
				cv.getBlock().addBlockName((((BlockNameContext) _localctx).word_space != null ? _input.getText((
						(BlockNameContext) _localctx).word_space.start, ((BlockNameContext) _localctx).word_space
						.stop) : null));
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(235);
							match(NEWLINE);
						}
					}
					setState(238);
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
		enterRule(_localctx, 40, RULE_blockSubName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(240);
				match(SHARP);
				setState(241);
				match(SHARP);
				setState(242);
				match(SHARP);
				setState(243);
				match(SHARP);
				setState(244);
				((BlockSubNameContext) _localctx).word_space = word_space();
				cv.getSubBlock().addSubBlockName((((BlockSubNameContext) _localctx).word_space != null ? _input
						.getText(((BlockSubNameContext) _localctx).word_space.start, ((BlockSubNameContext) _localctx)
								.word_space.stop) : null));
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(246);
							match(NEWLINE);
						}
					}
					setState(249);
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
		enterRule(_localctx, 42, RULE_any);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(260);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							setState(260);
							switch (_input.LA(1)) {
								case WORD: {
									setState(251);
									match(WORD);
								}
								break;
								case INT: {
									setState(252);
									match(INT);
								}
								break;
								case SYMBOL: {
									setState(253);
									match(SYMBOL);
								}
								break;
								case ESCAPE: {
									setState(254);
									match(ESCAPE);
								}
								break;
								case SPACE: {
									setState(256);
									_errHandler.sync(this);
									_alt = 1;
									do {
										switch (_alt) {
											case 1: {
												{
													setState(255);
													match(SPACE);
								}
								}
								break;
											default:
												throw new NoViableAltException(this);
							}
										setState(258);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
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
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
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
		enterRule(_localctx, 44, RULE_tablecontent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(264);
								match(SPACE);
					}
						}
				}
					setState(269);
				_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						setState(274);
						switch (_input.LA(1)) {
							case OPEN_CURLY:
					{
						setState(270);
						((TablecontentContext) _localctx).icon = icon();
					}
							break;
							case SPACE:
							case ESCAPE:
							case SYMBOL:
							case WORD:
							case INT:
					{
						setState(271);
						((TablecontentContext) _localctx).any = any();
						cv.getTable().addBodyCell((((TablecontentContext) _localctx).any != null ? _input.getText(((TablecontentContext) _localctx).any.start, ((TablecontentContext) _localctx).any.stop) : null), (((TablecontentContext) _localctx).icon != null ? _input.getText(((TablecontentContext) _localctx).icon.start, ((TablecontentContext) _localctx).icon.stop) : null));
					}
							break;
							default:
								throw new NoViableAltException(this);
				}
				}
					setState(276);
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

	public final Word_spaceContext word_space() throws RecognitionException {
		Word_spaceContext _localctx = new Word_spaceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_word_space);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(278);
							match(WORD);
							setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
							while (_la == SPACE) {
					{
					{
						setState(279);
						match(SPACE);
					}
					}
								setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
							}
						}
					}
					setState(287);
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
		public BoldTextContext boldText;
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

		public BoldTextContext boldText() {
			return getRuleContext(BoldTextContext.class, 0);
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

		public TerminalNode COLON() {
			return getToken(MarkdownGrammar.COLON, 0);
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

	public static class BoldTextContext extends ParserRuleContext {
		public BoldTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode TILT() {
			return getToken(MarkdownGrammar.TILT, 0);
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
			return RULE_boldText;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).enterBoldText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MarkdownGrammarListener) ((MarkdownGrammarListener) listener).exitBoldText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof MarkdownGrammarVisitor)
				return ((MarkdownGrammarVisitor<? extends T>) visitor).visitBoldText(this);
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