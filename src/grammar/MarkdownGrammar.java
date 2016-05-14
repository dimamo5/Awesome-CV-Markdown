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
		RULE_contacts = 5, RULE_block = 6, RULE_subBlock = 7, RULE_list = 8, RULE_blockList = 9, 
		RULE_blockListCell = 10, RULE_table = 11, RULE_tableBody = 12, RULE_icon = 13, 
		RULE_boldText = 14, RULE_tableHeader = 15, RULE_tableCell = 16, RULE_tableLine = 17, 
		RULE_blockName = 18, RULE_blockSubName = 19, RULE_any = 20, RULE_tablecontent = 21, 
		RULE_word_space = 22;
	public static final String[] ruleNames = {
		"cv", "info", "subHeader", "name", "address", "contacts", "block", "subBlock", 
		"list", "blockList", "blockListCell", "table", "tableBody", "icon", "boldText", 
		"tableHeader", "tableCell", "tableLine", "blockName", "blockSubName", 
		"any", "tablecontent", "word_space"
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


	    public Data.Cv cv = new Data.Cv();

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
			} while ( _la==NEWLINE );
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
				} while ( _la==NEWLINE );
				}
				}
				setState(62); 
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
			} while ( _la==SHARP );
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
		public Word_spaceContext word_space;
		public List<TerminalNode> SHARP() { return getTokens(MarkdownGrammar.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(MarkdownGrammar.SHARP, i);
		}
		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
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
			cv.info.newSub();
			setState(77);
			match(SHARP);
			setState(78);
			match(SHARP);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
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
			((SubHeaderContext)_localctx).word_space = word_space();
			cv.info.addSub((((SubHeaderContext)_localctx).word_space!=null?_input.getText(((SubHeaderContext)_localctx).word_space.start,((SubHeaderContext)_localctx).word_space.stop):null));
			setState(87);
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
		public Word_spaceContext word_space;
		public TerminalNode SHARP() { return getToken(MarkdownGrammar.SHARP, 0); }
		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(SHARP);
			setState(90);
			((NameContext)_localctx).word_space = word_space();
			cv.info.addName((((NameContext)_localctx).word_space!=null?_input.getText(((NameContext)_localctx).word_space.start,((NameContext)_localctx).word_space.stop):null));
			setState(92);
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
			setState(94);
			match(STAR);
			setState(95);
			((AddressContext)_localctx).any = any();
			cv.info.addAddress((((AddressContext)_localctx).any!=null?_input.getText(((AddressContext)_localctx).any.start,((AddressContext)_localctx).any.stop):null));
			setState(97);
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
			setState(99);
			match(CLOSE_ANGLE_BRACKET);
			setState(100);
			icon();
			setState(101);
			((ContactsContext)_localctx).any = any();
			cv.info.addContacts((((ContactsContext)_localctx).any!=null?_input.getText(((ContactsContext)_localctx).any.start,((ContactsContext)_localctx).any.stop):null));
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
		public BoldTextContext boldText;
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public BlockSubNameContext blockSubName() {
			return getRuleContext(BlockSubNameContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if (_la==SHARP) {
				{
				setState(115);
				blockSubName();
				setState(117);
				_la = _input.LA(1);
				if (_la==TILT) {
					{
					setState(116);
					((SubBlockContext)_localctx).boldText = boldText();
					}
				}

				cv.getBlock().addBoldText((((SubBlockContext)_localctx).boldText!=null?_input.getText(((SubBlockContext)_localctx).boldText.start,((SubBlockContext)_localctx).boldText.stop):null));
				}
			}

			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(123);
				list();
				}
				break;
			case 2:
				{
				setState(124);
				table();
				}
				break;
			case 3:
				{
				setState(125);
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

	public static class ListContext extends ParserRuleContext {
		public List<BlockListContext> blockList() {
			return getRuleContexts(BlockListContext.class);
		}
		public BlockListContext blockList(int i) {
			return getRuleContext(BlockListContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			cv.getBlock().setType(Data.Block.BlockType.LIST);cv.getList().newListLine();
			setState(130); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(129);
					blockList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(132); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class BlockListContext extends ParserRuleContext {
		public AnyContext any;
		public TerminalNode STAR() { return getToken(MarkdownGrammar.STAR, 0); }
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
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
		enterRule(_localctx, 18, RULE_blockList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(STAR);
			setState(135);
			((BlockListContext)_localctx).any = any();
			cv.getList().addHeader((((BlockListContext)_localctx).any!=null?_input.getText(((BlockListContext)_localctx).any.start,((BlockListContext)_localctx).any.stop):null));
			setState(137);
			match(NEWLINE);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(138);
				blockListCell();
				}
				}
				setState(143);
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
		public AnyContext any;
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
		enterRule(_localctx, 20, RULE_blockListCell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(COLON);
			setState(146);
			_la = _input.LA(1);
			if (_la==OPEN_CURLY) {
				{
				setState(145);
				icon();
				}
			}

			setState(149);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0)) {
				{
				setState(148);
				((BlockListCellContext)_localctx).any = any();
				}
			}

			cv.getList().addListCell((((BlockListCellContext)_localctx).any!=null?_input.getText(((BlockListCellContext)_localctx).any.start,((BlockListCellContext)_localctx).any.stop):null));
			setState(152);
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
		enterRule(_localctx, 22, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			cv.getBlock().setType(Data.Block.BlockType.TABLE);
			setState(155);
			tableHeader();
			setState(156);
			match(NEWLINE);
			setState(157);
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
		enterRule(_localctx, 24, RULE_tableBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(159);
					tableLine();
					setState(160);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(164); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 26, RULE_icon);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(OPEN_CURLY);
			setState(167);
			match(WORD);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(168);
					match(SPACE);
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(174);
				((IconContext)_localctx).STAR_CLASS = match(STAR_CLASS);
				}
				break;
			}
			String s=(((IconContext)_localctx).STAR_CLASS!=null?((IconContext)_localctx).STAR_CLASS.getText():null); if(s!=null){String[] ints= s.split("/");float esquerda=Float.valueOf(ints[0].trim()); float direita=Float.valueOf(ints[1].trim()); if(esquerda>direita){System.err.println("Nr of stars cannot be bigger than total stars");((IconContext)_localctx).allow = false;}else ((IconContext)_localctx).allow = true;}
			setState(178);
			if (!(_localctx.allow)) throw new FailedPredicateException(this, "$allow");
			setState(179);
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
		enterRule(_localctx, 28, RULE_boldText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(TILT);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				any();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0) );
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				match(NEWLINE);
				}
				}
				setState(190); 
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
		public Word_spaceContext word_space;
		public List<Word_spaceContext> word_space() {
			return getRuleContexts(Word_spaceContext.class);
		}
		public Word_spaceContext word_space(int i) {
			return getRuleContext(Word_spaceContext.class,i);
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
		enterRule(_localctx, 30, RULE_tableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((TableHeaderContext)_localctx).word_space = word_space();
			cv.getTable().addHeaderCell((((TableHeaderContext)_localctx).word_space!=null?_input.getText(((TableHeaderContext)_localctx).word_space.start,((TableHeaderContext)_localctx).word_space.stop):null));
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				match(HAT);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(195);
					match(SPACE);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				((TableHeaderContext)_localctx).word_space = word_space();
				cv.getTable().addHeaderCell((((TableHeaderContext)_localctx).word_space!=null?_input.getText(((TableHeaderContext)_localctx).word_space.start,((TableHeaderContext)_localctx).word_space.stop):null));
				}
				}
				setState(206); 
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
		enterRule(_localctx, 32, RULE_tableCell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			tablecontent();
			setState(209);
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
		enterRule(_localctx, 34, RULE_tableLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			cv.getTable().addBodyLine();
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(212);
				tableCell();
				}
				}
				setState(215); 
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
		public Word_spaceContext word_space;
		public List<TerminalNode> SHARP() { return getTokens(MarkdownGrammar.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(MarkdownGrammar.SHARP, i);
		}
		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
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
		enterRule(_localctx, 36, RULE_blockName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(SHARP);
			setState(218);
			match(SHARP);
			setState(219);
			match(SHARP);
			setState(220);
			((BlockNameContext)_localctx).word_space = word_space();
			cv.getBlock().addBlockName((((BlockNameContext)_localctx).word_space!=null?_input.getText(((BlockNameContext)_localctx).word_space.start,((BlockNameContext)_localctx).word_space.stop):null));
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222);
				match(NEWLINE);
				}
				}
				setState(225); 
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
		public Word_spaceContext word_space;
		public List<TerminalNode> SHARP() { return getTokens(MarkdownGrammar.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(MarkdownGrammar.SHARP, i);
		}
		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
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
		enterRule(_localctx, 38, RULE_blockSubName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(SHARP);
			setState(228);
			match(SHARP);
			setState(229);
			match(SHARP);
			setState(230);
			match(SHARP);
			setState(231);
			((BlockSubNameContext)_localctx).word_space = word_space();
			cv.getBlock().addSubBlockName((((BlockSubNameContext)_localctx).word_space!=null?_input.getText(((BlockSubNameContext)_localctx).word_space.start,((BlockSubNameContext)_localctx).word_space.stop):null));
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				match(NEWLINE);
				}
				}
				setState(236); 
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
		enterRule(_localctx, 40, RULE_any);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(247);
					switch (_input.LA(1)) {
					case WORD:
						{
						setState(238);
						match(WORD);
						}
						break;
					case INT:
						{
						setState(239);
						match(INT);
						}
						break;
					case SYMBOL:
						{
						setState(240);
						match(SYMBOL);
						}
						break;
					case ESCAPE:
						{
						setState(241);
						match(ESCAPE);
						}
						break;
					case SPACE:
						{
						setState(243); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(242);
								match(SPACE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(245); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
				setState(249); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public AnyContext any;
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
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
		enterRule(_localctx, 42, RULE_tablecontent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(251);
					match(SPACE);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(261); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(261);
				switch (_input.LA(1)) {
				case OPEN_CURLY:
					{
					setState(257);
					icon();
					}
					break;
				case SPACE:
				case ESCAPE:
				case SYMBOL:
				case WORD:
				case INT:
					{
					setState(258);
					((TablecontentContext)_localctx).any = any();
					cv.getTable().addBodyCell((((TablecontentContext)_localctx).any!=null?_input.getText(((TablecontentContext)_localctx).any.start,((TablecontentContext)_localctx).any.stop):null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(263); 
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

	public static class Word_spaceContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(MarkdownGrammar.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(MarkdownGrammar.WORD, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public Word_spaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterWord_space(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitWord_space(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitWord_space(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Word_spaceContext word_space() throws RecognitionException {
		Word_spaceContext _localctx = new Word_spaceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_word_space);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(265);
				match(WORD);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(266);
					match(SPACE);
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
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
		case 13:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0117\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\6\2\64\n\2\r\2\16\2\65\3\2\3\2\3\2\6\2;\n\2\r\2\16\2<\6\2?\n\2\r\2"+
		"\16\2@\3\3\3\3\6\3E\n\3\r\3\16\3F\3\3\3\3\6\3K\n\3\r\3\16\3L\3\4\3\4\3"+
		"\4\3\4\7\4S\n\4\f\4\16\4V\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7k\n\7\r\7\16\7l\3\b\3\b\3\b\6"+
		"\br\n\b\r\b\16\bs\3\t\3\t\5\tx\n\t\3\t\3\t\5\t|\n\t\3\t\3\t\3\t\5\t\u0081"+
		"\n\t\3\n\3\n\6\n\u0085\n\n\r\n\16\n\u0086\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u008e\n\13\f\13\16\13\u0091\13\13\3\f\3\f\5\f\u0095\n\f\3\f\5\f\u0098"+
		"\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\6\16\u00a5\n\16\r"+
		"\16\16\16\u00a6\3\17\3\17\3\17\7\17\u00ac\n\17\f\17\16\17\u00af\13\17"+
		"\3\17\5\17\u00b2\n\17\3\17\3\17\3\17\3\17\3\20\3\20\6\20\u00ba\n\20\r"+
		"\20\16\20\u00bb\3\20\6\20\u00bf\n\20\r\20\16\20\u00c0\3\21\3\21\3\21\3"+
		"\21\7\21\u00c7\n\21\f\21\16\21\u00ca\13\21\3\21\3\21\3\21\6\21\u00cf\n"+
		"\21\r\21\16\21\u00d0\3\22\3\22\3\22\3\23\3\23\6\23\u00d8\n\23\r\23\16"+
		"\23\u00d9\3\24\3\24\3\24\3\24\3\24\3\24\6\24\u00e2\n\24\r\24\16\24\u00e3"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u00ed\n\25\r\25\16\25\u00ee\3"+
		"\26\3\26\3\26\3\26\3\26\6\26\u00f6\n\26\r\26\16\26\u00f7\6\26\u00fa\n"+
		"\26\r\26\16\26\u00fb\3\27\7\27\u00ff\n\27\f\27\16\27\u0102\13\27\3\27"+
		"\3\27\3\27\3\27\6\27\u0108\n\27\r\27\16\27\u0109\3\30\3\30\7\30\u010e"+
		"\n\30\f\30\16\30\u0111\13\30\6\30\u0113\n\30\r\30\16\30\u0114\3\30\2\2"+
		"\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\u0124\2\60\3\2"+
		"\2\2\4B\3\2\2\2\6N\3\2\2\2\b[\3\2\2\2\n`\3\2\2\2\fe\3\2\2\2\16n\3\2\2"+
		"\2\20{\3\2\2\2\22\u0082\3\2\2\2\24\u0088\3\2\2\2\26\u0092\3\2\2\2\30\u009c"+
		"\3\2\2\2\32\u00a4\3\2\2\2\34\u00a8\3\2\2\2\36\u00b7\3\2\2\2 \u00c2\3\2"+
		"\2\2\"\u00d2\3\2\2\2$\u00d5\3\2\2\2&\u00db\3\2\2\2(\u00e5\3\2\2\2*\u00f9"+
		"\3\2\2\2,\u0100\3\2\2\2.\u0112\3\2\2\2\60\61\5\4\3\2\61\63\7\21\2\2\62"+
		"\64\7\5\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		">\3\2\2\2\678\5\16\b\28:\7\21\2\29;\7\5\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2"+
		"\2\2<=\3\2\2\2=?\3\2\2\2>\67\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\3"+
		"\3\2\2\2BD\5\b\5\2CE\5\6\4\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G"+
		"H\3\2\2\2HJ\5\n\6\2IK\5\f\7\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2"+
		"M\5\3\2\2\2NO\b\4\1\2OP\7\13\2\2PT\7\13\2\2QS\7\3\2\2RQ\3\2\2\2SV\3\2"+
		"\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\5.\30\2XY\b\4\1\2YZ\7\5"+
		"\2\2Z\7\3\2\2\2[\\\7\13\2\2\\]\5.\30\2]^\b\5\1\2^_\7\5\2\2_\t\3\2\2\2"+
		"`a\7\6\2\2ab\5*\26\2bc\b\6\1\2cd\7\5\2\2d\13\3\2\2\2ef\7\t\2\2fg\5\34"+
		"\17\2gh\5*\26\2hj\b\7\1\2ik\7\5\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3"+
		"\2\2\2m\r\3\2\2\2no\b\b\1\2oq\5&\24\2pr\5\20\t\2qp\3\2\2\2rs\3\2\2\2s"+
		"q\3\2\2\2st\3\2\2\2t\17\3\2\2\2uw\5(\25\2vx\5\36\20\2wv\3\2\2\2wx\3\2"+
		"\2\2xy\3\2\2\2yz\b\t\1\2z|\3\2\2\2{u\3\2\2\2{|\3\2\2\2|\u0080\3\2\2\2"+
		"}\u0081\5\22\n\2~\u0081\5\30\r\2\177\u0081\5*\26\2\u0080}\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\177\3\2\2\2\u0081\21\3\2\2\2\u0082\u0084\b\n\1\2\u0083"+
		"\u0085\5\24\13\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\23\3\2\2\2\u0088\u0089\7\6\2\2\u0089"+
		"\u008a\5*\26\2\u008a\u008b\b\13\1\2\u008b\u008f\7\5\2\2\u008c\u008e\5"+
		"\26\f\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\25\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\7\b\2"+
		"\2\u0093\u0095\5\34\17\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0098\5*\26\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\f\1\2\u009a\u009b\7\5\2\2\u009b"+
		"\27\3\2\2\2\u009c\u009d\b\r\1\2\u009d\u009e\5 \21\2\u009e\u009f\7\5\2"+
		"\2\u009f\u00a0\5\32\16\2\u00a0\31\3\2\2\2\u00a1\u00a2\5$\23\2\u00a2\u00a3"+
		"\7\5\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00a9\7\17\2"+
		"\2\u00a9\u00ad\7\27\2\2\u00aa\u00ac\7\3\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\7\31\2\2\u00b1\u00b0\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\17\1\2\u00b4\u00b5\6"+
		"\17\2\3\u00b5\u00b6\7\20\2\2\u00b6\35\3\2\2\2\u00b7\u00b9\7\22\2\2\u00b8"+
		"\u00ba\5*\26\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\7\5\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\37\3\2\2\2\u00c2\u00c3\5.\30\2\u00c3\u00ce\b\21\1\2\u00c4\u00c8"+
		"\7\23\2\2\u00c5\u00c7\7\3\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00cb\u00cc\5.\30\2\u00cc\u00cd\b\21\1\2\u00cd\u00cf\3\2\2\2"+
		"\u00ce\u00c4\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1!\3\2\2\2\u00d2\u00d3\5,\27\2\u00d3\u00d4\7\24\2\2\u00d4"+
		"#\3\2\2\2\u00d5\u00d7\b\23\1\2\u00d6\u00d8\5\"\22\2\u00d7\u00d6\3\2\2"+
		"\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da%"+
		"\3\2\2\2\u00db\u00dc\7\13\2\2\u00dc\u00dd\7\13\2\2\u00dd\u00de\7\13\2"+
		"\2\u00de\u00df\5.\30\2\u00df\u00e1\b\24\1\2\u00e0\u00e2\7\5\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\'\3\2\2\2\u00e5\u00e6\7\13\2\2\u00e6\u00e7\7\13\2\2\u00e7\u00e8"+
		"\7\13\2\2\u00e8\u00e9\7\13\2\2\u00e9\u00ea\5.\30\2\u00ea\u00ec\b\25\1"+
		"\2\u00eb\u00ed\7\5\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef)\3\2\2\2\u00f0\u00fa\7\27\2\2\u00f1"+
		"\u00fa\7\30\2\2\u00f2\u00fa\7\26\2\2\u00f3\u00fa\7\25\2\2\u00f4\u00f6"+
		"\7\3\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f0\3\2\2\2\u00f9\u00f1\3\2"+
		"\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc+\3\2\2\2"+
		"\u00fd\u00ff\7\3\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0107\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0108\5\34\17\2\u0104\u0105\5*\26\2\u0105\u0106\b\27\1\2\u0106\u0108"+
		"\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a-\3\2\2\2\u010b\u010f\7\27\2\2"+
		"\u010c\u010e\7\3\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u010b\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115/\3\2\2\2#\65<@FLTlsw{\u0080\u0086\u008f\u0094\u0097\u00a6\u00ad"+
		"\u00b1\u00bb\u00c0\u00c8\u00d0\u00d9\u00e3\u00ee\u00f7\u00f9\u00fb\u0100"+
		"\u0107\u0109\u010f\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}