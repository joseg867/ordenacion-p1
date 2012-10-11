package controller;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.domain.externos.*;


/**
 * Clase que controla los metodos de ordenamientoexterno
 * @author GustavoCanul, NoeCob, ArandiLopez
 */
public class ExternalSortController {
    

   
    private MezclaDirecta mezclaDirecta = new MezclaDirecta();
    private MezclaEquilibrada mezclaEquilibrada = new MezclaEquilibrada();
    private MezclaNatural mezclaNatural = new MezclaNatural();
    private static final String AUXILIAR1 = "F1.txt", AUXILIAR2 = "F2.txt",AUXILIAR3 = "F3" ;
   

    
    /**
     *
     */
    public ExternalSortController() {
    }

    /**
     * Devuelve los valores de mezclaDirecta
     * @return mezclaDirecta
     */
    public MezclaDirecta getMezclaDirecta() {
        return mezclaDirecta;
    }

    /**
     * Inicializa los valores de mezclaDirecta 
     * @param mezclaDirecta
     */
    public void setMezclaDirecta(MezclaDirecta mezclaDirecta) {
        this.mezclaDirecta = mezclaDirecta;
    }

    /**
     * Devuelve los valores de mezclaEquilibrada 
     * @return the mezclaEquilibrada
     */
    public MezclaEquilibrada getMezclaEquilibrada() {
        return mezclaEquilibrada;
    }

    /**
     * @param mezclaEquilibrada the mezclaEquilibrada to set
     */
    public void setMezclaEquilibrada(MezclaEquilibrada mezclaEquilibrada) {
        this.mezclaEquilibrada = mezclaEquilibrada;
    }
    
     /**
     * @return the mezclaNatural
     */
    public MezclaNatural getMezclaNatural() {
        return mezclaNatural;
    }

    /**
     * @param mezclaNatural the mezclaNatural to set
     */
    public void setMezclaNatural(MezclaNatural mezclaNatural) {
        this.mezclaNatural = mezclaNatural;
    }

    /**
     * Devuelve el tiempo de ejecucion de Mezcladirecta
     * @return t1 
     */
    public double getMilisMezclaDirecta() {
        double t0 = 0, t1 = 0;
        
        try {
            t0 = System.currentTimeMillis();
            getMezclaDirecta().MezclaDirecta("directa.txt", AUXILIAR1, AUXILIAR2);
            t1 = System.currentTimeMillis() - t0;

        } catch (IOException ex) {
            Logger.getLogger(ExternalSortController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t1;
    }

    /**
     * Devuelve el tiempo de ejecucion de MezclaEquilibrada
     * @return t1
     */
    public double getMilisMezclaEquilibrada() {
        double t0 = 0, t1 = 0;
        try {
            t0 = System.currentTimeMillis();
            getMezclaEquilibrada().mezclaequilibrada("equi.txt", AUXILIAR1, AUXILIAR2, AUXILIAR3);  
            t1 = System.currentTimeMillis()- t0;
            
            
        } catch (IOException ex) {
            Logger.getLogger(ExternalSortController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t1;
    }
    /**
     * Devuelve el tiempo de ejecucion de MezclaNatural.
     * @return t1
     */
    public double getMilisMezclaNatural(){
        double t0=0,t1=0;
        try {
            
            t0 = System.currentTimeMillis();
            getMezclaNatural().mezclaNatural("natural.txt", AUXILIAR1, AUXILIAR2);
            t1 = System.currentTimeMillis() - t0;
        } catch (Exception e) {
            System.err.println(e);
        }
        return t1;
    }
    
   
    

   
    
}
