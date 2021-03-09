package br.com.ftt.lpII.SimulacaoMundoReal;

import java.util.Scanner;

public class SimulacaoMundoReal {

	public static void main(String[] args) {
		
		Pessoa bot = new Pessoa("Eva", 52, "192.168.0.10");		
		bot.saudacao();
		
		Scanner s = new Scanner(System.in);
		
		String nome = s.nextLine();
		
		Pessoa p = new Pessoa(nome);
		
		bot.idade(p);
		int idade = s.nextInt();
		p.setIdade(idade);
		
		bot.idade(idade);
		
	}

}
