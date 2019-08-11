package main;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		Homem fellipe = new Homem("Fellipe", 24, new Date("22/05/1994"));
		Mulher larissa = new Mulher("Larissa", 25, new Date("28/04/1994"));
		
		System.out.println("Homem: Olá, meu nome é " + fellipe.getNome() + ", e você?");
		
		String emoMulher = larissa.getEmocao().toString().toLowerCase();
		String emoHomem = fellipe.getEmocao().toString().toLowerCase();
		
		int idadeHomem = fellipe.getIdade();
		int idadeMulher = larissa.getIdade();
		
		System.out.println("Mulher: Olá, meu nome é " + larissa.getNome() + ". Eu estou " + 
							emoMulher + ", e você?");
		System.out.println("Homem: Eu estou " + emoHomem + ". Quantos anos você tem? Eu tenho "
							+ idadeHomem + " anos.");
		if (idadeHomem == idadeMulher)
			System.out.println("Mulher: UAAAAU, eu tenho tambem tenho " + larissa.getIdade() + " anos.");
		else 
			System.out.println("Mulher: Eu tenho " + larissa.getIdade() + " anos.");	
	}

}
