package Data;

import java.util.ArrayList;

/**
 * Created by diogo on 11/05/2016.
 */
public class Info {
    private String name = null;
    private ArrayList<String> sub;
    private String address =null;


    private ArrayList<String> contacts;

    public void addName(String name){
        if(this.name != null) {
            this.name = this.name + " " + name;
        }
        else{
            this.name= name;
        }
    }

    public void addSub(String sub){
        this.sub.add(sub);
    }
    public void addAddress(String address){
        this.address=address;
    }
    public void addContacts(String contacts){
        this.sub.add(contacts);
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
