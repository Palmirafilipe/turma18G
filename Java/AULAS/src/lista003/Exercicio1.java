package lista003;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numFilhos = 0;
		double numSalario = 0, maiorSalario = 0, percentualAteCem = 0,
				somatorioSalario = 0, somatorioFilhos = 0,
				mediaSalario = 0, mediaFilhos = 0;
		final int HABITANTES = 3; 
		for (int contador = 1; contador <= HABITANTES; contador++) {

			System.out.printf("Informe o sal�rio do habitante %d: ", contador);
			numSalario = ler.nextDouble();
			System.out.printf("Informe o n�mero de filhos: ");
			numFilhos = ler.nextInt();

			somatorioSalario = somatorioSalario + numSalario;
			somatorioFilhos = somatorioFilhos + numFilhos;

			if (numSalario > maiorSalario) {
				maiorSalario = numSalario;
			}

			if (numSalario <= 100) {
				percentualAteCem++;
			}

		}

		mediaSalario = somatorioSalario / HABITANTES;
		mediaFilhos = somatorioFilhos / HABITANTES;
		percentualAteCem = (percentualAteCem / HABITANTES) * 100;

		System.out.printf("\nA m�dia do sal�rio dos habitantes � de R$ %.2f"
				+ "\nA m�dia de filhos dos habitantes � de %.2f"
				+ "\nO maior sal�rio entre os habitantes � de R$ %.2f"
				+ "\nO percentual de habitantes com sal�rio de at� R$ 100 � de %.2f%%", 
		mediaSalario, mediaFilhos, maiorSalario, percentualAteCem);

		ler.close();

	}

}
