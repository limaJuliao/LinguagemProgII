package br.com.ftt.lpII.SimulacaoMundoReal;

public class Pessoa {
	private String nome;
	private int idade;
	private Endereco endereco;
	
	public Pessoa(String nome, int idade, String endereco){
		this.nome = nome;
		this.idade = idade;
		this.endereco.getBairro();
	}
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void saudacao() {
		System.out.format("Olá, meu nome é %s, qual o seu nome?", this.nome);
		System.out.println();
	}
	
	public void idade(Pessoa pessoa) {
		System.out.format("Bonito nome %s, e qual a sua idade?", pessoa.getNome());
	}
	
	public void idade(int idade) {
		if (idade < 30) {
			System.out.format("Uau como voce é novo eu tenho %d. Qual o seu endereço?", this.idade);
		}
	}

	
}
