/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAO;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author ArandiLopez
 */
public class ControllerDAO {

    DAO dao;

    /**
     * Metodo que crea un DAO
     * @param Dao 
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
     * 
     * @param root
     * @return dao.leer
     */
    public ArrayList<String> readFile(File root){
        return dao.leer(root);
    }
    
    /**
     * Metodo que escribe en el archivo 
     * @param list
     * @param name
     * @return dao.escribir 
     */
    public File writeFile(ArrayList<String> list , String name){
        return dao.escribir(list, name);
    }
   
}//
