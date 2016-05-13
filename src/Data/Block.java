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

    public Block(){}

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

        switch(type){
            case TABLE:this.content=new Table();
                break;
            case LIST:this.content=new List();
                break;
            //TODO texto ver como fazer e ver do icons
        }
    }

    public Object getContent(){
        return content;
    }

    public BlockType getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Block{" +
                "blockName='" + blockName + '\'' +
                ", subBlockName='" + subBlockName + '\'' +
                ", boldText='" + boldText + '\'' +
                ", type=" + type +
                ", content=" + content +
                '}';
    }
}
