package atividade9;

import javax.swing.JOptionPane;

public class Circulo {
	
	private float raio;
	
	private float area;

	private float perimetro;
	
	public Circulo() {}
	
	public Circulo(Float raio) {
		this.raio = raio;
	}
	
	public void calcularArea() {
		this.area = ((raio*raio) * 3.14f);
		JOptionPane.showMessageDialog(null, "A área do circulo é: "+this.area);
	}
	
	public void calcularPerimetro() {
		this.perimetro = ((2 * 3.14f) * this.raio);
		JOptionPane.showMessageDialog(null, "O perimetro do circulo é: "+this.perimetro);
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}

}
