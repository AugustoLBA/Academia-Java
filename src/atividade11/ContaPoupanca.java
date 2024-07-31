package atividade11;

import java.time.format.DateTimeFormatter;

public class ContaPoupanca extends ContaBancaria{
	
	private double taxaDeJuros;

	public ContaPoupanca(String numeroConta, double saldo,Cliente clinete, double taxaDeJuros) {
		super(numeroConta, saldo, clinete);
		this.taxaDeJuros = taxaDeJuros;
	}


	@Override
	public void sacar(double valorSaque) throws SaqueInvalidoException {
		if(valorSaque > 0 && this.getSaldo() >= valorSaque) {
			this.setSaldo((this.getSaldo() - valorSaque));
			return;
		}
		throw new SaqueInvalidoException("O saque não será possivel, verifique seu saldo.");
		
	}

	@Override
	public void transferir(double valorTransferencia, ContaBancaria conta) throws DepositoInvalidoException, SaqueInvalidoException, TransferenciaInvalidaException {
		if(valorTransferencia <= this.getSaldo() && valorTransferencia > 0) {
			depositar(valorTransferencia);
			conta.depositar(valorTransferencia);
			return;
		}
		throw new TransferenciaInvalidaException("A transferencia não será possivel,verifique o valor informado e seu saldo!");
	}
	@Override
	public void exibirDetalhes() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = this.getDataCriacao().format(formatter);
	     
		System.out.println("---Extrato----"
                + "\nNúmero da conta: " + this.getNumeroConta()
                + "\nCliente: " + this.getCliente().getNome() + " " + this.getCliente().getSobrenome()
                + "\nSaldo: R$" + this.getSaldo()
                + "\nTaxa de Juros: R$"+this.getTaxaDeJuros()
                + "\nData de criação da conta: " + dataFormatada);
	}

	public void aplicarJuros() {
		this.setSaldo((this.getSaldo() + this.taxaDeJuros));
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	
}
