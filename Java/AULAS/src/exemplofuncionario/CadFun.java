package exemplofuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadFun {

	private static Funcionario fun;

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Digite a quantidade de func na lista: ");
		int quantidade = ler.nextInt();
		
		for (int x=1; x<= quantidade; x++) {
			
			System.out.println("Funcionario "+x);
			System.out.println("1 - Funcionario ou 2 Terceiro :");
			char tipo = ler.next().charAt(0);
			
			
			System.out.println("Nome: ");
			String nome = ler.next();
			System.out.println("Matricula: ");
			int matricula = ler.nextInt();
			System.out.println("Horas trabalhadas :");
			int horaTrabalhadas = ler.nextInt();
			System.out.println("Valor por hora: ");
			double valorPorHora = ler.nextDouble();
			
			

			
			int horasTrabalhadas;
			if (tipo=='2') {
				System.out.println("Valor so adicinal R$: ");
				double adicional = ler.nextDouble();
			
				lista.add(new Terceiro(nome, matricula, horasTrabalhadas, valorPorHora, adicional));
			
			} 
			else 
			{
			
				lista.add(new Funcionario(nome, matricula, horasTrabalhadas, valorPorHora));
			}
			
		}
		
		System.out.println();
		System.out.println("Pagamento de salarios: ");
		for (Funcionario fun: lista) {
			System.out.println(fun.getNome()+ "seu salario é R$"+fun.salario());
			
			
		}
		System.out.println("Fim de programa, volte sempre!!!");
	}

}
