package atividade11;

import java.util.IdentityHashMap;

import java.util.Map;


public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Fulano", "Da Silva", "12345678900");
		Cliente cliente2 = new Cliente("Fulana", "Da Silva", "00987654321");
		
		ContaCorrente contaCorrente1 = new ContaCorrente("137", 100,cliente1, 15);
		ContaCorrente contaCorrente2 = new ContaCorrente("731", 150,cliente2, 10);
		
		try {
			
			System.out.println("Depositando R$ 20.00 na conta corrente:");
			System.out.println("Mostrando saldo antes deposito: saldo: R$ "+contaCorrente1.getSaldo());
			contaCorrente1.depositar(20);
			System.out.println("Mostrando saldo após deposito: saldo: R$ "+contaCorrente1.getSaldo());
			
			System.out.println("\nSacando R$ 20.00 na conta corrente:");
			contaCorrente1.sacar(20);
			System.out.println("Mostrando saldo após o saque: saldo: R$ "+contaCorrente1.getSaldo());
			
			System.out.println("\nTransferindo R$ 20.00 na contaCorrente1 para contaCorrente2:");
			
			System.out.println("Mostrando saldo antes da transferncia --> saldo contaCorrente1: R$ "+contaCorrente1.getSaldo());
			System.out.println("Mostrando saldo antes da transferncia --> saldo contaCorrente2: R$ "+contaCorrente2.getSaldo());
			contaCorrente1.transferir(20, contaCorrente2);
			
			System.out.println("\nMostrando saldo após a transferncia saldo contaCorrente1: R$ "+contaCorrente1.getSaldo());
			System.out.println("Mostrando saldo após a transferncia saldo contaCorrente2: R$ "+contaCorrente2.getSaldo());
			
			System.out.println("\n Detalhes contaCorrente1");
			
			contaCorrente1.exibirDetalhes();
			
			System.out.println("\n Detalhes contaCorrente2");
			contaCorrente2.exibirDetalhes();
			
			
		} catch (DepositoInvalidoException | SaqueInvalidoException | TransferenciaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		Cliente cliente3 = new Cliente("Sicrano", "Da Silva", "12345678900");
		Cliente cliente4 = new Cliente("Sicrana", "Da Silva", "00987654321");
		
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("876", 100, cliente3, 5);
		ContaPoupanca contaPoupanca2 = new ContaPoupanca("876", 150, cliente4, 5);
		
		try {
			System.out.println("\nDepositando R$ 20.00 na contaPoupança1:");
			System.out.println("Mostrando saldo antes deposito: saldo: R$ "+contaPoupanca1.getSaldo());
			contaPoupanca1.depositar(20);
			System.out.println("Mostrando saldo após deposito: saldo: R$ "+contaPoupanca1.getSaldo());
			
			System.out.println("\nSacando R$ 20.00 na contaPoupança1:");
			contaPoupanca1.sacar(20);
			System.out.println("Mostrando saldo após o saque: saldo: R$ "+contaPoupanca1.getSaldo());
			
			System.out.println("Mostrando saldo antes de aplicar juros na contaPoupança1: saldo: R$ "+contaPoupanca1.getSaldo());
			contaPoupanca1.aplicarJuros();
			System.out.println("Mostrando saldo após aplicar juros na contaPoupança1: saldo: R$ "+contaPoupanca1.getSaldo());
			
			System.out.println("\nTransferindo R$ 20.00 na contaPoupança1 para contaPoupança2:");
			System.out.println("\nMostrando saldo antes da transferncia --> saldo contaPoupança1: R$ "+contaPoupanca1.getSaldo());
			System.out.println("Mostrando saldo antes da transferncia --> saldo contaPoupança2: R$ "+contaPoupanca2.getSaldo());
			contaPoupanca1.transferir(20, contaPoupanca2);
			
			System.out.println("\nMostrando saldo após a transferncia saldo contaPoupança1: R$ "+contaPoupanca1.getSaldo());
			System.out.println("Mostrando saldo após a transferncia saldo contaPoupança2: R$ "+contaPoupanca2.getSaldo());
			
			System.out.println("\n Detalhes contaPoupança1");
			
			contaPoupanca1.exibirDetalhes();
			
			System.out.println("\n Detalhes contaPoupança2");
			contaPoupanca2.exibirDetalhes();
			
			
		} catch (DepositoInvalidoException | SaqueInvalidoException | TransferenciaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("\n----Tranferindo 20 da contaCorrnte1 para contaPoupança1----");
			System.out.println("Saldo contaCorrente1 antes da transferencia: R$ "+contaCorrente1.getSaldo());
			System.out.println("Saldo contaPoupança1 antes da transferencia: R$ "+contaPoupanca1.getSaldo());
			contaCorrente1.transferir(20, contaPoupanca1);
			
			System.out.println("\nSaldo contaCorrente1 apos da transferencia: R$ "+contaCorrente1.getSaldo());
			System.out.println("Saldo contaPoupança1 apos da transferencia: R$ "+contaPoupanca1.getSaldo());
		} catch (DepositoInvalidoException | SaqueInvalidoException | TransferenciaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
  