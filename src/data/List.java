package data;

import java.util.ArrayList;

import static data.List.ListType.*;

/**
 * Created by diogo on 13/05/2016.
 */
public class List {
    public ArrayList<String> listHeader = new ArrayList<>();
    public ArrayList<ArrayList<IconText>> listBody = new ArrayList<>();

    private ListType type;

    public List() {
    }

    public ListType getType() {
        if (type == null) {
            analyzeType();
        }
        return type;
    }

    public void addHeader(String s) {
        this.listHeader.add(Utils.analyzeEscape(s));
    }

    public void newListLine() {
        this.listBody.add(new ArrayList<IconText>());
    }

    public void addListCell(String s, String s1) {
        IconText i = new IconText();

        if (s != null)
            i.setText(Utils.analyzeEscape(s));
        if (s1 != null) {
            i.icon.setIconName(s1.substring(1, s1.length() - 1));
            i.icon.divide();
        }
        this.listBody.get(this.listBody.size() - 1).add(i);
    }

    private void analyzeType() {
        for (ArrayList<IconText> elem : listBody) {
            if (elem.size() != 1) {
                if (hasPlace(elem) && hasDate(elem) && elem.size() > 4) {
                    this.type = QUALIFICATIONS;
                } else
                    this.type = OTHER;
            }
        }
        this.type = SIMPLE;
    }

    private boolean hasPlace(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("place")) {
                return true;
            }
        }
        return false;
    }

    private boolean hasDate(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("date")) {
                return true;
            }
        }
        return false;
    }

    public IconText getDate(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("place")) {
                return it;
            }
        }
        return null;
    }

    public IconText getPlace(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("date")) {
                return it;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "List{" +
                "listHeader=" + listHeader +
                ", listBody=" + listBody +
                '}';
    }

    // TODO: 01/06/2016 ver bem deste other
    public enum ListType {
        SIMPLE, QUALIFICATIONS, HONOR, OTHER
    }
}
