package main;

import java.util.Date;

public class Mulher extends Pessoa{
	
	public Mulher(String nome, int idade, Date data) {
		this.setIdade(idade);
		this.setDataNascimento(data);
		this.setNome(nome);
	}

	public Mulher () {}

}
