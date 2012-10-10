package model.domain.internos;

import java.util.ArrayList;

public class OrdenamientoInterno {

	private ArrayList<String> palabras;

	public ArrayList<String> getPalabras() {
		return palabras;
	}

	public void setPalabras(ArrayList<String> palabras) {

		this.palabras = palabras;

	}

	public void insercion(ArrayList<String> palabras) {
		int i, k;
		String aux;
		for (i = 1; i < palabras.size(); i++) {

			aux = palabras.get(i);
			k = i - 1;

			while (k >= 0 && aux.toLowerCase().compareTo(palabras.get(k).toLowerCase()) < 0) {

				palabras.set(k + 1, palabras.get(k));

				k--;
			}
			palabras.set(k + 1, aux);

		}
	}

	public void burbujaMenor(ArrayList<String> palabras) {
		int i, j;
		String aux;
		for (i = 1; i < palabras.size(); i++) {
			for (j = palabras.size() - 1; j >= i; j--) {
				
				
				if (palabras.get(j - 1).toLowerCase().compareTo(palabras.get(j).toLowerCase()) > 0) {
					aux = palabras.get(j - 1);

					palabras.set(j - 1, palabras.get(j));

					palabras.set(j, aux);

				}
			}
		}
	}

	/**
	 * Metodo de ordenamiento interno por burbuja mayor
	 */
	public void burbujaMayor(ArrayList<String> palabras) {
		int i, j;
		String aux;
		for (i = 1; i < palabras.size(); i++) {
			for (j = 0; j < palabras.size() - i; j++) {

				if (palabras.get(j).toLowerCase().compareTo(palabras.get(j + 1).toLowerCase()) > 0) {
					aux = palabras.get(j + 1);

					palabras.set(j + 1, palabras.get(j));

					palabras.set(j, aux);

				}
			}
		}
	}

	/**
	 * Metodo de ordenamiento interno quickSort que maneja el parseo de los
	 * pivotes
	 */
	public void QuikSort(ArrayList<String> palabras) {
		int ini, fin, pos;
		ArrayList<Integer> pilaMenor = new ArrayList<>(), pilaMayor = new ArrayList<>();
		pilaMenor.add(0);
		pilaMayor.add(palabras.size() - 1);

		while (!pilaMenor.isEmpty()) {
			ini = (Integer) pilaMenor.get(pilaMenor.size() - 1);
			fin = (Integer) pilaMayor.get(pilaMayor.size() - 1);
			pilaMenor.remove(pilaMenor.size() - 1);
			pilaMayor.remove(pilaMayor.size() - 1);
			pos = posicionaQuickSort(ini, fin);
			if (ini < pos - 1) {
				pilaMenor.add(ini);
				pilaMayor.add(pos - 1);
			}
			if (fin > pos + 1) {
				pilaMenor.add(pos + 1);
				pilaMayor.add(fin);
			}
		}
	}

	/**
	 * Metodo de ordenamiento interno quickSort donde se compara las cadenas
	 * 
	 * @param ini
	 * @param fin
	 * @return
	 */
	public int posicionaQuickSort(int ini, int fin) {
		int pos = 0;
		int izq, der;
		String aux;
		boolean band;
		izq = ini;
		der = fin;
		pos = ini;
		band = true;
		while (band) {

			while (palabras.get(pos).toLowerCase().compareTo(palabras.get(der).toLowerCase()) <= 0
					&& pos != der) {
				der--;
			}
			if (pos == der) {
				band = false;
			} else {

				aux = palabras.get(pos);

				palabras.set(pos, palabras.get(der));

				palabras.set(der, aux);
				pos = der;
				while (palabras.get(pos).toLowerCase().compareTo(palabras.get(izq).toLowerCase()) >= 0
						&& pos != izq) {
					izq++;
				}
				if (pos == izq) {
					band = false;
				} else {

					aux = palabras.get(pos);

					palabras.set(pos, palabras.get(izq));

					palabras.set(izq, aux);
					pos = izq;
				}

			}
		}
		return pos;
	}

	public ArrayList<String> ordenaMerge(ArrayList<String> L) {
		int n = L.size(), i, m;
		ArrayList<String> L1 = new ArrayList<>(), L2 = new ArrayList<>();
		if (n > 1) {
			m = n / 2;
			for (i = 0; i < m; i++)
				L1.add(L.get(i));

			for (i = m; i < n; i++)
				L2.add(L.get(i));
			L = Merge(ordenaMerge(L1), ordenaMerge(L2));

		}
		return L;

	}

	public ArrayList<String> Merge(ArrayList<String> L1, ArrayList<String> L2) {

		ArrayList<String> Lista = new ArrayList<>();
		while ((!L1.isEmpty()) && (!L2.isEmpty())) {

			if (L1.get(0).toLowerCase().compareTo(L2.get(0).toLowerCase()) < 0) {
				Lista.add(L1.get(0));
				L1.remove(0);
				if (L1.isEmpty()) {
					Lista.addAll(L2);
					L2.clear();
				}
			} else {
				Lista.add(L2.get(0));
				L2.remove(0);
				if (L2.isEmpty()) {
					Lista.addAll(L1);
					L1.clear();
				}
			}

		}

		return Lista;
	}

	public void imprimir(ArrayList<String> palabras) {
		for (int i = 0; i < palabras.size(); i++) {
			System.out.println(palabras.get(i));

		}
	}

}
