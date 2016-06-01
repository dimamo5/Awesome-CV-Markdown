package data;

/**
 * Created by diogo on 13/05/2016.
 */
public class Icon {
    public String name;
    public double attr1;
    public double attr2;

    public Icon() {
        this.name = "";
        this.attr1 = 0;
        this.attr2 = 0;
    }

    public void setIconName(String name) {
        this.name = name;
    }

    public void setIconAttr1(double attr1) {
        this.attr1 = attr1;
    }

    public void setIconAttr2(double attr2) {
        this.attr2 = attr2;
    }

    public void divide() {
        String[] numbs = name.split("[a-z] *");
        String[] numSembarra;
        if (numbs.length != 0) {
            numSembarra = numbs[numbs.length - 1].split("/");
            this.attr1 = Double.parseDouble(numSembarra[0]);
            this.attr2 = Double.parseDouble(numSembarra[1]);
        }
        String[] n = name.split(" *[0-9](\\.[0-9]/)?");
        if (n.length != 0)
            this.name = n[0];

    }


    @Override
    public String toString() {
        return "Icon{" +
                "name='" + name + '\'' +
                ", attr1=" + attr1 +
                ", attr2=" + attr2 +
                '}';
    }

}
