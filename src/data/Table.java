package data;

import java.util.ArrayList;

/**
 * Created by diogo on 11/05/2016.
 */
public class Table {
    private ArrayList<String> header = new ArrayList<>();
    private ArrayList<ArrayList<IconText>> body = new ArrayList<ArrayList<IconText>>();

    public Table() {
    }

    public void addHeaderCell(String cell) {
        header.add(cell);
    }

    public void addBodyLine() {
        body.add(new ArrayList<IconText>());
    }

    public void addBodyCell(String cell, String s1) {

        IconText i = new IconText();

        if (cell != null)
            i.setText(Utils.analyzeEscape(cell));
        if (s1 != null) {
            i.icon.setIconName(s1.substring(1, s1.length() - 1));
            i.icon.divide();
        }

        body.get(body.size() - 1).add(i);
    }

    @Override
    public String toString() {
        return "Table{" +
                "header=" + header +
                ", body=" + body +
                '}';
    }
}
