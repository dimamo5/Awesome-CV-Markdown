// Generated from C:/Users/diogo/IdeaProjects/markdown-cv/src/grammar\MarkdownGrammar.g4 by ANTLR 4.5.1
package grammar;

import data.Cv;
import data.SubBlock;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link MarkdownGrammarListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class MarkdownGrammarBaseListener implements MarkdownGrammarListener {
    public Cv cv;

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCv(MarkdownGrammar.CvContext ctx) {
        cv = new Cv();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCv(MarkdownGrammar.CvContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInfo(MarkdownGrammar.InfoContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInfo(MarkdownGrammar.InfoContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSubHeader(MarkdownGrammar.SubHeaderContext ctx) {
        cv.info.newSub();
        cv.info.addSub(ctx.word_space().getText());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSubHeader(MarkdownGrammar.SubHeaderContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterName(MarkdownGrammar.NameContext ctx) {
        cv.info.addName(ctx.word_space().getText());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitName(MarkdownGrammar.NameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAddress(MarkdownGrammar.AddressContext ctx) {
        cv.info.addAddress(ctx.any().getText());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAddress(MarkdownGrammar.AddressContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterContacts(MarkdownGrammar.ContactsContext ctx) {
        String icon = (ctx.icon() == null) ? null : ctx.icon().getText();
        String text = (ctx.icon() == null) ? null : ctx.icon().getText();

        if (ctx.icon() != null && ctx.icon().exception == null) {
            cv.info.addContacts(text, icon);
        }
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitContacts(MarkdownGrammar.ContactsContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBlock(MarkdownGrammar.BlockContext ctx) {
        cv.newBlock();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBlock(MarkdownGrammar.BlockContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSubBlock(MarkdownGrammar.SubBlockContext ctx) {
        cv.getBlock().newSubBlock();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSubBlock(MarkdownGrammar.SubBlockContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTextBlock(MarkdownGrammar.TextBlockContext ctx) {
        cv.getSubBlock().setType(SubBlock.BlockType.TEXT);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTextBlock(MarkdownGrammar.TextBlockContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterList(MarkdownGrammar.ListContext ctx) {
        cv.getSubBlock().setType(SubBlock.BlockType.LIST);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitList(MarkdownGrammar.ListContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBlockList(MarkdownGrammar.BlockListContext ctx) {
        cv.getList().addHeader(ctx.any().getText());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBlockList(MarkdownGrammar.BlockListContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBlockListCell(MarkdownGrammar.BlockListCellContext ctx) {
        String icon = (ctx.icon() == null) ? null : ctx.icon().getText();
        String text = (ctx.any() == null) ? null : ctx.any().getText();

        if (ctx.icon() != null && ctx.icon().exception == null)
            cv.getList().addListCell(text, icon);
        else if (icon == null) {
            cv.getList().addListCell(text, icon);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBlockListCell(MarkdownGrammar.BlockListCellContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTable(MarkdownGrammar.TableContext ctx) {
        cv.getSubBlock().setType(SubBlock.BlockType.TABLE);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTable(MarkdownGrammar.TableContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTableBody(MarkdownGrammar.TableBodyContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTableBody(MarkdownGrammar.TableBodyContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIcon(MarkdownGrammar.IconContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIcon(MarkdownGrammar.IconContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTableHeader(MarkdownGrammar.TableHeaderContext ctx) {
        for (MarkdownGrammar.Word_spaceContext wsCtx : ctx.word_space()) {
            cv.getTable().addHeaderCell(wsCtx.getText());
        }
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTableHeader(MarkdownGrammar.TableHeaderContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTableCell(MarkdownGrammar.TableCellContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTableCell(MarkdownGrammar.TableCellContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTableLine(MarkdownGrammar.TableLineContext ctx) {
        cv.getTable().addBodyLine();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTableLine(MarkdownGrammar.TableLineContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBlockName(MarkdownGrammar.BlockNameContext ctx) {
        cv.getBlock().addBlockName(ctx.word_space().getText());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBlockName(MarkdownGrammar.BlockNameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBlockSubName(MarkdownGrammar.BlockSubNameContext ctx) {
        cv.getSubBlock().addSubBlockName(ctx.word_space().getText());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBlockSubName(MarkdownGrammar.BlockSubNameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAny(MarkdownGrammar.AnyContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAny(MarkdownGrammar.AnyContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTablecontent(MarkdownGrammar.TablecontentContext ctx) {
        String icon = (ctx.icon() == null) ? null : ctx.icon().getText();
        String text = (ctx.any() == null) ? null : ctx.any().getText();
        if (ctx.icon() != null && ctx.icon().exception == null) {
            cv.getTable().addBodyCell(text, icon);
        }
    }

    /**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTablecontent(MarkdownGrammar.TablecontentContext ctx) {
    }

    /**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWord_space(MarkdownGrammar.Word_spaceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitWord_space(MarkdownGrammar.Word_spaceContext ctx) { }

	/**
     * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
    @Override public void visitErrorNode(ErrorNode node) { }

    public Cv getCv(){
        return cv;
    }
}