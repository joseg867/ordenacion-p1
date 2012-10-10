/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.domain.externos.MezclaDirecta;
import model.domain.externos.MezclaEquilibrada;

/**
 *
 * @author gustavo
 */
public class ExternalSortController {

    private MezclaDirecta mezclaDirecta = new MezclaDirecta();
    private MezclaEquilibrada mezclaEquilibrada = new MezclaEquilibrada();
    private static final String ARCHIVOORIGEN = "F.txt", AUXILIAR1 = "F1.txt", AUXILIAR2 = "F3.txt";

    /**
     *
     * @return
     */
    public MezclaDirecta getMezclaDirecta() {
        return mezclaDirecta;
    }

    /**
     *
     * @param mezclaDirecta
     */
    public void setMezclaDirecta(MezclaDirecta mezclaDirecta) {
        this.mezclaDirecta = mezclaDirecta;
    }

    public MezclaEquilibrada getMezclaEquilibrada() {
        return mezclaEquilibrada;
    }

    public void setMezclaEquilibrada(MezclaEquilibrada mezclaEquilibrada) {
        this.mezclaEquilibrada = mezclaEquilibrada;
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
            //getMezcla().MezclaDirecta(getNewArchivo(), AUXILIAR1, AUXILIAR2)
            getMezclaDirecta().MezclaDirecta(ARCHIVOORIGEN, AUXILIAR1, AUXILIAR2);
            t1 = System.currentTimeMillis() - t0;

        } catch (IOException ex) {
            Logger.getLogger(ExternalSortController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t1;
    }

    public double getMilisMezclaEquilibrada() {
        double t0 = 0, t1 = 0;
        
        
        
        return t0;
    }
}
