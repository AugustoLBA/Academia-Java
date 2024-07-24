package atividade6;

public class JogoDaVelhaJOptionPane {
	private String[][] matriz = {

			{" ", " ", " "},
			{" ", " ", " "},
			{" ", " ", " "}};

	public void jogada(int linha, int coluna, String simbolo){
		matriz[linha][coluna] = simbolo;
	}
	public  boolean isValido(int linha, int coluna){
		if(linha < 0 || linha > 2 || coluna < 0 || coluna > 2){
			return false;
		}
		else if(!matriz[linha][coluna].equals(" ")){
			return false;
		}
		return true;
	}

	public void printarTabuleiro() {
		// impress�o do tabuleiro
		System.out.print("\n\n 0   1    2\n\n");
		for (int posicao1 = 0; posicao1 < 3; posicao1++) {
			for (int posicao2 = 0; posicao2 < 3; posicao2++) {
				System.out.print(" " + matriz[posicao1][posicao2]);
				if (posicao2 < 2) {
					System.out.print(" | ");
				}
				if (posicao2 == 2) {
					System.out.print("  " + posicao1);
				}
			}
			if (posicao1 < 2) {
				System.out.print("\n------------");
			}
			System.out.println("\n");
		}
	}

	public String isGanhou(String nomeJogador, int quantiJogadas) {
		if(quantiJogadas == 9){
			return "EMPATE!";
		}
		// Linhas
		if (matriz[0][0].equals("O") && matriz[0][1].equals("O") && matriz[0][2].equals("O") ||
				matriz[1][0].equals("O") && matriz[1][1].equals("O") && matriz[1][2].equals("O") ||
				matriz[2][0].equals("O") && matriz[2][1].equals("O") && matriz[2][2].equals("O")) {
			return nomeJogador +" ganhou!";

		} else if (matriz[0][0].equals("X") && matriz[0][1].equals("X") && matriz[0][2].equals("X") ||
				matriz[1][0].equals("X") && matriz[1][1].equals("X") && matriz[1][2].equals("X") ||
				matriz[2][0].equals("X") && matriz[2][1].equals("X") && matriz[2][2].equals("X")) {
			return nomeJogador +" ganhou!";
		}

		//Colunas
		else if (matriz[0][0].equals("O") && matriz[1][0].equals("O") && matriz[2][0].equals("O") ||
				matriz[0][1].equals("O") && matriz[1][1].equals("O") && matriz[2][1].equals("O") ||
				matriz[0][2].equals("O") && matriz[1][2].equals("O") && matriz[2][2].equals("O")   ){
			return nomeJogador+" ganhou!";
		}
		else if (matriz[0][0].equals("X") && matriz[1][0].equals("X") && matriz[2][0].equals("X") ||
				matriz[0][1].equals("X") && matriz[1][1].equals("X") && matriz[2][1].equals("X") ||
				matriz[0][2].equals("X") && matriz[1][2].equals("X") && matriz[2][2].equals("X")   ){
			return nomeJogador+" ganhou!";
		}

		// Diagonais
		else if (matriz[0][0].equals("O") && matriz[1][1].equals("O") && matriz[2][2].equals("O") ||
				matriz[0][2].equals("O") && matriz[1][1].equals("O") && matriz[2][0].equals("O")) {
			return nomeJogador+" ganhou!";
		}
		else if (matriz[0][0].equals("X") && matriz[1][1].equals("X") && matriz[2][2].equals("X") ||
				matriz[0][2].equals("X") && matriz[1][1].equals("X") && matriz[2][0].equals("X")) {
			return nomeJogador+" ganhou!";
		}
		return null;
	}

}
