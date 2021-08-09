package br.com.principal;

import java.util.Scanner;

//import br.com.banco.Conta;
import br.com.banco.ContaCorrente;
import br.com.banco.ContaPoupanca;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		// Conta conta;
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

		String resposta = tec.next();
		System.out.println("Voc� deseja operar na sua conta corrente ou poupan�a? ");
		tec.next();
		
		if (resposta.equalsIgnoreCase("Conta corrente")) {

			System.out.println("Qual valor deseja depositar na sua conta corrente?");
			contaCorrente.deposita(tec.nextDouble());
			System.out.println("Seu saldo ap�s o dep�sito � de: R$ " + contaCorrente.getSaldo());
			System.out.println("Qual valor deseja sacar da sua conta corrente?");
			contaCorrente.sacar(tec.nextDouble());
			System.out.println("Valor ap�s o saque\n" + contaCorrente.getSaldo());

		} else if (resposta.equalsIgnoreCase("Conta poupan�a")) {

			System.out.println("Qual valor deseja depositar na sua conta poupan�a?");
			contaPoupanca.deposita(tec.nextDouble());
			System.out.println("Seu saldo ap�s o dep�sito � de: R$ " + contaPoupanca.getSaldo());
			System.out.println("Qual valor deseja sacar da sua conta poupan�a?");
			contaPoupanca.sacar(tec.nextDouble());
			System.out.println("Valor ap�s o saque: R$ " + contaPoupanca.getSaldo());
		}

		tec.close();

	}
}
