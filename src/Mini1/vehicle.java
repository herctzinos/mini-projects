package Mini1;

import java.util.ArrayList;

/**
 *
 * @author Herc
 */
public class vehicle {

    private String model;
    private int cc;
    private String manufactor;

    public vehicle() {

    }

    public vehicle(String model, int cc) {
        this.model = model;
        this.cc = cc;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public static ArrayList<vehicle> enginetest(ArrayList<vehicle> example, NewInterface f) {
        ArrayList<vehicle> out = new ArrayList<vehicle>();
        for (vehicle z : example) {
            if (z.getCc() > 1600) {
                out.add(z);
                System.out.println(z.getModel());
            }

        }
        return out;
    }

}
