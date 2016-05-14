package Data;

import java.util.ArrayList;

/**
 * Created by diogo on 13/05/2016.
 */
public class Cv {
    public Info info = new Info();
    public ArrayList<Block> blocks = new ArrayList<Block>();

    public Table getTable() {
        if (blocks.get(blocks.size() - 1).getType() == Block.BlockType.TABLE)
            return (Table) blocks.get(blocks.size() - 1).getContent();
        else return null;
    }

    public List getList() {
        if (blocks.get(blocks.size() - 1).getType() == Block.BlockType.LIST)
            return (List) blocks.get(blocks.size() - 1).getContent();
        else return null;
    }

    public Block getBlock(){
        return blocks.get(blocks.size()-1);
    }

    public void newBlock(){
        this.blocks.add(new Block());
    }

    @Override
    public String toString() {
        return "Cv{" +
                "info=" + info +
                ", blocks=" + blocks +
                '}';
    }

}
