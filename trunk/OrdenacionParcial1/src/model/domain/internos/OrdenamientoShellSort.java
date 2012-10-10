/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain.internos;

import java.util.ArrayList;

/**
 *
 * @author gustavo
 */
public class OrdenamientoShellSort {

    private ArrayList<String> palabras;

    /**
     *
     * @return
     */
    public ArrayList<String> getPalabras() {
        return palabras;
    }

    /**
     *
     * @param palabras
     */
    public void setPalabras(ArrayList<String> palabras) {
        this.palabras = palabras;
    }
    

    public void ShellSortPapernov() {
        int INT = 0, I, N, k = 1;
        String AUX;
        boolean Band;
        N = palabras.size();

        while ((INT = (int) (Math.pow(2, k) + 1)) < N) {
            k++;
        }
        k--;

        while (INT > 1) {
            INT = (int) (Math.pow(2, k) + 1);
            if (k == 0) {
                INT = 1;
            }
            k--; 
            Band = true;
            while (Band == true) {
                Band = false;
                I = 0;
                while ((I + INT) < N) {

                    if (palabras.get(I).toLowerCase().compareTo(palabras.get(I + INT).toLowerCase()) > 0) {

                        AUX = palabras.get(I);
                 
                        palabras.set(I, palabras.get(I + INT));
                 
                        palabras.set(I + INT, AUX);
                 
                        Band = true;
                    }
                    I = I + 1;
                }
            }
        }
    }

    public void ShellSortHibbard() {
        int INT = 0, I, N, k = 1;
        String AUX;
        boolean Band;
        N = palabras.size();

        while ((INT = (int) (Math.pow(2, k) - 1)) < N) {
            k++;
        }
        k--;

        while (INT > 1) {
            INT = (int) (Math.pow(2, k) - 1);
            if (k == 0) {
                INT = 1;
            }
            k--; 
            Band = true;
            while (Band == true) {
                Band = false;
                I = 0;
                while ((I + INT) < N) {

                    if (palabras.get(I).toLowerCase().compareTo(palabras.get(I + INT).toLowerCase()) > 0) {

                        AUX = palabras.get(I);

                        palabras.set(I, palabras.get(I + INT));

                        palabras.set(I + INT, AUX);

                        Band = true;
                    }
                    I = I + 1;
                }
            }
        }
    }

    public void ShellSortFrank() {
        int INT = 0, I, N, k = 1;
        String AUX;
        boolean Band = true;
        N = palabras.size();

        INT = (2 * ((N /(int) (Math.pow(2, k + 1))))) + (int)1;

        while (INT > 1) {
            INT = (2 * ((N /(int) (Math.pow(2, k + 1))))) + (int)1;
            k++;
            Band =true;
            while(Band){
                Band = false;
                I = 0;
                while ((I + INT) < N) {

                    if (palabras.get(I).toLowerCase().compareTo(palabras.get(I + INT).toLowerCase()) > 0) {

                        AUX = palabras.get(I);
                        
                        palabras.set(I, palabras.get(I + INT));
                        
                        palabras.set(I + INT, AUX);
                        
                        Band = true;
                    }
                    I = I + 1;
                }
            }
            }
        }
    

    /**
     * metodo de ordenamiento shell sort con secuencias de la serie de frank
     */
    /**
     *
     */
    public void ShellSortIncremento2() {
        int b, i;
        String aux;
        boolean band;
        b = palabras.size() + 1;
        while (b > 1) {
            b = (int) ((Math.floor(b / 2)));
            band = true;
            while (band) {
                band = false;
                i = 0;
                while ((i + b) < (palabras.size())) {


                    if (palabras.get(i).toLowerCase().compareTo(palabras.get(i + b).toString().toLowerCase()) > 0) {
                        aux = palabras.get(i);

                        palabras.set(i, palabras.get(i + b));

                        palabras.set(i + b, aux);
                        band = true;
                    }

                    i = i + 1;
                }
            }
        }
    }

    /**
     *
     */
    public void imprimir() {
        for (int i = 0; i < palabras.size(); i++) {
            System.out.println(palabras.get(i));
        }
    }
}

