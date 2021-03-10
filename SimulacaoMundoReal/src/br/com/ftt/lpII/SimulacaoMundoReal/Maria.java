package br.com.ftt.lpII.SimulacaoMundoReal;

public class Maria extends Pessoa {

	public Maria(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String saudacao() {
		return super.cabecalhoDodialogo() + 
				String.format("Oii, como vai?");
	}

	@Override
	public String saudacao(Pessoa pessoa) {
		return super.cabecalhoDodialogo() + 
				String.format("Oii %s, como vai?", pessoa.getNome());
	}

	@Override
	public String apresentacao() {
		return super.cabecalhoDodialogo() + 
				String.format("Meu nome é %s e tenho %d", this.getNome(), this.getIdade());
	}

	@Override
	public String apresentacao(Pessoa pessoa) {
		return super.cabecalhoDodialogo() + String.format("Voce tem só %d? está muito acabado %s",
				pessoa.getIdade(), pessoa.getNome());
	}

	@Override
	public String sentimento() {
		return super.cabecalhoDodialogo() + 
				String.format("I usually go to the university, but today i'm don't want.");
	}

}
