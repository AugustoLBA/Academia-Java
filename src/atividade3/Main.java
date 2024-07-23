package atividade3;

import java.util.Scanner;

public class Main {
	public static void realizarJogada(Scanner input, JogoDavelha jogoDavelha, String nomeJogador, String simbolo) {
        int linha;
        int coluna;
        boolean aux;
        System.out.println(nomeJogador + " (" + simbolo + "), sua vez!");
        do {
            System.out.print("Digite a linha (0-2): ");
            linha = input.nextInt();
            System.out.print("Digite a coluna (0-2): ");
            coluna = input.nextInt();
            aux = jogoDavelha.isValido(linha, coluna);
            if (!aux) {
                System.out.println("Posição inválida, tente novamente!");
            }
        } while (!aux);
        jogoDavelha.jogada(linha, coluna, simbolo);
    }

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	     JogoDavelha jogoDaVelha = new JogoDavelha();

	        int quantiJogadas = 0;
	        String resultado = null;

	        while (resultado == null) {
	            jogoDaVelha.printarTabuleiro();
	            if (quantiJogadas % 2 == 0) {
	                realizarJogada(input, jogoDaVelha, "Jogador1", "X");
	                resultado = jogoDaVelha.isGanhou("Jogador1", ++quantiJogadas);
	            } else {
	                realizarJogada(input, jogoDaVelha, "Jogador2", "O");
	                resultado = jogoDaVelha.isGanhou("Jogador2", ++quantiJogadas);
	            }
	        }

	        jogoDaVelha.printarTabuleiro();
	        System.out.println(resultado);
	        input.close();

	}

}
