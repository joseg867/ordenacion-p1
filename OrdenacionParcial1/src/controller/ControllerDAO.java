package controller;

import DAO.CopiaArchivo;
import DAO.DAO;
import java.io.File;
import java.util.ArrayList;

/** 
 * Clase que controla el DAO 
 * @author GustavoCanul, NoeCob, ArandiLopez
 */
public class ControllerDAO {

    private DAO dao;
    /**
     * Metodo que crea un DAO
     */
    public ControllerDAO() {
        this.dao = new DAO();
    }

    /**
     * obtiene el dao 
     * @return dao 
     */
    public DAO getDao() {
        return dao;
    }

    /**
     * inicializa los valores del dao 
     * @param dao
     */
    public void setDao(DAO dao) {
        this.dao = dao;
    }
    
    /**
     * Lee el archivo 
     * @param root
     * @return dao.leer
     */
    public ArrayList<String> readFile(File root){
        return dao.leer(root);
    }
    
    /**
     * Escribe en el archivo 
     * @param list
     * @param name
     * @return dao.escribir 
     */
    public File writeFile(ArrayList<String> list , String name){
        return dao.escribir(list, name);
    }
   
   
}//
