package atividade8;

import javax.swing.JOptionPane;

public class Retangulo {

	private float lado1;

	private float lado2;

	private float area;

	private float perimetro;


	public Retangulo() {}

	public Retangulo(float lado1, float lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public void calcularArea() {
		this.area = (this.lado1 * this.lado2);
		JOptionPane.showMessageDialog(null, "A área do retangulo é: "+this.area);
	}
	public void calcularPerimetro() {
		this.perimetro = (this.lado1*2) + (this.lado2*2);
		JOptionPane.showMessageDialog(null, "O perimetro do retangulo é: "+this.perimetro);
	}

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
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
