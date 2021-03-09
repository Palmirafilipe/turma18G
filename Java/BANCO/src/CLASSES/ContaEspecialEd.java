package CLASSES;

public class ContaEspecialEd extends ContaEd {
	
	//atributo
	private double limet;
	
	//construtor
	public ContaEspecialEd(int numero, double limet) {
		super(numero);
		this.limet = limet;
	}
	//construtor - sobregarga
	public ContaEspecialEd(int numero, String cpf, boolean ativa, double limet) {
		super(numero, cpf);
		this.limet = limet;
	}
	public double getLimet() {
		return limet;
	}
	public void setLimet(double limet) {
		this.limet = limet;
	}

	//ENCAPSULAMENTO
	
	
	
	

}
