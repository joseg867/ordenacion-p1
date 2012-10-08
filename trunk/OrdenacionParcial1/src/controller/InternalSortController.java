/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.domain.Internos.OrdenamientoInterno;
import model.domain.internos.OrdenamientoShellSort;

/**
 *
 * @author ArandiLopez
 */
public class InternalSortController {

    String[] ejemplo = new String[20];//atributo que se debera modificar por el que el DAO recibe.
    
    //Verificar esto para pasarselo a los modelos
    ArrayList<String> arreglo = new ArrayList<String>();
    private OrdenamientoInterno ordenador = new OrdenamientoInterno();
    private OrdenamientoShellSort ordenaShell =  new OrdenamientoShellSort();

    /**
     * Constructor.
     */
    public InternalSortController() {
        
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
        t0 = System.currentTimeMillis();
        getOrdenador().burbujaMenor();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }
    
    public double getMilisQuickSort() {
        double t0, t1;
        t0 = System.currentTimeMillis();
        getOrdenador().QuikSort();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }
    
    public double getMilisMergeSort() {
        double t0, t1;
        t0 = System.currentTimeMillis();
        getOrdenador().ordenaMerge(arreglo);
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }
    

    /**
     * Metodo para obtner el tiempo de duracion del proceso de ordenamiento de
     * Shellsort
     *
     * @return
     */
    public double getMilisShellSerieHibberd() {
        double t0, t1;
        t0 = System.currentTimeMillis();
        getOrdenaShell().shellSortSerieHibberd();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }
    
    public double getMilisShellSeriePapernov() {
        double t0, t1;
        t0 = System.currentTimeMillis();
        getOrdenaShell().shellSortSeriePapernov();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }
    
    public double getMilisShellIncrementoNormal() {
        double t0, t1;
        t0 = System.currentTimeMillis();
        getOrdenaShell().ShellSortIncremento2();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }
    
    public double getMilisShellSerieFrank() {
        double t0, t1;
        t0 = System.currentTimeMillis();
        getOrdenaShell().shellSortSerieFrank();
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }

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
}//fin de la clase
