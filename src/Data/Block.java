package Data;

/**
 * Created by diogo on 13/05/2016.
 */
public class Block {
    public static enum BlockType{TEXT,TABLE,LIST
    }
    private String blockName;
    private String subBlockName;
    private String boldText;
    private BlockType type;
    private Object content;

    public void addBlockName(String s){
        this.blockName=s;
    }

    public void addSubBlockName(String s){
        this.subBlockName=s;
    }

    public void addBoldText(String s){
        this.boldText=s;
    }

    public void setType(BlockType type){
        this.type=type;
    }

}
