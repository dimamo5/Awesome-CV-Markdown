package data;

import java.util.ArrayList;

/**
 * Created by diogo on 13/05/2016.
 */
public class Cv {
    public Info info = new Info();
    public ArrayList<Block> blocks = new ArrayList<Block>();

    public Table getTable() {
        if (getSubBlock().getType() == SubBlock.BlockType.TABLE)
            return (Table) getSubBlock().getContent();
        else return null;
    }

    public List getList() {
        if (getSubBlock().getType() == SubBlock.BlockType.LIST)
            return (List) getSubBlock().getContent();
        else return null;
    }

    public Block getBlock() {
        return blocks.get(blocks.size() - 1);
    }

    public void newBlock() {
        this.blocks.add(new Block());
    }

    public SubBlock getSubBlock() {
        return this.getBlock().getSubBlock();
    }

    @Override
    public String toString() {
        return "Cv{" +
                "info=" + info +
                ", subBlocks=" + blocks +
                '}';
    }

}
