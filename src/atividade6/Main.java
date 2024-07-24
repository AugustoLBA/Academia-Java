package atividade6;

import javax.swing.JOptionPane;

public class Main {

	public static void realizarJogada(JogoDaVelhaJOptionPane jogoDavelha, String nomeJogador, String simbolo) {
	    int linha = 0;
	    int coluna = 0;
	    boolean aux;
	    JOptionPane.showMessageDialog(null, nomeJogador + " (" + simbolo + "), sua vez!");
	    do {
	        String linhaInput = JOptionPane.showInputDialog("Digite a linha (0-2):");
	        String colunaInput = JOptionPane.showInputDialog("Digite a coluna (0-2):");
	        
	        if (linhaInput == null || colunaInput == null) {
	           System.exit(0);
	        }
	        linha = Integer.parseInt(linhaInput);
	        coluna = Integer.parseInt(colunaInput);

	        aux = jogoDavelha.isValido(linha, coluna);
	        if (!aux) {
	            JOptionPane.showMessageDialog(null, "Posição inválida, tente novamente!");
	        }
	    } while (!aux);
	    jogoDavelha.jogada(linha, coluna, simbolo);
	}

	public static void main(String[] args) {
		JogoDaVelhaJOptionPane jogoDaVelha = new JogoDaVelhaJOptionPane();

		int quantiJogadas = 0;
		String resultado = null;

		while (resultado == null) {
			jogoDaVelha.printarTabuleiro();
			if (quantiJogadas % 2 == 0) {
				realizarJogada(jogoDaVelha, "Jogador1", "X");
				resultado = jogoDaVelha.isGanhou("Jogador1", ++quantiJogadas);
			} else {
				realizarJogada(jogoDaVelha, "Jogador2", "O");
				resultado = jogoDaVelha.isGanhou("Jogador2", ++quantiJogadas);
			}
		}

		jogoDaVelha.printarTabuleiro();
		JOptionPane.showMessageDialog(null, resultado);

	}
}
