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

    public DAO() {
        lista = new ArrayList();
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
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
        setPath(toRead.getAbsolutePath());
        String[] array = null;
        try {
            FileReader reader = new FileReader(toRead);
            BufferedReader bufer = new BufferedReader(reader);
            String aux;
            while ((aux = bufer.readLine()) != null) {
                System.out.println(aux);
                StringTokenizer tokenizer = new StringTokenizer(aux, " ");
                while (tokenizer.hasMoreTokens()) {
                    String tmp = tokenizer.nextToken();
                    if (tmp.length() > 3) {
                        System.out.println(tmp);
                        lista.add(tmp);
                    }
                }
            }
            bufer.close();
            reader.close();

        } catch (Exception ex) {
            System.err.println(ex);
        }

        return array;

    }//fin de la clase leer

    public void escribir(ArrayList<String> lista) {
        this.separado = new File("separado.txt");
        try {
            FileWriter writer = new FileWriter(separado);
            PrintWriter bufer = new PrintWriter(writer);

            for (int i = 0; i < lista.size(); i++) {
                bufer.println(lista.get(i));
            }

            bufer.close();
            writer.close();

        } catch (Exception ex) {
            System.err.println(ex);
        }

    }

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
        }


    }
}
