package br.com.ftt.lpII.SimulacaoMundoReal;

public abstract class Pessoa {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public abstract String saudacao();
	
	public abstract String saudacao(Pessoa pessoa);

	public abstract String apresentacao();

	public abstract String apresentacao(Pessoa pessoa);
	
	public abstract String sentimento();
	
	public String cabecalhoDodialogo() {
		return String.format("%s diz: %n", 
				this.getNome());
	}
	
	
}
