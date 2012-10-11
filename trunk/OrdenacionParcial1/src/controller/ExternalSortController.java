/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.stream.FileImageOutputStream;
import javax.swing.JFileChooser;
import model.domain.externos.MezclaDirecta;
import model.domain.externos.MezclaEquilibrada;

/**
 *
 * @author gustavo
 */
public class ExternalSortController {
    

    private File origen;
    private MezclaDirecta mezclaDirecta = new MezclaDirecta();
    private MezclaEquilibrada mezclaEquilibrada = new MezclaEquilibrada();
    private static final String ARCHIVOORIGEN = "F.txt", AUXILIAR1 = "F1.txt", AUXILIAR2 = "F2.txt",AUXILIAR3 = "F3" ;

    
    public ExternalSortController() {
    }

    public File getOrigen() {
        return origen;
    }

    public void setOrigen(File Origen) {
        this.origen = Origen;
    }

    
    
    /**
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

    /**
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
     *
     * @return
     */
    public double getMilisMezclaDirecta() {
        double t0 = 0, t1 = 0;
        try {
            t0 = System.currentTimeMillis();
            getMezclaDirecta().MezclaDirecta("separado.txt", AUXILIAR1, AUXILIAR2);
            t1 = System.currentTimeMillis() - t0;

        } catch (IOException ex) {
            Logger.getLogger(ExternalSortController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t1;
    }

    public double getMilisMezclaEquilibrada() {
        double t0 = 0, t1 = 0;
        try {
            
            t0 = System.currentTimeMillis();
            getMezclaEquilibrada().mezclaequilibrada(getCopyFile(origen), AUXILIAR1, AUXILIAR2, AUXILIAR3);  
            t1 = System.currentTimeMillis()- t0;
            
            
        } catch (IOException ex) {
            Logger.getLogger(ExternalSortController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t1;
    }
    
    public String getCopyFile(File separado){
        File copySeparado = new File(ARCHIVOORIGEN);
        try {
            FileChannel in = (new FileInputStream(separado)).getChannel();
            FileChannel out = (new FileOutputStream(copySeparado)).getChannel();
            in.transferTo(0, separado.length(), out);
            in.close();
            out.close();
        } catch (Exception ex) {
            System.err.println(ex);
        }
        
        return copySeparado.getName();
    }
    
}
