package DAO;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;

/**
 *
 * @author Noe
 */
public class DAO {

    private String path;
    private File separado;
    private ArrayList<String> lista;

    /**
     * Metodo que crea un ArrayList
     */
    public DAO() {
        lista = new ArrayList();
    }

    /**
     * Metodo que obtiene los valores a la lista
     * @return lista
     */
    public ArrayList<String> getLista() {
        return lista;
    }

    /**
     * Metodo que inicializa los valores de la lista
     * @param lista
     */
    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    /**
     * Metodo que obtiene la ruta del archivo
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * Metodo que asigna la direccion del archivo
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     *
     * @return
     */
    public File getSeparado() {
        return separado;
    }

    /**
     *
     * @param separado
     */
    public void setSeparado(File separado) {
        this.separado = separado;
    }

    /**
     * Metodo que lee un archivo 
     * @param toRead
     * @return lista
     */
    public ArrayList<String> leer(File toRead) {
        setPath(toRead.getAbsolutePath());
        String[] array = null;
        try {
            FileReader reader = new FileReader(toRead);
            BufferedReader bufer = new BufferedReader(reader);
            String aux;
            while ((aux = bufer.readLine()) != null) {
                //System.out.println(aux);
                StringTokenizer tokenizer = new StringTokenizer(aux, " -_,.;:¿?¡!()\"\"");
                while (tokenizer.hasMoreTokens()) {
                    String tmp = tokenizer.nextToken();
                    if (tmp.length() > 3) {
                        // System.out.println(tmp);
                        lista.add(tmp);
                    }
                }
            }
            bufer.close();
            reader.close();

        } catch (Exception ex) {
            System.err.println(ex);
        }

        return lista;

    }//fin de la clase leer

    /**
     * Metodo que crea un archivo .txt
     * @param array
     * @param nameNew
     * @return this.separado
     */
    public File escribir(ArrayList<String> array, String nameNew) {
        this.separado = new File(nameNew + ".txt");
        try {
            FileWriter writer = new FileWriter(separado);
            PrintWriter bufer = new PrintWriter(writer);

            for (int i = 0; i < lista.size(); i++) {
                bufer.println(array.get(i));
            }

            bufer.close();
            writer.close();

        } catch (Exception ex) {
            System.err.println(ex);
        }
        return this.separado;
    }
    
    /**
     * Metodo pone los Strings del archivo en un array
     * @param lista
     * @return array
     */
    public String[] toArray(ArrayList<String> lista) {
        String[] array = new String[lista.size()];
        for(int i=0 ; i<lista.size();i++){
            array[i]=lista.get(i);
        }
        
        return array ;
    }

//    public static void main(String[] args) {
////         TODO code application logic here
//
//        JFileChooser chooser = new JFileChooser();
//        chooser.showOpenDialog(null);
//        chooser.setCurrentDirectory(new File("./"));
//        DAO dao = new DAO();
//
//        try {
//            //dao.leer(chooser.getSelectedFile());
//            
//            String[]Hola = dao.leer(chooser.getSelectedFile());
//            
//            for(int i = 0; i< Hola.length; i++){
//                System.out.println(Hola[i]);
//            }
//
//            //dao.escribir(hola);
//        } catch (Exception e) {
//        
//        }
//    }
//    
}
