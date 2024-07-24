package atividade5;

public class Cliente {
	
	private String nome;
	
	private String sobrenome;
	
	private String CPF;

	public Cliente(String nome, String sobrenome, String cPF) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		CPF = cPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	
	
	
	

}
