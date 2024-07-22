package atividade1;

import java.util.Scanner;

public class EstadioDeFutebol {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Quantos bilhetes foram vendidos na classe A:");
		int quantiClasseA = input.nextInt();

		System.out.println("Quantos bilhetes foram vendidos na classe B:");
		int quantiClasseB= input.nextInt();

		System.out.println("Quantos bilhetes foram vendidos na classe C:");
		int quantiClasseC = input.nextInt();

		System.out.println("A classe A teve R$"+(50.0 * quantiClasseA)+ " de renda com a venda dos bilhetes.");
		System.out.println("A classe B teve R$"+(30.0 * quantiClasseB)+ " de renda com a venda dos bilhetes.");
		System.out.println("A classe C teve R$"+(20.0 * quantiClasseC)+ " de renda com a venda dos bilhetes.");
		
		input.close();
	}
}
