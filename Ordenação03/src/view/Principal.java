package view;

import controller.Ordena;

public class Principal {

	public static void main(String[] args) {
		Ordena ord = new Ordena();
		
		int[] vet = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		vet = ord.ordenacao(vet);
		
		for(int valor : vet) {
			System.out.print(valor + " ");
		}

	}

}
