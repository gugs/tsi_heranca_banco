package org.heranca.tsi.banco.app;

public class ContaPoupanca extends Conta{

	final float TAXA_TRANSFERENCIA_CONTA_POUPANCA = 0.05f;
	
	public ContaPoupanca(String numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizarTransferencia(float quantia, Conta destino) {
		if(destino instanceof ContaPoupanca) 
		{
			if (this.status && destino.status && quantia <= saldo & quantia > 0) {
				this.saldo -= quantia;
				destino.saldo += quantia;
			}
		}
		else
		{	
			if (this.status && destino.status
					&& (quantia + (quantia * TAXA_TRANSFERENCIA_CONTA_POUPANCA)) <= saldo & quantia > 0) {
				this.saldo -= (quantia + (quantia * TAXA_TRANSFERENCIA_CONTA_POUPANCA));
				destino.saldo += quantia;
			}
		}
	}
}
