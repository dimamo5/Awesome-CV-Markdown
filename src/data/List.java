package data;

import java.util.ArrayList;

import static data.List.ListType.*;

/**
 * Created by diogo on 13/05/2016.
 */
public class List {
    public ArrayList<ArrayList<IconText>> list = new ArrayList<>();
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
        IconText t = new IconText();
        t.setText(s);
        ArrayList<IconText> line = new ArrayList<>();
        line.add(t);
        this.list.add(line);
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

    private void analyzeType() {
        for (ArrayList<IconText> elem : list) {
            if (elem.size() != 1) {
                if (hasPlace(elem) && hasQualification(elem) && elem.size() >= 4) {
                    this.type = HONOR;
                    return;
                } else if (elem.get(0).text.length() < 15) {
                    this.type = SIMPLE;
                } else {
                    this.type = QUALIFICATIONS;
                    return;

                }
            }
        }
    }

    private boolean hasQualification(ArrayList<IconText> list) {
        for (IconText it : list) {
            String[] qual = it.text.split("(P|p)lace");
            String[] numb = it.text.split("[\\d]");

            boolean isqualification = ((!qual[0].equals(it.text) && !numb[0].equals(it.text)) || it.text
                    .equalsIgnoreCase("Finalist") || it.text.equalsIgnoreCase("First"));

            if ((qual.length > 0 && numb.length > 0 && isqualification)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPlace(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("place")) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDate(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("date")) {
                return true;
            }
        }
        return false;
    }

    public IconText getDate(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("date")) {
                return it;
            }
        }
        return null;
    }

    public IconText getPlace(ArrayList<IconText> list) {
        for (IconText it : list) {
            if (it.icon.name.equals("place")) {
                return it;
            }
        }
        return null;
    }

    public IconText getFirstElem(ArrayList<IconText> list) {
        for (int i = 0; i < list.size(); i++) {
            IconText it = list.get(i);
            if (!it.icon.name.equals("date") && !it.icon.name.equals("place") && i != 0) {
                return it;
            }
        }
        return null;
    }

    public IconText getSecondElem(ArrayList<IconText> list) {
        for (int i = 0; i < list.size(); i++) {
            IconText it = list.get(i);
            String[] qual = it.text.split("(P|p)lace");
            String[] numb = it.text.split("[\\d]");
            boolean isqualification = ((!qual[0].equals(it.text) && !numb[0].equals(it.text)) || it.text
                    .equalsIgnoreCase("Finalist") || it.text.equalsIgnoreCase("First"));

            if (!it.icon.name.equals("date") && !(qual.length > 0 && numb.length > 0 && isqualification) && i != 0) {
                return it;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "List{" +
                "list=" + list +
                ", type=" + type +
                '}';
    }


    // TODO: 01/06/2016 ver bem deste other
    public enum ListType {
        SIMPLE, QUALIFICATIONS, HONOR
    }
}
