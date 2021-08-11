package br.com.banco;

public abstract class Conta {

	private int numeroConta;
	private int agenciaConta;
	private Cliente cliente;
	protected double saldo;

	public Conta(int numeroConta, int agenciaConta, Cliente cliente) {
		this.setNumeroConta(numeroConta);;
		this.setAgenciaConta(agenciaConta);;
		this.cliente = cliente;
		this.saldo = 0;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		if (numeroConta <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
        } else {
            this.numeroConta = numeroConta;
        };
	}

	public int getAgenciaConta() {
		return agenciaConta;
	}

	public void setAgenciaConta(int agenciaConta) {
		if (agenciaConta <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
        } else {
            this.agenciaConta = agenciaConta;
        };
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	protected abstract double sacar();

	protected void deposita(double quantidade) {
		this.saldo = quantidade;
	}
}
