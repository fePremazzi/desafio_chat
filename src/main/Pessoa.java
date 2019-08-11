package main;

import java.util.Date;
import java.util.Random;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private Date dataNascimento;
	
	public EmocaoEnum getEmocao() {
		Random gerador = new Random();
		switch (gerador.nextInt(2)) {
			case 0:		
				return EmocaoEnum.BEM;
				
			case 1:
				return EmocaoEnum.MAL;			
				
			default:
				return EmocaoEnum.BEM;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
