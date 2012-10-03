package DAO;

import java.util.StringTokenizer;
import java.io.*;
import javax.swing.JFileChooser;

/**
 *
 * @author Noe
 */
public class DAO {

    private File rootFile;
    private int sizeArray;

    public int getSizeArray() {
        return sizeArray;
    }

    public void setSizeArray(int sizeArray) {
        this.sizeArray = sizeArray;
    }

    public DAO() {
    }

    public String[] leer(File rootFile, int sizeArray) {

        try {
            String path = rootFile.getAbsolutePath();

            try {
                FileReader fr = new FileReader(rootFile);
                BufferedReader br = new BufferedReader(fr);
                String aux;
                while ((aux = br.readLine()) != null) {
                    //lectura = lectura + aux + "\n";
                    StringTokenizer st = new StringTokenizer(aux," ");
                    String[] arreglo = new String[st.countTokens() + 1];

                    while (st.hasMoreElements()) {
                        arreglo[sizeArray] = st.nextToken();
                        System.out.println(arreglo[sizeArray]);
                        sizeArray++;

                    }

                }
            } catch (IOException e) {
            }

        } catch (NullPointerException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }
        return arreglo;
    }

    /**
     * @return the rootFile
     */
    public File getRootFile() {
        return rootFile;
    }

    /**
     * @param rootFile the rootFile to set
     */
    public void setRootFile(File rootFile) {
        this.rootFile = rootFile;
    }
}
