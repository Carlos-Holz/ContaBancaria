package br.com.banco;

import java.util.Scanner;

public abstract class ContaPoupanca extends Conta {
	
	Scanner tec = new Scanner(System.in);
	Conta contaPoupanca;
	
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

	public void getCliente(String string) {
		System.out.println("Informe o nome do cliente: ");
		cliente.getNome();
		System.out.println("Informe o cpf do cliente: ");
		cliente.getCpf();
	}
}