package lista001;

public class Preguica extends Animal {

	// Construtor

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	// M�todos

	@Override
	public String emitirSom() {
		String som = "som da pregui�a";
		return som;
	}

	@Override
	public String acao() {
		return "sobe em �rvore";
	}

}
