/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain.externos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo Canul ArandiLopez Noe Cob
 */
public class MezclaNatural {

    /**
     * Constructor vacio.
     */
    public MezclaNatural() {
    }
    
    

    /**
     * Metodo de ordenacion de Mezcla Natural.
     * @param F
     * @param F1
     * @param F2
     */
    public void mezclaNatural(String F, String F1, String F2) {
        try {
            while (particion(F, F1, F2)) {
                fusiona(F, F1, F2);
            }
        } catch (IOException ex) {
            Logger.getLogger(MezclaNatural.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Particiona los archivos.
     * @param F
     * @param F2
     * @param F3
     * @return booleano - Si hay cambio de secuencia
     * @throws IOException
     */
    public static boolean particion(String F, String F2, String F3) throws IOException {
        String Aux = null, R;
        boolean BAND = true;
        boolean hayCambioDeSecuencia = false;

        FileReader fr = new FileReader(F);
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw2 = new FileWriter(F2);
        BufferedWriter bw2 = new BufferedWriter(fw2);
        PrintWriter pw2 = new PrintWriter(bw2);

        FileWriter fw3 = new FileWriter(F3);
        BufferedWriter bw3 = new BufferedWriter(fw3);
        PrintWriter pw3 = new PrintWriter(bw3);

        String inLineF = br.readLine();
        if (inLineF != null) {
            pw2.print("");
            pw2.println(inLineF);
            BAND = true;
            Aux = inLineF;
        }

        while (inLineF != null) {
            inLineF = br.readLine();
            if (inLineF != null) {
                R = inLineF;
                if (R.toLowerCase().compareTo(Aux.toLowerCase()) > 0 || R.toLowerCase().compareTo(Aux.toLowerCase()) == 0) {
                    Aux = inLineF;
                    if (BAND == true) {
                        pw2.print("");
                        pw2.println(inLineF);
                    } else {
                        pw3.print("");
                        pw3.println(inLineF);
                    }

                } else {
                    Aux = inLineF;
                    if (BAND == true) {
                        pw3.print("");
                        pw3.println(inLineF);
                        BAND = false;
                    } else {
                        pw2.print("");
                        pw2.println(inLineF);
                        BAND = true;
                    }
                    hayCambioDeSecuencia = true;
                }
            }
        }

        pw2.close();
        pw3.close();
        br.close();
        return hayCambioDeSecuencia;
    }

    /**
     * Fuciona los archivos.
     * @param F
     * @param F1
     * @param F2
     * @throws IOException
     */
    public static void fusiona(String F, String F1, String F2) throws IOException {

        boolean b1, b2;
        b1 = true;
        b2 = true;
        String line1 = "", line2 = "";

        //abrir el archivo F1 y F2 para lectura.

        //abre el erchivo F para escritura.
        FileWriter fw = new FileWriter(F);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pwr = new PrintWriter(bw);

        FileReader fr = new FileReader(F1);
        BufferedReader br = new BufferedReader(fr);

        FileReader fr2 = new FileReader(F2);
        BufferedReader br2 = new BufferedReader(fr2);

        line1 = br.readLine();
        line2 = br2.readLine();

        if (line1 != null) {
            b1 = false;
        }
        if (line2 != null) {
            b2 = false;
        }

        while ((line1 != null) || (b1 == false) && (line2 != null) || (b2 == false)) {

            while ((b1 == false) && (b2 == false)) {

                if (line1.toLowerCase().compareTo(line2.toLowerCase()) < 0) {
                    if (line1 != null) {
                        pwr.println(line1);
                    }
                    b1 = true;
                    line1 = br.readLine();
                    if (line1 != null) {
                        b1 = false;
                    }
                } else {
                    if (line2 != null) {
                        pwr.println(line2);
                    }
                    b2 = true;
                    line2 = br2.readLine();
                    if (line2 != null) {
                        b2 = false;
                    }
                }
            }

            while ((b1 == false)) {
                if (line1 != null) {
                    pwr.println(line1);
                }
                b1 = true;
                line1 = br.readLine();
                if (line1 != null) {
                    b1 = false;
                }
            }

            while ((b2 == false)) {
                if (line2 != null) {
                    pwr.println(line2);
                }
                b2 = true;
                line2 = br2.readLine();
                if (line2 != null) {
                    b2 = false;
                }
            }
        }

        if (b1 == false && line1 != null) {
            pwr.println(line1);
        }
        if (b2 == false && line2 != null) {
            pwr.println(line2);
        }

        while (line1 != null) {
            line1 = br.readLine();
            if (line1 != null) {
                pwr.println(line1);
            }
        }
        while (line2 != null) {
            line2 = br2.readLine();
            if (line2 != null) {
                pwr.println(line2);
            }
        }
        fr2.close();
        fr.close();
        pwr.close();
    }//Fin de metodo Fusiona
    
    
    /**
     * 
     * @param args
     */
//    public static void main(String[] args) {
//        MezclaNatural mezcla = new MezclaNatural();
//        String F = "F.txt";
//        String F1 = "F1.txt";
//        String F2 = "F2.txt";
//        mezcla.mezclaNatural(F, F1, F2);
//    }
}//fin de la clase
