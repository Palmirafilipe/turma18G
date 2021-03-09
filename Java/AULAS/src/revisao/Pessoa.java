package revisao;

public class Pessoa {

	//classe: pessoa [terreno]
	//atributos - segurança [material de construção]
	//contrutores - como a classe abre - [pedreiro - Zé]
		//sobbrecarga de construtor [pedreiro - Malaqias - Zefa]
	//encapsulamento - getters and setters - segurança - [vigia]
	//metodos [vai faze talvez] [casa ou terreno com acabamento]
	
	
	private String nome;
	private int anoNascimento;
	private boolean vivo;
	private char generi;
	
	
	public Pessoa(String nome) {
		this.nome = nome;
	}


	public Pessoa(String nome, int anoNascimento, char generi) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.generi = generi;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}


	public boolean isVivo() {
		return vivo;
	}


	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}


	public char getGeneri() {
		return generi;
	}


	public void setGeneri(char generi) {
		this.generi = generi;
	}
	
	public int idade() {
		return (2021 - anoNascimento);
		
	}
	public int idade(int anoAtual) {
		
		return(anoAtual - anoNascimento);

	}
}