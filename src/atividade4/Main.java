package atividade4;

import java.util.Scanner;

public class Main {

	public static void realizarJogada(Scanner input, JogoDeXadrez jogo) {
		boolean isPrimeiraJogada = true;

		while (true) {
			jogo.imprimirTabuleiro();
			System.out.println("Digite a linha origem (ou -1 para sair): ");
			int linhaOrigem = input.nextInt();

			System.out.println("Digite a coluna origem (ou -1 para sair): ");
			int colunaOrigem = input.nextInt();

			if (linhaOrigem == -1 || colunaOrigem == -1) {
				System.out.println("Saindo do jogo.");
				break;
			}

			System.out.println("Digite a linha de destino: ");
			int linhaDestino = input.nextInt();
			System.out.println("Digite a coluna de destino: ");
			int colunaDestino = input.nextInt();

			if(linhaOrigem < 0 || linhaOrigem >= 8 || colunaOrigem  < 0 || colunaOrigem >= 8 ||
					linhaDestino < 0 || linhaDestino >= 8 || colunaDestino  < 0 || colunaDestino >= 8) {
				System.out.println("Posições invalidas!");
			}
			else {
				if (jogo.isPeao(linhaOrigem, colunaOrigem)) {
					if (jogo.isJogadaValida(linhaDestino, colunaDestino, linhaOrigem, colunaOrigem, isPrimeiraJogada)) {
						jogo.jogada(linhaDestino, colunaDestino, linhaOrigem, colunaOrigem);
						isPrimeiraJogada = false;
					} else {
						System.out.println("Movimento inválido. Tente novamente.");
					}
				} else {
					System.out.println("A peça de origem não é um peão. Tente novamente.");
				}
			}

		}
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		JogoDeXadrez xadrez = new JogoDeXadrez();

		Main.realizarJogada(input, xadrez);


	}

}
