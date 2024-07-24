package atividade7;

import javax.swing.JOptionPane;

public class Main {

	public static void realizarJogada(JogoDeXadrezJOptionPane jogo) {
	    boolean isPrimeiraJogada = true;

	    while (true) {
	        jogo.imprimirTabuleiro();

	        String linhaOrigemInput = JOptionPane.showInputDialog("Digite a linha de origem (0-7):");
	        if (linhaOrigemInput == null) {
	            JOptionPane.showMessageDialog(null, "Saindo do jogo.");
	            break;
	        }
	        int linhaOrigem = Integer.parseInt(linhaOrigemInput);

	        String colunaOrigemInput = JOptionPane.showInputDialog("Digite a coluna de origem (0-7):");
	        if (colunaOrigemInput == null) {
	            JOptionPane.showMessageDialog(null, "Saindo do jogo.");
	            break;
	        }
	        int colunaOrigem = Integer.parseInt(colunaOrigemInput);

	        String linhaDestinoInput = JOptionPane.showInputDialog("Digite a linha de destino (0-7):");
	        if (linhaDestinoInput == null) {
	            JOptionPane.showMessageDialog(null, "Saindo do jogo.");
	            break;
	        }
	        int linhaDestino = Integer.parseInt(linhaDestinoInput);

	        String colunaDestinoInput = JOptionPane.showInputDialog("Digite a coluna de destino (0-7):");
	        if (colunaDestinoInput == null) {
	            JOptionPane.showMessageDialog(null, "Saindo do jogo.");
	            break;
	        }
	        int colunaDestino = Integer.parseInt(colunaDestinoInput);

	        if (linhaOrigem < 0 || linhaOrigem >= 8 || colunaOrigem < 0 || colunaOrigem >= 8 ||
	            linhaDestino < 0 || linhaDestino >= 8 || colunaDestino < 0 || colunaDestino >= 8) {
	            JOptionPane.showMessageDialog(null, "Posições inválidas!");
	        } else {
	            if (jogo.isPeao(linhaOrigem, colunaOrigem)) {
	                if (jogo.isJogadaValida(linhaDestino, colunaDestino, linhaOrigem, colunaOrigem, isPrimeiraJogada)) {
	                    jogo.jogada(linhaDestino, colunaDestino, linhaOrigem, colunaOrigem);
	                    isPrimeiraJogada = false;
	                } else {
	                    JOptionPane.showMessageDialog(null, "Movimento inválido. Tente novamente.");
	                }
	            } else {
	                JOptionPane.showMessageDialog(null, "A peça de origem não é um peão. Tente novamente.");
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		JogoDeXadrezJOptionPane xadrez = new JogoDeXadrezJOptionPane();
		Main.realizarJogada(xadrez);

	}
}
