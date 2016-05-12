// Generated from C:/Users/diogo/IdeaProjects/markdown-cv/src/grammar\MarkdownGrammar.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownGrammar extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, TAB=2, NEWLINE=3, STAR=4, MINUS=5, COLON=6, CLOSE_ANGLE_BRACKET=7, 
		OPEN_ANGLE_BRACKET=8, SHARP=9, OPEN_SB=10, CLOSE_SB=11, SLASH=12, OPEN_CURLY=13, 
		CLOSE_CURLY=14, BLOCKSPLITTER=15, TILT=16, HAT=17, SPLIT=18, ESCAPE=19, 
		SYMBOL=20, WORD=21, INT=22, STAR_CLASS=23;
	public static final int
		RULE_cv = 0, RULE_info = 1, RULE_subHeader = 2, RULE_name = 3, RULE_address = 4, 
		RULE_contacts = 5, RULE_block = 6, RULE_subBlock = 7, RULE_blockList = 8, 
		RULE_blockListCell = 9, RULE_table = 10, RULE_tableBody = 11, RULE_icon = 12, 
		RULE_boldText = 13, RULE_tableHeader = 14, RULE_tableCell = 15, RULE_tableLine = 16, 
		RULE_blockName = 17, RULE_blockSubName = 18, RULE_any = 19, RULE_tablecontent = 20;
	public static final String[] ruleNames = {
		"cv", "info", "subHeader", "name", "address", "contacts", "block", "subBlock", 
		"blockList", "blockListCell", "table", "tableBody", "icon", "boldText", 
		"tableHeader", "tableCell", "tableLine", "blockName", "blockSubName", 
		"any", "tablecontent"
	};

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

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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
	public String getGrammarFileName() { return "MarkdownGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public Data.Table table = new Data.Table();
	    public Data.Info info = new Data.Info();

	public MarkdownGrammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CvContext extends ParserRuleContext {
		public InfoContext info() {
			return getRuleContext(InfoContext.class,0);
		}
		public List<TerminalNode> BLOCKSPLITTER() { return getTokens(MarkdownGrammar.BLOCKSPLITTER); }
		public TerminalNode BLOCKSPLITTER(int i) {
			return getToken(MarkdownGrammar.BLOCKSPLITTER, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterCv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitCv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitCv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvContext cv() throws RecognitionException {
		CvContext _localctx = new CvContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			info();
			setState(43);
			match(BLOCKSPLITTER);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				match(NEWLINE);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				block();
				setState(50);
				match(BLOCKSPLITTER);
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51);
					match(NEWLINE);
					}
					}
					setState(54); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SHARP );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfoContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public List<SubHeaderContext> subHeader() {
			return getRuleContexts(SubHeaderContext.class);
		}
		public SubHeaderContext subHeader(int i) {
			return getRuleContext(SubHeaderContext.class,i);
		}
		public List<ContactsContext> contacts() {
			return getRuleContexts(ContactsContext.class);
		}
		public ContactsContext contacts(int i) {
			return getRuleContext(ContactsContext.class,i);
		}
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			name();
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				subHeader();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SHARP );
			setState(66);
			address();
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				contacts();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLOSE_ANGLE_BRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubHeaderContext extends ParserRuleContext {
		public Token WORD;
		public List<TerminalNode> SHARP() { return getTokens(MarkdownGrammar.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(MarkdownGrammar.SHARP, i);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(MarkdownGrammar.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(MarkdownGrammar.WORD, i);
		}
		public SubHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterSubHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitSubHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitSubHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubHeaderContext subHeader() throws RecognitionException {
		SubHeaderContext _localctx = new SubHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			info.newSub();
			setState(73);
			match(SHARP);
			setState(74);
			match(SHARP);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(75);
				match(SPACE);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				((SubHeaderContext)_localctx).WORD = match(WORD);
				info.addSub((((SubHeaderContext)_localctx).WORD!=null?((SubHeaderContext)_localctx).WORD.getText():null));
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(83);
					match(SPACE);
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(93);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Token WORD;
		public TerminalNode SHARP() { return getToken(MarkdownGrammar.SHARP, 0); }
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public List<TerminalNode> WORD() { return getTokens(MarkdownGrammar.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(MarkdownGrammar.WORD, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(SHARP);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				((NameContext)_localctx).WORD = match(WORD);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(97);
					match(SPACE);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				info.addName((((NameContext)_localctx).WORD!=null?((NameContext)_localctx).WORD.getText():null));
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(108);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddressContext extends ParserRuleContext {
		public AnyContext any;
		public TerminalNode STAR() { return getToken(MarkdownGrammar.STAR, 0); }
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(STAR);
			setState(111);
			((AddressContext)_localctx).any = any();
			info.analyze(((AddressContext)_localctx).any);
			setState(113);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContactsContext extends ParserRuleContext {
		public AnyContext any;
		public TerminalNode CLOSE_ANGLE_BRACKET() { return getToken(MarkdownGrammar.CLOSE_ANGLE_BRACKET, 0); }
		public IconContext icon() {
			return getRuleContext(IconContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public ContactsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contacts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterContacts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitContacts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitContacts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContactsContext contacts() throws RecognitionException {
		ContactsContext _localctx = new ContactsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_contacts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(CLOSE_ANGLE_BRACKET);
			setState(116);
			icon();
			setState(117);
			((ContactsContext)_localctx).any = any();
			info.analyze(((ContactsContext)_localctx).any);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				match(NEWLINE);
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockNameContext blockName() {
			return getRuleContext(BlockNameContext.class,0);
		}
		public List<SubBlockContext> subBlock() {
			return getRuleContexts(SubBlockContext.class);
		}
		public SubBlockContext subBlock(int i) {
			return getRuleContext(SubBlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			blockName();
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				subBlock();
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << STAR) | (1L << SHARP) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubBlockContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public BlockSubNameContext blockSubName() {
			return getRuleContext(BlockSubNameContext.class,0);
		}
		public List<BlockListContext> blockList() {
			return getRuleContexts(BlockListContext.class);
		}
		public BlockListContext blockList(int i) {
			return getRuleContext(BlockListContext.class,i);
		}
		public BoldTextContext boldText() {
			return getRuleContext(BoldTextContext.class,0);
		}
		public SubBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterSubBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitSubBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitSubBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubBlockContext subBlock() throws RecognitionException {
		SubBlockContext _localctx = new SubBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if (_la==SHARP) {
				{
				setState(130);
				blockSubName();
				setState(132);
				_la = _input.LA(1);
				if (_la==TILT) {
					{
					setState(131);
					boldText();
					}
				}

				}
			}

			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(137); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
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
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(141);
				table();
				}
				break;
			case 3:
				{
				setState(142);
				any();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockListContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(MarkdownGrammar.STAR, 0); }
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<BlockListCellContext> blockListCell() {
			return getRuleContexts(BlockListCellContext.class);
		}
		public BlockListCellContext blockListCell(int i) {
			return getRuleContext(BlockListCellContext.class,i);
		}
		public BlockListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlockList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlockList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitBlockList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockListContext blockList() throws RecognitionException {
		BlockListContext _localctx = new BlockListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(STAR);
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				any();
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0) );
			setState(151);
			match(NEWLINE);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(152);
				blockListCell();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockListCellContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(MarkdownGrammar.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public IconContext icon() {
			return getRuleContext(IconContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public BlockListCellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockListCell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlockListCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlockListCell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitBlockListCell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockListCellContext blockListCell() throws RecognitionException {
		BlockListCellContext _localctx = new BlockListCellContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockListCell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(COLON);
			setState(160);
			_la = _input.LA(1);
			if (_la==OPEN_CURLY) {
				{
				setState(159);
				icon();
				}
			}

			setState(163);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0)) {
				{
				setState(162);
				any();
				}
			}

			setState(165);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public TableHeaderContext tableHeader() {
			return getRuleContext(TableHeaderContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public TableBodyContext tableBody() {
			return getRuleContext(TableBodyContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			tableHeader();
			setState(168);
			match(NEWLINE);
			setState(169);
			tableBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableBodyContext extends ParserRuleContext {
		public List<TableLineContext> tableLine() {
			return getRuleContexts(TableLineContext.class);
		}
		public TableLineContext tableLine(int i) {
			return getRuleContext(TableLineContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public TableBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTableBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTableBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitTableBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableBodyContext tableBody() throws RecognitionException {
		TableBodyContext _localctx = new TableBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tableBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(171);
					tableLine();
					setState(172);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(176); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IconContext extends ParserRuleContext {
		public boolean allow = true;
		public Token STAR_CLASS;
		public TerminalNode OPEN_CURLY() { return getToken(MarkdownGrammar.OPEN_CURLY, 0); }
		public TerminalNode WORD() { return getToken(MarkdownGrammar.WORD, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(MarkdownGrammar.CLOSE_CURLY, 0); }
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public TerminalNode STAR_CLASS() { return getToken(MarkdownGrammar.STAR_CLASS, 0); }
		public IconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_icon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterIcon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitIcon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitIcon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconContext icon() throws RecognitionException {
		IconContext _localctx = new IconContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_icon);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(OPEN_CURLY);
			setState(179);
			match(WORD);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(180);
					match(SPACE);
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(186);
				((IconContext)_localctx).STAR_CLASS = match(STAR_CLASS);
				}
				break;
			}
			String s=(((IconContext)_localctx).STAR_CLASS!=null?((IconContext)_localctx).STAR_CLASS.getText():null); if(s!=null){String[] ints= s.split("/");float esquerda=Float.valueOf(ints[0].trim()); float direita=Float.valueOf(ints[1].trim()); if(esquerda>direita){System.err.println("Nr of stars cannot be bigger than total stars");((IconContext)_localctx).allow = false;}else ((IconContext)_localctx).allow = true;}
			setState(190);
			if (!(_localctx.allow)) throw new FailedPredicateException(this, "$allow");
			setState(191);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoldTextContext extends ParserRuleContext {
		public TerminalNode TILT() { return getToken(MarkdownGrammar.TILT, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public BoldTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boldText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBoldText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBoldText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitBoldText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoldTextContext boldText() throws RecognitionException {
		BoldTextContext _localctx = new BoldTextContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boldText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(TILT);
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				any();
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0) );
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				match(NEWLINE);
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableHeaderContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(MarkdownGrammar.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(MarkdownGrammar.WORD, i);
		}
		public List<TerminalNode> HAT() { return getTokens(MarkdownGrammar.HAT); }
		public TerminalNode HAT(int i) {
			return getToken(MarkdownGrammar.HAT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public TableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableHeaderContext tableHeader() throws RecognitionException {
		TableHeaderContext _localctx = new TableHeaderContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				match(WORD);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(205);
					match(SPACE);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(233); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				match(HAT);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(216);
					match(SPACE);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(222);
					match(WORD);
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(223);
						match(SPACE);
						}
						}
						setState(228);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(231); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD );
				}
				}
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HAT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableCellContext extends ParserRuleContext {
		public TablecontentContext tablecontent() {
			return getRuleContext(TablecontentContext.class,0);
		}
		public TerminalNode SPLIT() { return getToken(MarkdownGrammar.SPLIT, 0); }
		public TableCellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableCell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTableCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTableCell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitTableCell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableCellContext tableCell() throws RecognitionException {
		TableCellContext _localctx = new TableCellContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tableCell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			tablecontent();
			setState(238);
			match(SPLIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableLineContext extends ParserRuleContext {
		public List<TableCellContext> tableCell() {
			return getRuleContexts(TableCellContext.class);
		}
		public TableCellContext tableCell(int i) {
			return getRuleContext(TableCellContext.class,i);
		}
		public TableLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTableLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTableLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitTableLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableLineContext tableLine() throws RecognitionException {
		TableLineContext _localctx = new TableLineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tableLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(240);
				tableCell();
				}
				}
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << OPEN_CURLY) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockNameContext extends ParserRuleContext {
		public List<TerminalNode> SHARP() { return getTokens(MarkdownGrammar.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(MarkdownGrammar.SHARP, i);
		}
		public List<TerminalNode> WORD() { return getTokens(MarkdownGrammar.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(MarkdownGrammar.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public BlockNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlockName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlockName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitBlockName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockNameContext blockName() throws RecognitionException {
		BlockNameContext _localctx = new BlockNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(SHARP);
			setState(246);
			match(SHARP);
			setState(247);
			match(SHARP);
			setState(255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				match(WORD);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(249);
					match(SPACE);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(260); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(259);
				match(NEWLINE);
				}
				}
				setState(262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockSubNameContext extends ParserRuleContext {
		public List<TerminalNode> SHARP() { return getTokens(MarkdownGrammar.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(MarkdownGrammar.SHARP, i);
		}
		public List<TerminalNode> WORD() { return getTokens(MarkdownGrammar.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(MarkdownGrammar.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public BlockSubNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSubName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlockSubName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlockSubName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitBlockSubName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockSubNameContext blockSubName() throws RecognitionException {
		BlockSubNameContext _localctx = new BlockSubNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockSubName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(SHARP);
			setState(265);
			match(SHARP);
			setState(266);
			match(SHARP);
			setState(267);
			match(SHARP);
			setState(275); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				match(WORD);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(269);
					match(SPACE);
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(279);
				match(NEWLINE);
				}
				}
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(MarkdownGrammar.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(MarkdownGrammar.WORD, i);
		}
		public List<TerminalNode> INT() { return getTokens(MarkdownGrammar.INT); }
		public TerminalNode INT(int i) {
			return getToken(MarkdownGrammar.INT, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(MarkdownGrammar.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MarkdownGrammar.SYMBOL, i);
		}
		public List<TerminalNode> ESCAPE() { return getTokens(MarkdownGrammar.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(MarkdownGrammar.ESCAPE, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_any);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(293);
					switch (_input.LA(1)) {
					case WORD:
						{
						setState(284);
						match(WORD);
						}
						break;
					case INT:
						{
						setState(285);
						match(INT);
						}
						break;
					case SYMBOL:
						{
						setState(286);
						match(SYMBOL);
						}
						break;
					case ESCAPE:
						{
						setState(287);
						match(ESCAPE);
						}
						break;
					case SPACE:
						{
						setState(289); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(288);
								match(SPACE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(291); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
				setState(295); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablecontentContext extends ParserRuleContext {
		public List<IconContext> icon() {
			return getRuleContexts(IconContext.class);
		}
		public IconContext icon(int i) {
			return getRuleContext(IconContext.class,i);
		}
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public TablecontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablecontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTablecontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTablecontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitTablecontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablecontentContext tablecontent() throws RecognitionException {
		TablecontentContext _localctx = new TablecontentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tablecontent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(299);
				switch (_input.LA(1)) {
				case OPEN_CURLY:
					{
					setState(297);
					icon();
					}
					break;
				case SPACE:
				case ESCAPE:
				case SYMBOL:
				case WORD:
				case INT:
					{
					setState(298);
					any();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << OPEN_CURLY) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return icon_sempred((IconContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0132\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\6\2\60\n\2\r\2\16"+
		"\2\61\3\2\3\2\3\2\6\2\67\n\2\r\2\16\28\6\2;\n\2\r\2\16\2<\3\3\3\3\6\3"+
		"A\n\3\r\3\16\3B\3\3\3\3\6\3G\n\3\r\3\16\3H\3\4\3\4\3\4\3\4\7\4O\n\4\f"+
		"\4\16\4R\13\4\3\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\6\4\\\n\4\r\4\16\4]"+
		"\3\4\3\4\3\5\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\3\5\6\5k\n\5\r\5\16\5l\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7{\n\7\r\7\16\7|\3\b"+
		"\3\b\6\b\u0081\n\b\r\b\16\b\u0082\3\t\3\t\5\t\u0087\n\t\5\t\u0089\n\t"+
		"\3\t\6\t\u008c\n\t\r\t\16\t\u008d\3\t\3\t\5\t\u0092\n\t\3\n\3\n\6\n\u0096"+
		"\n\n\r\n\16\n\u0097\3\n\3\n\7\n\u009c\n\n\f\n\16\n\u009f\13\n\3\13\3\13"+
		"\5\13\u00a3\n\13\3\13\5\13\u00a6\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\6\r\u00b1\n\r\r\r\16\r\u00b2\3\16\3\16\3\16\7\16\u00b8\n\16\f\16"+
		"\16\16\u00bb\13\16\3\16\5\16\u00be\n\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\6\17\u00c6\n\17\r\17\16\17\u00c7\3\17\6\17\u00cb\n\17\r\17\16\17\u00cc"+
		"\3\20\3\20\7\20\u00d1\n\20\f\20\16\20\u00d4\13\20\6\20\u00d6\n\20\r\20"+
		"\16\20\u00d7\3\20\3\20\7\20\u00dc\n\20\f\20\16\20\u00df\13\20\3\20\3\20"+
		"\7\20\u00e3\n\20\f\20\16\20\u00e6\13\20\6\20\u00e8\n\20\r\20\16\20\u00e9"+
		"\6\20\u00ec\n\20\r\20\16\20\u00ed\3\21\3\21\3\21\3\22\6\22\u00f4\n\22"+
		"\r\22\16\22\u00f5\3\23\3\23\3\23\3\23\3\23\7\23\u00fd\n\23\f\23\16\23"+
		"\u0100\13\23\6\23\u0102\n\23\r\23\16\23\u0103\3\23\6\23\u0107\n\23\r\23"+
		"\16\23\u0108\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0111\n\24\f\24\16\24"+
		"\u0114\13\24\6\24\u0116\n\24\r\24\16\24\u0117\3\24\6\24\u011b\n\24\r\24"+
		"\16\24\u011c\3\25\3\25\3\25\3\25\3\25\6\25\u0124\n\25\r\25\16\25\u0125"+
		"\6\25\u0128\n\25\r\25\16\25\u0129\3\26\3\26\6\26\u012e\n\26\r\26\16\26"+
		"\u012f\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\2\u014b"+
		"\2,\3\2\2\2\4>\3\2\2\2\6J\3\2\2\2\ba\3\2\2\2\np\3\2\2\2\fu\3\2\2\2\16"+
		"~\3\2\2\2\20\u0088\3\2\2\2\22\u0093\3\2\2\2\24\u00a0\3\2\2\2\26\u00a9"+
		"\3\2\2\2\30\u00b0\3\2\2\2\32\u00b4\3\2\2\2\34\u00c3\3\2\2\2\36\u00d5\3"+
		"\2\2\2 \u00ef\3\2\2\2\"\u00f3\3\2\2\2$\u00f7\3\2\2\2&\u010a\3\2\2\2(\u0127"+
		"\3\2\2\2*\u012d\3\2\2\2,-\5\4\3\2-/\7\21\2\2.\60\7\5\2\2/.\3\2\2\2\60"+
		"\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62:\3\2\2\2\63\64\5\16\b\2\64\66"+
		"\7\21\2\2\65\67\7\5\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2"+
		"\29;\3\2\2\2:\63\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\3\3\2\2\2>@\5"+
		"\b\5\2?A\5\6\4\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DF\5"+
		"\n\6\2EG\5\f\7\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\5\3\2\2\2JK"+
		"\b\4\1\2KL\7\13\2\2LP\7\13\2\2MO\7\3\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2"+
		"PQ\3\2\2\2Q[\3\2\2\2RP\3\2\2\2ST\7\27\2\2TX\b\4\1\2UW\7\3\2\2VU\3\2\2"+
		"\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[S\3\2\2\2\\]\3\2"+
		"\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\5\2\2`\7\3\2\2\2aj\7\13\2\2bf\7"+
		"\27\2\2ce\7\3\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf"+
		"\3\2\2\2ik\b\5\1\2jb\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2n"+
		"o\7\5\2\2o\t\3\2\2\2pq\7\6\2\2qr\5(\25\2rs\b\6\1\2st\7\5\2\2t\13\3\2\2"+
		"\2uv\7\t\2\2vw\5\32\16\2wx\5(\25\2xz\b\7\1\2y{\7\5\2\2zy\3\2\2\2{|\3\2"+
		"\2\2|z\3\2\2\2|}\3\2\2\2}\r\3\2\2\2~\u0080\5$\23\2\177\u0081\5\20\t\2"+
		"\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\17\3\2\2\2\u0084\u0086\5&\24\2\u0085\u0087\5\34\17\2\u0086"+
		"\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0084\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u0091\3\2\2\2\u008a\u008c\5\22\n\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0092\3\2\2\2\u008f\u0092\5\26\f\2\u0090\u0092\5(\25\2\u0091"+
		"\u008b\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\21\3\2\2"+
		"\2\u0093\u0095\7\6\2\2\u0094\u0096\5(\25\2\u0095\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009d\7\5\2\2\u009a\u009c\5\24\13\2\u009b\u009a\3\2\2\2\u009c\u009f\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\23\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a2\7\b\2\2\u00a1\u00a3\5\32\16\2\u00a2\u00a1\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6\5(\25\2\u00a5"+
		"\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\5"+
		"\2\2\u00a8\25\3\2\2\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\7\5\2\2\u00ab"+
		"\u00ac\5\30\r\2\u00ac\27\3\2\2\2\u00ad\u00ae\5\"\22\2\u00ae\u00af\7\5"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\31\3\2\2\2\u00b4\u00b5\7\17\2"+
		"\2\u00b5\u00b9\7\27\2\2\u00b6\u00b8\7\3\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\7\31\2\2\u00bd\u00bc\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\16\1\2\u00c0\u00c1\6"+
		"\16\2\3\u00c1\u00c2\7\20\2\2\u00c2\33\3\2\2\2\u00c3\u00c5\7\22\2\2\u00c4"+
		"\u00c6\5(\25\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00cb\7\5\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\35\3\2\2\2\u00ce\u00d2\7\27\2\2\u00cf\u00d1\7\3\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00ce\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00eb\3\2\2\2\u00d9"+
		"\u00dd\7\23\2\2\u00da\u00dc\7\3\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3"+
		"\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e7\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e4\7\27\2\2\u00e1\u00e3\7\3\2\2\u00e2\u00e1\3"+
		"\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00d9\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\37\3\2\2\2\u00ef\u00f0\5*\26\2\u00f0\u00f1\7\24\2\2\u00f1!"+
		"\3\2\2\2\u00f2\u00f4\5 \21\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6#\3\2\2\2\u00f7\u00f8\7\13\2\2"+
		"\u00f8\u00f9\7\13\2\2\u00f9\u0101\7\13\2\2\u00fa\u00fe\7\27\2\2\u00fb"+
		"\u00fd\7\3\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u00fa\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0106\3\2\2\2\u0105\u0107\7\5\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109%\3\2\2\2"+
		"\u010a\u010b\7\13\2\2\u010b\u010c\7\13\2\2\u010c\u010d\7\13\2\2\u010d"+
		"\u0115\7\13\2\2\u010e\u0112\7\27\2\2\u010f\u0111\7\3\2\2\u0110\u010f\3"+
		"\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u010e\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u011b\7\5\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\'\3\2\2\2\u011e\u0128\7\27\2\2\u011f\u0128"+
		"\7\30\2\2\u0120\u0128\7\26\2\2\u0121\u0128\7\25\2\2\u0122\u0124\7\3\2"+
		"\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u011e\3\2\2\2\u0127\u011f\3\2\2\2\u0127"+
		"\u0120\3\2\2\2\u0127\u0121\3\2\2\2\u0127\u0123\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a)\3\2\2\2\u012b\u012e"+
		"\5\32\16\2\u012c\u012e\5(\25\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2"+
		"\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130+\3"+
		"\2\2\2-\618<BHPX]fl|\u0082\u0086\u0088\u008d\u0091\u0097\u009d\u00a2\u00a5"+
		"\u00b2\u00b9\u00bd\u00c7\u00cc\u00d2\u00d7\u00dd\u00e4\u00e9\u00ed\u00f5"+
		"\u00fe\u0103\u0108\u0112\u0117\u011c\u0125\u0127\u0129\u012d\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}