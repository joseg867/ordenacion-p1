/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gustavo
 */
public class InternalSort {

    public void insercion(String[] arreglo) {
        int i, k;
        String aux;
        for (i = 1; i < arreglo.length; i++) {
            aux = arreglo[i];
            k = i - 1;

            while (k >= 0 && aux.compareTo(arreglo[k]) < 0) {
                arreglo[k + 1] = arreglo[k];
                k--;
            }
            arreglo[k + 1] = aux;

        }
    }
    
    
    public void burbujaMenor(String[] arreglo){
        
        int i , j;
        String aux;
        for(i=1;i<arreglo.length;i++){
            for(j=arreglo.length-1;j>=i;j--){
                if(arreglo[j-1].compareTo(arreglo[j])>0){
                    aux = arreglo[j-1];
                    arreglo[j-1] = arreglo[j];
                    arreglo[j]=aux;
                    
                }
                
            }
        }
        
        
    }
    
    public void burbujaMayor(String[] arreglo){
        
        int i , j;
        String aux;
        for(i=1;i<arreglo.length;i++){
            for(j=0;j<arreglo.length-i;j++){
                if(arreglo[j].compareTo(arreglo[j+1])>0){
                    aux = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j]=aux;
                    
                }
                
            }
        }
        
        
    }
    
    
    public void ShellSort(String[] arreglo){
        
    }

    public void imprimir(String[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    
}
