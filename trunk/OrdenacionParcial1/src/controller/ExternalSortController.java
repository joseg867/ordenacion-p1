/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.domain.externos.MezclaDirecta;

/**
 *
 * @author gustavo
 */
public class ExternalSortController {
    
        private MezclaDirecta mezcla = new MezclaDirecta();
    private static final String F = "F.txt", F1 = "F1.txt", F2 = "F3.txt";

    /**
     *
     * @return
     */
    public MezclaDirecta getMezcla() {
        return mezcla;
    }

    /**
     *
     * @param mezcla
     */
    public void setMezcla(MezclaDirecta mezcla) {
        this.mezcla = mezcla;
    }

    /**
     *
     */
    public ExternalSortController() {
    }

    /**
     *
     * @return
     */
    public double getMilisMezclaDirecta() {
        double t0 = 0, t1 = 0;
        try {
            
            t0 = System.currentTimeMillis();
            getMezcla().MezclaDirecta(F, F1, F2);
            t1 = System.currentTimeMillis() - t0;
            
        } catch (IOException ex) {
            Logger.getLogger(ExternalSortController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t1;
    }
    
}
