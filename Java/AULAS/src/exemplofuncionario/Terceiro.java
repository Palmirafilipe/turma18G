package exemplofuncionario;

public class Terceiro extends Funcionario {

	
	private double adicional;

		//Construtor
	public Terceiro(String nome, int matricula, int horasTrabalhadas, double valorPorHora, double adicional) {
		super(nome, matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adicional;
	}
	
	//Ecnapsulamento
	public double getAdicional(double valorPorHora) {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	
	public  double salario() {
		
		
		return (horasTrabalhadas * valorPorHora) + adicional;
	}
	
	
}
