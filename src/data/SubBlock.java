package data;

/**
 * Created by diogo on 13/05/2016.
 */
public class SubBlock {
    private String subBlockName;
    private BlockType type;
    private Object content;
    private boolean selected = true;

    public SubBlock() {
    }

    public void toggle() {
        selected = !selected;
    }

    public String getSubBlockName() {
        return subBlockName;
    }

    public void addSubBlockName(String s) {
        //System.out.println(s);
        this.subBlockName = s;
    }

    public Object getContent() {
        return content;
    }

    public BlockType getType() {
        return type;
    }

    public void setType(BlockType type) {
        this.type = type;

        switch (type) {
            case TABLE:
                this.content = new Table();
                break;
            case LIST:
                this.content = new List();
                break;
            case TEXT:
                this.content = new Text();
                break;
        }
    }

    @Override
    public String toString() {
        return "SubBlock{" +
                ", subBlockName='" + subBlockName + '\'' +
                ", type=" + type +
                ", content=" + content +
                '}' +
                '\n';
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public enum BlockType {
        TEXT, TABLE, LIST
    }
}
