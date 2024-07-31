package atividade11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class ContaBancaria {
	
	private String numeroConta;
	
	private double saldo;
	
	private Cliente cliente;
	
	private LocalDateTime dataCriacao;
	
	public ContaBancaria(String numeroConta, double saldo, Cliente cliente) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cliente = cliente;
		this.dataCriacao = LocalDateTime.now();
	}
	
	
		
	public abstract void sacar(double valorSaque) throws SaqueInvalidoException;
	
	public abstract void transferir(double valorTransferencia, ContaBancaria conta) throws DepositoInvalidoException, SaqueInvalidoException, TransferenciaInvalidaException;
	
	public void depositar(double valorDeposito) throws DepositoInvalidoException {
		if(valorDeposito > 0) {
			this.setSaldo((this.getSaldo() + valorDeposito));
			return;
		}
		throw new DepositoInvalidoException("O deposito não será possivel, verifique o valor informado!");
	}
	
	public void exibirDetalhes() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = this.dataCriacao.format(formatter);
	     
		System.out.println("---Extrato----"
                + "\nNúmero da conta: " + this.getNumeroConta()
                + "\nCliente: " + this.getCliente().getNome() + " " + this.getCliente().getSobrenome()
                + "\nSaldo: R$" + this.getSaldo()
                + "\nData de criação da conta: " + dataFormatada);
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


}
