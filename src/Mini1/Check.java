/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mini1;

/**
 *
 * @author Herc
 */
public class Check implements NewInterface {

    @Override
    public boolean contains(vehicle v) {
        boolean flag = false;
        if (v.getCc() > 1600) {
            flag = true;
        }
        return flag;

    }
}
