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

    public ArrayList<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList<String> palabras) {
        this.palabras = palabras;
    }
    // variacion con secuencias: sec 1,3,5,9,...
    public void Shell_secCuadrados() {
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
            k--; //siguiente valor en secuencia
            Band = true;
            while (Band == true) {
                Band = false;
                I = 0;
                while ((I + INT) < N) {
                    
                    if (palabras.get(I).compareTo(palabras.get(I+INT))<0) {
                    
                        AUX = palabras.get(I);
                        //AUX = A[I];
                        palabras.set(I, palabras.get(I+INT));
                        //A[I] = A[I + INT];
                        palabras.set(I+INT, AUX);
                        //A[I + INT] = AUX;
                        Band = true;
                    }
                    I = I + 1;
                }
            }
        } 
    }

    public void shellSortSerieHibberd() {
        int j, i, incremento = 1, k = 0;
        String temp;

        while (incremento <= palabras.size() + 1) {

            if (k == 0) {
                incremento = 1;
            } else {
                incremento = (int) (Math.pow(2, k)) - (int) 1;
            }
            for (i = incremento; i <= palabras.size() - 1; i++) {

                temp = palabras.get(i);

                j = i;

                while (j >= incremento && palabras.get(j - incremento).toString().toLowerCase().compareTo(temp.toString().toLowerCase()) > 0) {

                    palabras.set(j, palabras.get(j - incremento));
                    j = j - incremento;
                }

                palabras.set(j, temp);
            }
            k++;

            incremento = (int) (Math.pow(2, k)) + (int) 1;
        }
    }

    /**
     * metodo de ordenamiento shell sort con secuencias de la serie de papernov
     */
    public void shellSortSeriePapernov() {
        int j, i, inc = 0, k = 0;
        String temp;

        while (inc <= palabras.size() + 1) {
            if (k == 0) {
                inc = 1;
            } else {
                inc = (int) (Math.pow(2, k)) + (int) 1;
            }

            for (i = inc; i <= palabras.size() - 1; i++) {
                temp = palabras.get(i);

                j = i;
                while (j >= inc && palabras.get(j - inc).toString().toLowerCase().compareTo(temp.toString().toLowerCase()) > 0) {

                    palabras.set(j, palabras.get(j - inc));
                    j = j - inc;
                }

                palabras.set(j, temp);

            }

            k++;
        }

    }

    /**
     * metodo de ordenamiento shell sort con secuencias de la serie de frank
     */
    public void shellSortSerieFrank() {
        int j, i, inc = 0, k = 0;
        int b;
        String temp;

        inc = (int) (2 * ((palabras.size() / Math.pow(2, k + 1)))) + 1;

        while (inc <= palabras.size() + 1) {

            System.out.println(inc);


            for (i = inc; i <= palabras.size() - 1; i++) {

                temp = palabras.get(i);
                j = i;
                while (j >= inc && palabras.get(j - inc).toString().toLowerCase().compareTo(temp.toString().toLowerCase()) > 0) {

                    palabras.set(j, palabras.get(j - inc));
                    j = j - inc;
                }

                palabras.set(j, temp);

            }


            k++;
        }


    }

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
                    // palabra[i].compareTo(palabra[i+b]);

                    if (palabras.get(i).toString().toLowerCase().compareTo(palabras.get(i + b).toString().toLowerCase()) > 0) {
                        aux = palabras.get(i);
                        // aux = palabra[i];
                        // palabra[i] = palabra[i + b];
                        palabras.set(i, palabras.get(i + b));
                        // palabra[i + b] = aux;
                        palabras.set(i + b, aux);
                        band = true;
                    }

                    i = i + 1;
                }
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < palabras.size(); i++) {
            System.out.println(palabras.get(i));
        }
    }
}
