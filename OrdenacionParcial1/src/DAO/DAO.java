package DAO;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Noe
 */
public class DAO {

    public String leer() {
        File f;
        javax.swing.JFileChooser j = new javax.swing.JFileChooser();
        j.showOpenDialog(j);
        try {
            String path = j.getSelectedFile().getAbsolutePath();

            String lectura = "";
            f = new File(path);

            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String aux;

                while ((aux = br.readLine()) != null) {
                    lectura = lectura + aux + "\n";
                }
            } catch (IOException e) {
            }

            return lectura;
        } catch (NullPointerException e) {
            javax.swing.JOptionPane.showMessageDialog(j, "");
            System.exit(0);
        }
        return null;
    }
    
//    public String separapalabras (){
//        
//    }
}
