package atividade10;

import atividade5.Cliente;
import atividade5.ContaCorrente;

public class Main {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Fulano", "Da Silva", "123456");
		ContaCorrente conta1 = new ContaCorrente(100f, cliente1);
		
		Cliente cliente2 = new Cliente("Fulana", "Da Silva", "654321");
		ContaCorrente conta2 = new ContaCorrente(100f, cliente2);

		try {
			conta1.depositar(-500);
			conta1.sacar(200f);
			conta1.transferir(1000f, conta2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			conta1.sacar(200f);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			conta1.transferir(1000f, conta2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
