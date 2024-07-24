package atividade7;

public class JogoDeXadrezJOptionPane {
	private String[][] matriz = { 
			{"R","N","B","Q","K","B","N","R"},
			{"P","P","P","P","P","P","P","P"},
			{" "," "," "," "," "," "," "," "},
			{" "," "," "," "," "," "," "," "},
			{" "," "," "," "," "," "," "," "},
			{" "," "," "," "," "," "," "," "},
			{"p","p","p","p","p","p","p","p"},
			{"r","n","b","q","k","b","n","r"}};


	public void imprimirTabuleiro() {
		System.out.print("");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(i + "  ");
		}
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println(i);
		}
	}

	public boolean isPeao(int linhaOrigem, int colunaOrigem) {
		return matriz[linhaOrigem][colunaOrigem].equals("p") || matriz[linhaOrigem][colunaOrigem].equals("P");
	}

	public void jogada(int linhaDestino, int colunaDestino, int linhaOrigem, int colunaOrigem) {
		if(matriz[linhaOrigem][colunaOrigem].equals("P")) {
			matriz[linhaOrigem][colunaOrigem] = " ";
			matriz[linhaDestino][colunaDestino] = "P";
		}else {
			matriz[linhaOrigem][colunaOrigem] = " ";
			matriz[linhaDestino][colunaDestino] = "p";
		}
	}
	public boolean isJogadaValida(int linhaDestino, int colunaDestino, int linhaOrigem, int colunaOrigem, boolean isPrimeiraJogada) {
		// Validação se a posição informada está dentro do tabuleiro
		if(linhaDestino < 0 || linhaDestino >= matriz.length || colunaDestino < 0 || colunaDestino >= matriz.length) {
			return false;
		}
		// Validação se a posição informada está na mesma linha ou coluna diferente
		else if(linhaDestino == linhaOrigem || colunaDestino != colunaOrigem) {
			return false;
		}
		// Validação se a posição está vazia
		else if(!matriz[linhaDestino][colunaDestino].equals(" ")) {
			return false;
		}
		else if(isPrimeiraJogada) {
			// Validação de mover duas casas caso seja primeira jogada.
			if(matriz[linhaOrigem][colunaOrigem].equals("p") && (linhaOrigem - 2) == linhaDestino || 
					matriz[linhaOrigem][colunaOrigem].equals("P") && (linhaOrigem + 2) == linhaDestino ) {
				return true;
			}
			// Validação moviemnto simples uma casa por vez.
			else if(matriz[linhaOrigem][colunaOrigem].equals("p")  && (linhaOrigem - 1) == linhaDestino ||
					matriz[linhaOrigem][colunaOrigem].equals("P")  && (linhaOrigem + 1) == linhaDestino) {
				return true;
			}
		}
		return false;
	}

}
