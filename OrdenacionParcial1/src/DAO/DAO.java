package DAO;

import java.util.StringTokenizer;
import java.io.*;

/**
 *
 * @author Noe
 */
public class DAO {

    private int sizeArray=0;
    String path;
    File separado;

    public DAO() {
    }

    public int getSizeArray() {
        return sizeArray;
    }

    public void setSizeArray(int sizeArray) {
        this.sizeArray = sizeArray;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public File getSeparado() {
        return separado;
    }

    public void setSeparado(File separado) {
        this.separado = separado;
    }
    

    public String[] leer(File toRead) {
        this.path = toRead.getAbsolutePath();
        String[] array = null;
        try {
            FileReader reader = new FileReader(toRead);
            BufferedReader bufer = new BufferedReader(reader);
            String aux;
            while (bufer.ready()) {
                aux = bufer.readLine();
                System.out.println(aux);
                StringTokenizer tokenizer = new StringTokenizer(aux, " ");
                while (tokenizer.hasMoreTokens()) {
                    String tmp;
                    if ((tmp=tokenizer.nextToken()).length()>3) {
                        System.out.println(tmp);
                        array[sizeArray] = tmp;
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
        this.separado= new File("separado.txt");
        try {
            FileWriter writer = new FileWriter(separado);
            PrintWriter bufer = new PrintWriter(writer);
            
            for(int i=0 ; i<array.length;i++){
                bufer.println(array[i]);
            }
            
            bufer.close();
            writer.close();
            
        } catch (Exception ex) {
            System.err.println(ex);
        }
        
    }
    
    
}
