package Data;

import java.util.ArrayList;

/**
 * Created by diogo on 13/05/2016.
 */
public class List {
    public ArrayList<String> listHeader=new ArrayList<>();
    public ArrayList<ArrayList<String>> list=new ArrayList<>();
    public List(){}

    public void addHeader(String s){
        this.listHeader.add(s);
    }

    public void newListLine(){
        this.list.add(new ArrayList<String>());
    }

    public void addListCell(String s){
       this. list.get(this.list.size()-1).add(Utils.analyzeEscape(s));
    }

    @Override
    public String toString() {
        return "List{" +
                "listHeader=" + listHeader +
                ", list=" + list +
                '}';
    }
}
