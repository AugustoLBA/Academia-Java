package atividade2;

import java.util.Scanner;

public class LocalizarNumero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();


		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
		//0 1 2 3 4 5 6 7 8 9
		int indice = 0;
		boolean achou = false;

		for (int i=0; i<10; i++) {
			if (vetor[i] == numero){
				achou = true;
				indice = i;
			}
		}
		if (achou) {
			System.out.println("Achei");
			System.out.printf("Na Posi��o %d est� localizado do numero %d.", indice, vetor[indice]);			
		}
		input.close();
	}
	
}


