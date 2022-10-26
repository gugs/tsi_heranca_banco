package org.heranca.tsi.banco.app;

import java.util.Date;

public class Conta {

	String numero;
	float saldo;
	Date dataAbertura;
	boolean status;

	final float TAXA_TRANSFERENCIA_CONTA = 0.05f;

	public Conta(String numero) {
		this.numero = numero;
		this.saldo = 0f;
		this.dataAbertura = new Date();
		this.status = true;
	}

	public void realizarTransferencia(float quantia, Conta destino) {
		
	}

	public void realizarDeposito(float quantia) {
		this.saldo += quantia;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + ", status=" + status
				+ "]";
	}

}
