package data;

/**
 * Created by diogo on 13/05/2016.
 */
public class SubBlock {
    public static enum BlockType{TEXT,TABLE,LIST
    }
    private String subBlockName;
    private String boldText;
    private BlockType type;
    private Object content;

    public SubBlock(){}

    public void addSubBlockName(String s){
        //System.out.println(s);
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
        return "SubBlock{" +
                ", subBlockName='" + subBlockName + '\'' +
                ", boldText='" + boldText + '\'' +
                ", type=" + type +
                ", content=" + content +
                '}' +
                 '\n';
    }
}
