package data;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

/**
 * Created by diogo on 11/05/2016.
 */
public class Info {
    private String name = null;
    private ArrayList<String> sub=new ArrayList<>();
    private String address =null;
    private ArrayList<String> contacts=new ArrayList<>();

    public void addName(String name){
        if(this.name != null) {
            this.name = this.name + " " + name;
        }
        else{
            this.name= name;
        }
    }

    public void addSub(String sub){
        String s =this.sub.get(this.sub.size()-1);
        if(s==null){
            this.sub.set(this.sub.size()-1,sub);
        }else {
            this.sub.set(this.sub.size() - 1, this.sub.get(this.sub.size() - 1) +" " + sub);
        }
    }
    public void newSub(){
        this.sub.add(null);
    }

    public void addAddress(String address){
        this.address=address;
    }
    public void addContacts(String contacts){
        this.contacts.add(contacts);
    }

    public String analyze(ParserRuleContext ctx){
        String ret="";
        for(int i =0; i<ctx.getChildCount();i++)
        ret+=ctx.getChild(i);

        System.out.println(ret);
        return null;
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
