/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain.internos;

import java.util.ArrayList;
import model.domain.Internos.OrdenamientoInterno;

/**
 *
 * @author gustavo
 */
public class testOrdenamientoInterno {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrdenamientoInterno ordenamiento = new OrdenamientoInterno();
		OrdenamientoShellSort ordenamientoShell =  new OrdenamientoShellSort();

		ArrayList<String> arreglo = new ArrayList<String>();
		arreglo.add("Arandi");
		arreglo.add("Lopez");
		arreglo.add("alonzo");
		arreglo.add("lopez");
		arreglo.add("lópez");
		arreglo.add("Gustavo");
		arreglo.add("Canul");
		arreglo.add("Poot");
		arreglo.add("Jóse");
		arreglo.add("Noé");
		arreglo.add("noe");
		arreglo.add("hola");
		arreglo.add("Aba");
		
		
		//ordenamiento.setPalabras(arreglo);
		ordenamientoShell.setPalabras(arreglo);
		//ordenamiento.burbujaMenor();
		//ordenamientoShell.shellSortSerieFrank();
                ordenamientoShell.Shell_secCuadrados();
		//ordenamientoShell.shellSortSeriePapernov();
		//ordenamientoShell.shellSortSerieHibberd();
		ordenamientoShell.imprimir();
		 //ordenamiento.burbujaMayor();
		// ordenamiento.burbujaMenor();
		// ordenamiento.ShellSort();
		//ordenamiento.QuikSort();
		//arreglo = ordenamiento.ordenaMerge(arreglo);
		//ordenamiento.imprimir();
		//System.out.println(arreglo);

	}
    
}
