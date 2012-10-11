/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 *
 * @author ArandiLopez
 */
public class CopiaArchivo {
    
    
    /**
     * Crea una copia de un archivo
     * @param file - archivo a copiar
     * @param name - nombre del archivo nuevo
     */
    public void createCopyFile(File separado, String name){
        File copySeparado = new File(name);
        try {
            FileChannel in = (new FileInputStream(separado)).getChannel();
            FileChannel out = (new FileOutputStream(copySeparado)).getChannel();
            in.transferTo(0, separado.length(), out);
            in.close();
            out.close();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
}//fin de la clase
