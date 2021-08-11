package br.com.banco;

public abstract class ContaPoupanca extends Conta {

	public ContaPoupanca(int numeroConta, int agenciaConta, Cliente cliente) {
		super(numeroConta, agenciaConta, cliente);
	}

	public void deposita(double quantidade) {
		this.saldo = quantidade;
	}
	
	public void sacar(double valorSaque) {
		if (this.saldo < valorSaque) {
			System.out.println("Impossível sacar, sem limite na conta!!");
		} else {
			this.saldo = this.saldo - valorSaque - 0.10;
			return;
		}
	}

}