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
        ordenador = new OrdenamientoInterno();
        ordenaShell = new OrdenamientoShellSort();

    }

    /**
     *
     * @return
     */
    public ArrayList<String> getArregloList() {
        return arregloList;
    }

    /**
     *
     * @param arregloList
     */
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
        getOrdenador().setPalabras(getNewList());
        t0 = System.currentTimeMillis();
        getOrdenador().insercion();
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
        getOrdenador().setPalabras(getNewList());
        t0 = System.currentTimeMillis();
        getOrdenador().burbujaMayor();
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
        getOrdenador().setPalabras(getNewList());
        t0 = System.currentTimeMillis();
        getOrdenador().burbujaMenor();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }

    /**
     *
     * @return
     */
    public double getMilisQuickSort() {
        double t0, t1;
        getOrdenador().setPalabras(getNewList());
        t0 = System.currentTimeMillis();
        getOrdenador().QuikSort();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }

    /**
     *
     * @return
     */
    public double getMilisMergeSort() {
        double t0, t1;
        getOrdenador().setPalabras(getNewList());
        t0 = System.currentTimeMillis();
        getOrdenador().ordenaMerge(getNewList());
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }

    /**
     * ****************************************************************************************************************************
     */
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
        getOrdenaShell().ShellSortHibbard();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }

    /**
     *
     * @return
     */
    public double getMilisShellSeriePapernov() {
        double t0, t1;
        getOrdenaShell().setPalabras(getNewList());
        t0 = System.currentTimeMillis();
        getOrdenaShell().ShellSortPapernov();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }

    /**
     *
     * @return
     */
    public double getMilisShellIncrementoNormal() {
        double t0, t1;
        getOrdenaShell().setPalabras(getNewList());
        t0 = System.currentTimeMillis();
        getOrdenaShell().ShellSortIncremento2();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }

    /**
     *
     * @return
     */
    public double getMilisShellSerieFrank() {
        double t0, t1;
        getOrdenaShell().setPalabras(getNewList());
        t0 = System.currentTimeMillis();
        getOrdenaShell().ShellSortFrank();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }

    /**
     * *************************************************************************************************************************
     * @return 
     */
    public OrdenamientoShellSort getOrdenaShell() {
        return ordenaShell;
    }

    /**
     *
     * @param ordenaShell
     */
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

    private ArrayList<String> getNewList() {
        ArrayList<String> list = this.arregloList;
        return list;
    }
    
    
}//fin de la clase
