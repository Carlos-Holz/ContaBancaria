package br.com.banco;

import java.util.Scanner;

public abstract class ContaPoupanca extends Conta {
	
	Scanner tec = new Scanner(System.in);
	Conta contaPoupanca;
	
	public void sacar(double valorSaque) {
		if(this.saldo < valorSaque) {
			System.out.println("Impossível sacar, sem limite na conta!!");
		}else {
		this.saldo = this.saldo - valorSaque - 0.10;
		return;
		}
	}
	
	public void deposita(double quantidade) {
		this.saldo = quantidade;
	}
	
	public String cliente() {
		cliente.nome = "Carlos";
		cliente.cpf = "083.415.069-00";
		return cliente();
	}
}