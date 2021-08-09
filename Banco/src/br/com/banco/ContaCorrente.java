package br.com.banco;

public abstract class ContaCorrente extends Conta {

	Conta contaCorrente;
	
	public void sacar(double valorSaque) {
		valorSaque = 0.10;
		if(this.saldo < valorSaque) {
			System.out.println("Impossível sacar, sem limite na conta!!");
		}else {
		this.saldo = this.saldo - valorSaque;
		return;
		}
	}
	
	public void deposita(double quantidade) {
		this.saldo = quantidade;
	}
}