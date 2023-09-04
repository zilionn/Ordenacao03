package controller;

import fernando.fatec.br.quick.QuickSort;

public class Ordena {

	public Ordena() {
		super();
	}
	
	public int[] ordenacao(int[] vet) {
		QuickSort quickSort = new QuickSort();
		quickSort.ordenar(vet, 0, (vet.length - 1));
		
		return vet;
	}

}
