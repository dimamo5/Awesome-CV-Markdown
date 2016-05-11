package Data;

import java.util.ArrayList;

/**
 * Created by diogo on 11/05/2016.
 */
public class Table {
    private ArrayList<String> header=new ArrayList<>();
    private ArrayList<ArrayList<String>> body = new ArrayList<ArrayList<String>>();

    public Table(){
    }

    public void addHeaderCell(String cell){
        header.add(cell);
    }
    public void addBodyLine(){
        body.add(new ArrayList<String>());
    }

    public void addBodyCell(String cell){
        body.get(body.size()-1).add(cell);
    }

}
