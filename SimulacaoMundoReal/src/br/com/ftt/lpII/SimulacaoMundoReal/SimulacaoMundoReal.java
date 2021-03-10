package br.com.ftt.lpII.SimulacaoMundoReal;


public class SimulacaoMundoReal {

	public static void main(String[] args) {
		
		Pessoa j = new Joao("Joao", 35);
		Pessoa m =  new Maria("Maria", 28);

		System.out.println(j.saudacao());
		System.out.println(j.apresentacao());
		
		System.out.println(m.saudacao(j));
		System.out.println(m.apresentacao(j));
		
		System.out.println(j.sentimento());
		
		
	}

}
