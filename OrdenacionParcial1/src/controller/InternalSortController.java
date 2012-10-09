/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.domain.internos.OrdenamientoInterno;
import model.domain.internos.OrdenamientoShellSort;

/**
 *
 * @author ArandiLopez
 */
public class InternalSortController {

    
    //Verificar esto para pasarselo a los modelos
    private ArrayList<String> arregloList;
    private OrdenamientoInterno ordenador;
    private OrdenamientoShellSort ordenaShell;

    /**
     * Constructor.
     */
    public InternalSortController() {
        ordenador =  new OrdenamientoInterno();
        ordenaShell = new OrdenamientoShellSort();
        
    }

    public ArrayList<String> getArregloList() {
        return arregloList;
    }

    public void setArregloList(ArrayList<String> arregloList) {
        this.arregloList = arregloList;
    }
    
    


    /**
     * Metodo para obtner el tiempo de duracion del proceso de ordenamiento de
     * insercion.
     *
     * @return t1
     */
    public double getMilisInsercion() {
        double t0, t1;
        t0 = System.currentTimeMillis();
        getOrdenador().insercion(getNewList());
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }

    /**
     * Metodo para obtner el tiempo de duracion del proceso de ordenamiento de
     * Burbuja mayor.
     *
     * @return t1
     */
    public double getMilisBurbujaMayor() {
        double t0, t1;
        t0 = System.currentTimeMillis();
        getOrdenador().burbujaMayor(getNewList());
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }

    /**
     * Metodo para obtner el tiempo de duracion del proceso de ordenamiento de
     * Burbuja menor.
     *
     * @return
     */
    public double getMilisBurbujaMenor() {
        double t0, t1;
        t0 = System.currentTimeMillis();
        getOrdenador().burbujaMenor(getNewList());
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }
    
    public double getMilisQuickSort() {
        double t0, t1;
        t0 = System.currentTimeMillis();
        getOrdenador().QuikSort(getNewList());
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }
    
    public double getMilisMergeSort() {
        double t0, t1;
        t0 = System.currentTimeMillis();
        getOrdenador().ordenaMerge(getNewList());
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }
    
    /*******************************************************************************************************************************/

    /**
     * Metodo para obtner el tiempo de duracion del proceso de ordenamiento de
     * Shellsort
     *
     * @return
     */
    public double getMilisShellSerieHibberd() {
        double t0, t1;
        getOrdenaShell().setPalabras(getNewList());
        t0 = System.currentTimeMillis();
        getOrdenaShell().shellSortSerieHibberd();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }
    
    public double getMilisShellSeriePapernov() {
        double t0, t1;
        getOrdenaShell().setPalabras(getNewList());
        t0 = System.currentTimeMillis();
        getOrdenaShell().shellSortSeriePapernov();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }
    
    public double getMilisShellIncrementoNormal() {
        double t0, t1;
        getOrdenaShell().setPalabras(getNewList());
        t0 = System.currentTimeMillis();
        getOrdenaShell().ShellSortIncremento2();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }
    
    public double getMilisShellSerieFrank() {
        double t0, t1;
        getOrdenaShell().setPalabras(getNewList());
        t0 = System.currentTimeMillis();
        getOrdenaShell().shellSortSerieFrank();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }
    
    
    /****************************************************************************************************************************/

    public OrdenamientoShellSort getOrdenaShell() {
        return ordenaShell;
    }

    public void setOrdenaShell(OrdenamientoShellSort ordenaShell) {
        this.ordenaShell = ordenaShell;
    }

    /**
     * @return the ordenador
     */
    public OrdenamientoInterno getOrdenador() {
        return ordenador;
    }

    /**
     * @param ordenador the ordenador to set
     */
    public void setOrdenador(OrdenamientoInterno ordenador) {
        this.ordenador = ordenador;
    }
    
    private ArrayList<String> getNewList(){
        ArrayList<String> list = this.arregloList;
        return list;
    }
    
}//fin de la clase
