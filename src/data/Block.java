package data;

import java.util.ArrayList;

/**
 * Created by diogo on 14/05/2016.
 */
public class Block {
    public ArrayList<SubBlock> subBlocks = new ArrayList<>();
    private String blockName;
    private boolean selected = true;

    public void toggle() {
        setSelected(!selected);

    }

    public void addBlockName(String s) {
        this.blockName = s;
    }

    public void newSubBlock() {
        this.subBlocks.add(new SubBlock());
    }

    public SubBlock getSubBlock() {
        return this.subBlocks.get(this.subBlocks.size() - 1);
    }

    public void removeSubBlock() {
        if (this.subBlocks.size() > 1) {
            this.subBlocks.remove(this.subBlocks.size() - 1);
        }
    }

    public String getBlockName() {
        return blockName;
    }

    @Override
    public String toString() {
        return "Block{" +
                "blockName='" + blockName + '\'' +
                ", subBlocks=" + subBlocks +
                '}';
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        for (SubBlock subBlock : this.subBlocks) {
            subBlock.setSelected(selected);
        }
    }

    public boolean allNotSelected() {
        for (SubBlock subBlock : subBlocks) {
            if (subBlock.isSelected())
                return false;
        }
        return true;
    }
}
