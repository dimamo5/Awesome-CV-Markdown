package data;

import java.util.ArrayList;

/**
 * Created by diogo on 13/05/2016.
 */
public class List {
    public ArrayList<String> listHeader = new ArrayList<>();
    public ArrayList<ArrayList<IconText>> list = new ArrayList<>();

    public List() {
    }

    public void addHeader(String s) {
        this.listHeader.add(Utils.analyzeEscape(s));
    }

    public void newListLine() {
        this.list.add(new ArrayList<IconText>());
    }

    public void addListCell(String s, String s1) {
        IconText i = new IconText();

        if (s != null)
            i.setText(Utils.analyzeEscape(s));
        if (s1 != null) {
            i.icon.setIconName(s1.substring(1, s1.length() - 1));
            i.icon.divide();
        }
        this.list.get(this.list.size() - 1).add(i);
    }

    @Override
    public String toString() {
        return "List{" +
                "listHeader=" + listHeader +
                ", list=" + list +
                '}';
    }
}
