package atividade9;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		float raio = 0;
		String raioInput;
		
		for(int i = 0; i < 6; i++) {
			raioInput = JOptionPane.showInputDialog("Informe o raio do circulo: ");
			
			if(raioInput == null || raioInput.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Informe um raio valido !");
				i--;
			}else {
				raio = Float.parseFloat(raioInput);
				if(raio < 0) {
					JOptionPane.showMessageDialog(null, "Informe um raio valido !");
					i--;
				}else {
					Circulo circulo = new Circulo(raio);
					circulo.calcularArea();
					circulo.calcularPerimetro();
				}
			}
		}

	}

}
