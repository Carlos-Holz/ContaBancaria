package br.com.banco;

public class Cliente {

	String nome;
	String cpf;

	public Cliente() {

	}

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
}