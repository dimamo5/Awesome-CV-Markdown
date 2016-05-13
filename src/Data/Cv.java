package Data;

import java.util.ArrayList;

/**
 * Created by diogo on 13/05/2016.
 */
public class Cv {
    public Info info = new Info();
    public ArrayList<Block> blocks = new ArrayList<Block>();

    public Block getBlock(){
        return blocks.get(blocks.size()-1);
    }
}
