package DAO;

import java.io.*;
import javax.swing.JFileChooser;

/**
 *
 * @author Noe
 */
public class DAO {

    public String leer() {
        File f;
        JFileChooser j = new JFileChooser();
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
