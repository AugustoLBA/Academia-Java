package atividade5;

public class Main {

	public static void main(String[] args) {


		Cliente cliente1 = new Cliente("Fulano", "da Silva", "123456");
		Cliente cliente2 = new Cliente("Fulana", "da Silva", "654321");

		ContaCorrente conta1 = new ContaCorrente(200f, cliente1);
		ContaCorrente conta2 = new ContaCorrente(100f, cliente2);

		System.out.println("Nome do titular da conta1: "+conta1.getCliente().getNome());
		System.out.println("Nome do titular da conta2: "+conta2.getCliente().getNome());
		System.out.println();

		System.out.println("Saldo inicial conta 1: " + conta1.getSaldo());
		conta1.depositar(30f);
		System.out.println("Saldo após depósito conta 1: " + conta1.getSaldo());

		conta1.sacar(15f);
		System.out.println("Saldo após saque conta 1: " + conta1.getSaldo());

		System.out.println("Saldo da conta2 antes da transferencia: R$"+conta2.getSaldo());

		boolean transferenciaRealizada = conta1.transferir(130f, conta2);
		if (!transferenciaRealizada) {
			System.out.println("Transferência cancelada: saldo insuficiente na conta 1.");
		} else {
			System.out.println("Saldo após transferência conta 1: " + conta1.getSaldo());
			System.out.println("Saldo após transferência conta 2: " + conta2.getSaldo());
		}
		System.out.println("Exibir extrato conta1");
		conta1.exibirExtrato();

		System.out.println();

		System.out.println("Exibir extrato conta2");
		conta2.exibirExtrato();

	}
}
