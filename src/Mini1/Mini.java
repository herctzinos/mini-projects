package Mini1;

import java.util.ArrayList;

/**
 *
 * @author Herc
 */
public class Mini {

    public static void main(String[] args) {

        vehicle c = new vehicle("BMW", 1300);
        vehicle d = new vehicle("Mercedes", 1800);
        vehicle g = new vehicle("Audi", 2000);
        vehicle o = new vehicle("Fiat", 2500);
        vehicle f = new vehicle();
        ArrayList<vehicle> example = new ArrayList<vehicle>();
        example.add(c);
        example.add(g);
        example.add(d);
        example.add(o);
    }

}
