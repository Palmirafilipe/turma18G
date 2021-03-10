package lista001;

public class Cavalo extends Animal {

	// Construtor

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	// Métodos

	@Override
	public String emitirSom() {
		String som = "relincho";
		return som;
	}

	@Override
	public String acao() {
		return "corre";
	}

}
