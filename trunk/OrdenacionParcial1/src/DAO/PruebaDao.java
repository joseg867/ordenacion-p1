package DAO;

import java.io.File;
import javax.swing.JFileChooser;


/**
 *
 * @author Noe
 */
public class PruebaDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         TODO code application logic here
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        chooser.setCurrentDirectory(new File("./"));
        DAO dao = new DAO();
          
        try {
            String[] hola = dao.leer(chooser.getSelectedFile());
            
            //dao.escribir(hola);
        } catch (Exception e) {
            System.out.println("Chinga tu Madre");
        }
        
    }
}
