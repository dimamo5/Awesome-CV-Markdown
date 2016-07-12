package data;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by diogo on 13/05/2016.
 */
public class Cv {
    private static HashMap<String, String> variables = new HashMap<>();
    public Info info = new Info();
    public ArrayList<Block> blocks = new ArrayList<Block>();

    public static HashMap<String, String> getVariables() {
        return variables;
    }

    public static void setVariables(HashMap<String, String> var) {
        variables = var;
    }

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

    public Text getText() {
        if (getSubBlock().getType() == SubBlock.BlockType.TEXT)
            return (Text) getSubBlock().getContent();
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

    public void removeSubBlock() {
        this.getBlock().removeSubBlock();
    }

    public void removeBlock() {
        if (this.blocks.size() > 1)
            this.blocks.remove(this.blocks.size() - 1);
    }

    @Override
    public String toString() {
        return "Cv{" +
                "info=" + info +
                ", subBlocks=" + blocks +
                '}';
    }
}
