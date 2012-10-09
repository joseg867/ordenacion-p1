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

    public ControllerDAO() {
        this.dao = new DAO();
    }

    public DAO getDao() {
        return dao;
    }

    public void setDao(DAO dao) {
        this.dao = dao;
    }
    
    public ArrayList<String> readFile(File root){
        return dao.leer(root);
    }
    
    public File writeFile(ArrayList<String> list , String name){
        return dao.escribir(list, name);
    }
   
}//
