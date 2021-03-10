package lista001;

public class Cachorro extends Animal {

	// Construtor

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	// M�todos

	@Override
	public String emitirSom() {
		String som = "latido";
		return som;
	}

	@Override
	public String acao() {
		return "corre";
	}

}
