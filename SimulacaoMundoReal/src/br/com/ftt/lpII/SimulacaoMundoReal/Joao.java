package br.com.ftt.lpII.SimulacaoMundoReal;

public class Joao extends Pessoa {

	public Joao(String nome, int idade) {
		super(nome, idade);	
	}

	@Override
	public String saudacao() {
		return super.cabecalhoDodialogo() + String.format("Olá, tudo bem?");
	}

	@Override
	public String saudacao(Pessoa pessoa) {
		return super.cabecalhoDodialogo() + String.format("Olá %s, como voce esta?", pessoa.getNome());
	}

	@Override
	public String apresentacao() {
		return super.cabecalhoDodialogo() + String.format("Me chamo %s e tenho %d",
				this.getNome(), this.getIdade());
	}

	@Override
	public String apresentacao(Pessoa pessoa) {
		return super.cabecalhoDodialogo() + String.format("Voce tem %d? nao parece %s",
				pessoa.getIdade(), pessoa.getNome());
	}

	@Override
	public String sentimento() {
		return super.cabecalhoDodialogo() + String.format("Eu nao me sinto muito bem hoje.");
	}

}
