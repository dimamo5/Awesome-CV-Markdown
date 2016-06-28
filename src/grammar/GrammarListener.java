package grammar;

import data.Cv;
import data.SubBlock;

/**
 * Created by diogo on 06/06/2016.
 */
public class GrammarListener extends MarkdownGrammarBaseListener {
    public Cv cv;

    public GrammarListener() {
        super();
    }

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
    public void enterName(MarkdownGrammar.NameContext ctx) {
        cv.info.addName(ctx.word_space().getText());
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
    public void enterContacts(MarkdownGrammar.ContactsContext ctx) {
        String icon = (ctx.icon() == null) ? null : ctx.icon().getText();
        String text = (ctx.any() == null) ? null : ctx.any().getText();

        if (ctx.icon() != null && ctx.icon().exception == null) {
            cv.info.addContacts(text, icon);
        } else if (ctx.icon() == null) {
            cv.info.addContacts(text, icon);
        }
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
        if (ctx.textBlock() != null) {
            cv.getSubBlock().addText(ctx.textBlock().getText());
        }
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
    public void enterList(MarkdownGrammar.ListContext ctx) {
        cv.getSubBlock().setType(SubBlock.BlockType.LIST);
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
    public void enterTableLine(MarkdownGrammar.TableLineContext ctx) {
        cv.getTable().addBodyLine();
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
    public void enterBlockSubName(MarkdownGrammar.BlockSubNameContext ctx) {
        cv.getSubBlock().addSubBlockName(ctx.word_space().getText());
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
        } else if (icon == null) {
            cv.getTable().addBodyCell(text, icon);
        }
    }

    public Cv getCv() {
        return cv;
    }
}
