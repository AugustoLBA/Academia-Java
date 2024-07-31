package atividade11;


import java.time.format.DateTimeFormatter;


public class ContaCorrente extends ContaBancaria{
	
	private double taxaDeOpercao;
	
	public ContaCorrente(String numeroConta, double saldo, Cliente cliente, double taxaDeOperacao) {
		super(numeroConta, saldo, cliente);
		this.taxaDeOpercao = taxaDeOperacao;
	}


	@Override
	public void sacar(double valorSaque) throws SaqueInvalidoException {
		double valorSaqueComTaxa = (this.taxaDeOpercao + valorSaque);
		
		if(valorSaqueComTaxa < this.getSaldo() || valorSaque > 0) {
			this.setSaldo((this.getSaldo() - valorSaqueComTaxa));
			return;
		}
		throw new SaqueInvalidoException("O saque não será possivel, verifique seu saldo.");
	}

	@Override
	public void transferir(double valorTransferencia, ContaBancaria conta) throws DepositoInvalidoException, SaqueInvalidoException, TransferenciaInvalidaException{
		double valorTransferenciaComTaxa = (valorTransferencia + this.taxaDeOpercao);
		
		if(valorTransferencia > 0 && this.getSaldo() >= valorTransferenciaComTaxa) {
			sacar(valorTransferencia);
			conta.depositar(valorTransferencia);
			return;
		}
		throw new TransferenciaInvalidaException("A transferencia não será possivel, verifique o valor informado e seu saldo.");
	}
	
	@Override
	public void exibirDetalhes() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = this.getDataCriacao().format(formatter);
        
		System.out.println("---Extrato----"
                + "\nNúmero da conta: " + this.getNumeroConta()
                + "\nCliente: " + this.getCliente().getNome() + " " + this.getCliente().getSobrenome()
                + "\nSaldo: R$" + this.getSaldo()
                + "\nTaxa de Operação: R$"+this.getTaxaDeOpercao()
                + "\nData de criação da conta: " + dataFormatada);
	}
	

	public double getTaxaDeOpercao() {
		return taxaDeOpercao;
	}

	public void setTaxaDeOpercao(double taxaDeOpercao) {
		this.taxaDeOpercao = taxaDeOpercao;
	}

	
	
	

}
