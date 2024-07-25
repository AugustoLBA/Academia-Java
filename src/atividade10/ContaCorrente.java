package atividade10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class ContaCorrente {

private int numero;
	
	private Date dataCriacao;
	
	private float saldo;
	
	private Cliente cliente;

	public ContaCorrente(float saldo, Cliente cliente) {
		Random random = new Random();
		this.numero = random.nextInt(100);
		this.dataCriacao = new Date();
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public boolean depositar(float valorDeposito) throws DepositoInvalidoException {
		if(valorDeposito > 0) {
			this.saldo += valorDeposito;
		}
		throw new DepositoInvalidoException("O valor do deposito não pode ser menor ou igual a zero !");
	}
	
	public boolean sacar(float valorDoSaque) throws EstouroSaqueException {
		if(valorDoSaque > 0 && valorDoSaque <= this.getSaldo()) {
			this.saldo -= valorDoSaque;
			return true;
		}
		throw new EstouroSaqueException("O valor do saque é maior que o valor do saldo!");
	}
	
	public boolean transferir(float valorTransferencia, ContaCorrente conta) throws DepositoInvalidoException, EstouroSaqueException{
		if(valorTransferencia > 0 && valorTransferencia <= this.getSaldo()) {
			this.saldo -= valorTransferencia;
			conta.depositar(valorTransferencia);
			return true;
		}
		throw new EstouroSaqueException("O valor do saque da transferencia é maior que o valor do saldo!");
	}
	
	public void exibirExtrato() {
		
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	     String dataFormatada = sdf.format(this.getDataCriacao());
	     
		System.out.println("---Extrato----"
                + "\nNúmero da conta: " + this.getNumero()
                + "\nCliente: " + this.getCliente().getNome() + " " + this.getCliente().getSobrenome()
                + "\nSaldo: R$" + this.getSaldo()
                + "\nData de criação da conta: " + dataFormatada);
		
	}
}
