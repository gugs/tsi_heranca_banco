package org.heranca.tsi.banco.app;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta c1 = new ContaPoupanca("123A");
		Conta c2 = new ContaPoupanca("321B");
		
		c1.realizarDeposito(100f);
		c1.realizarTransferencia(10f, c2);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
