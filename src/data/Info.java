package data;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

/**
 * Created by diogo on 11/05/2016.
 */
public class Info {
    private String name;
    private ArrayList<String> sub = new ArrayList<>();
    private String address = null;
    private ArrayList<IconText> contacts = new ArrayList<>();

    public void addName(String name) {
        if (this.name != null) {
            this.name = this.name + " " + name;
        } else {
            this.name = name;
        }
        this.name = this.name.trim();
    }

    public void addSub(String sub) {
        String s = this.sub.get(this.sub.size() - 1);
        if (s == null) {
            this.sub.set(this.sub.size() - 1, sub.trim());
        } else {
            this.sub.set(this.sub.size() - 1, this.sub.get(this.sub.size() - 1) + " " + sub.trim());
        }
    }

    public void newSub() {
        this.sub.add(null);
    }

    public void addAddress(String address) {
        this.address = Utils.analyzeEscape(address);
    }

    public void addContacts(String contacts, String s1) {
        IconText i = new IconText();

        if (contacts != null)
            i.setText(Utils.analyzeEscape(contacts));
        if (s1 != null) {
            i.icon.setIconName(s1.substring(1, s1.length() - 1));
            i.icon.divide();
        }
        this.contacts.add(i);
    }

    public String analyze(ParserRuleContext ctx) {
        String ret = "";
        for (int i = 0; i < ctx.getChildCount(); i++)
            ret += ctx.getChild(i);

        System.out.println(ret);
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getSub() {
        return sub;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<IconText> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", sub=" + sub +
                ", address='" + address + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
