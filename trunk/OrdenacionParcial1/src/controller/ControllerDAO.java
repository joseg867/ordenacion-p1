/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAO;
import java.io.File;

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
    
   
}//
