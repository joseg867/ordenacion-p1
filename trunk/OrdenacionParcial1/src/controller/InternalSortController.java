/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.InternalSort;

/**
 *
 * @author ArandiLopez
 */
public class InternalSortController {

    String[] ejemplo = new String[20];//atributo que se debera modificar por el que el DAO recibe.
    InternalSort ordenador = new InternalSort();

    /**
     * Constructor.
     */
    public InternalSortController() {
    }

    /**
     *
     * @return ordenador
     */
    public InternalSort getOrdenador() {
        return ordenador;
    }

    /**
     *
     * @param ordenador
     */
    public void setOrdenador(InternalSort ordenador) {
        this.ordenador = ordenador;
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
        ordenador.insercion(ejemplo);
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
        ordenador.burbujaMayor(ejemplo);
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
        ordenador.burbujaMenor(ejemplo);
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }

    /**
     * Metodo para obtner el tiempo de duracion del proceso de ordenamiento de
     * Shellsort
     *
     * @return
     */
    public double getMilisShell() {
        double t0, t1;
        t0 = System.currentTimeMillis();
        ordenador.ShellSort(ejemplo);
        t1 = System.currentTimeMillis() - t0;
        return t1;
    }
}//fin de la clase
