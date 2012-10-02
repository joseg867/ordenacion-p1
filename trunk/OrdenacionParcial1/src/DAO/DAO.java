package DAO;

import java.io.*;
import javax.swing.JFileChooser;

/**
 *
 * @author Noe
 */
public class DAO {
    
    File raiz; //este es el archivo raiz del cual se dividira

    public DAO(File raiz) {
        this.raiz = raiz;
    }

    public File getRaiz() {
        return raiz;
    }

    public void setRaiz(File raiz) {
        this.raiz = raiz;
    }
    
    

    public String leer() {
        File f;
        JFileChooser j = new JFileChooser();
        j.showOpenDialog(j);
        String lectura = null;
        try {
            String path = j.getSelectedFile().getAbsolutePath();

            lectura = "";
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
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }
        return lectura;
    }
//    public String separapalabras (){
//        
//    }
}
