package DAO;

import java.util.StringTokenizer;
import java.io.*;

/**
 *
 * @author Noe
 */
public class DAO {

    private int sizeArray;
    String path;

    public String[] leer(File toRead) {
        this.path = toRead.getAbsolutePath();
        String[] array = null;
        try {
            FileReader reader = new FileReader(toRead);
            BufferedReader bufer = new BufferedReader(reader);
            String aux;
            while ((aux = bufer.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(aux, " .,;:¿?¡!=");
                while (tokenizer.hasMoreTokens()) {
                    if (tokenizer.nextToken().length() > 3) {
                        array[sizeArray] = tokenizer.nextToken();
                    }
                    sizeArray++;
                }
            }
            bufer.close();
            reader.close();

        } catch (Exception ex) {
            System.err.println(ex);
        }
        
        return array;

    }//fin de la clase leer
    
    
    public void escribir(String[] array){
        File separado= new File("separado.txt");
        try {
            FileWriter writer = new FileWriter(separado);
            BufferedWriter bufer = new BufferedWriter(writer);
            
            for(int i=0 ; i<array.length;i++){
                bufer.write(array[i]);
                bufer.newLine();
            }
            
            bufer.close();
            writer.close();
            
        } catch (Exception ex) {
            System.err.println(ex);
        }
        
    }
    
    
}
