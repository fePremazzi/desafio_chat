package main;

import java.util.Date;

public class Homem extends Pessoa {
	
	public Homem(String nome, int idade, Date data) {
		this.setIdade(idade);
		this.setDataNascimento(data);
		this.setNome(nome);
	}

	public Homem () {}

}
