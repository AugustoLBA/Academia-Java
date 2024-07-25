package atividade8;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		float lado1 = 0, lado2 = 0;
		String lado1Input, lado2Input;

		for(int i = 0; i < 6; i++) {
			lado1Input = JOptionPane.showInputDialog("Informe o lado1 do retangulo:");
			lado2Input = JOptionPane.showInputDialog("Informe o lado2 do retangulo:");

			if(lado1Input == null || lado2Input == null || lado1Input.trim().isEmpty() || lado2Input.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Informe lados validos !");
				i--;
			}else {
				lado1 = Float.parseFloat(lado1Input);
				lado2 = Float.parseFloat(lado2Input);

				if(lado1 < 0 || lado2 < 0) {
					JOptionPane.showMessageDialog(null, "Informe lados validos !");
					i--;
				}else {
					Retangulo retangulo1 = new Retangulo(lado1,lado2);
					retangulo1.calcularArea();
					retangulo1.calcularPerimetro();
				}
			}

		}

	}
}
