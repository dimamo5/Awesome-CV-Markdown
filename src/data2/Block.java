package data2;

import java.util.ArrayList;

/**
 * Created by diogo on 14/05/2016.
 */
public class Block {
    private String blockName;
    public ArrayList<SubBlock> subBlocks=new ArrayList<>();

    public void addBlockName(String s){
        this.blockName=s;
    }
    public void newSubBlock(){
        this.subBlocks.add(new SubBlock());
    }

    public SubBlock getSubBlock(){
        return this.subBlocks.get(this.subBlocks.size()-1);
    }

    @Override
    public String toString() {
        return "Block{" +
                "blockName='" + blockName + '\'' +
                ", subBlocks=" + subBlocks +
                '}';
    }
}
