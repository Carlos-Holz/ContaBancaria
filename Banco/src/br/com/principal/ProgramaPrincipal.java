package br.com.principal;

import br.com.banco.Conta;
import br.com.banco.ContaCorrente;
import br.com.banco.ContaPoupanca;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Conta conta;
		ContaCorrente contaCorrente;
		ContaPoupanca contaPoupanca;
		
		contaCorrente = new ContaCorrente() {
			
			public double sacar() {
				return 0;
			}
		};
		
		contaPoupanca = new ContaPoupanca() {
			
			public double sacar() {
				return 0;
			}
		};
		
		contaPoupanca.deposita(0.10);
		System.out.println(contaPoupanca.getSaldo());
		contaPoupanca.sacar(0);
		System.out.println("Valor ap�s o saque\n" + contaPoupanca.getSaldo());
		
		contaCorrente.deposita(100);
		System.out.println(contaCorrente.getSaldo());
		contaCorrente.sacar(0);
		System.out.println("Valor ap�s o saque\n" + contaCorrente.getSaldo());
	}
}
