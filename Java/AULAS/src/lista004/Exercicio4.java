package lista004;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		final int TOTALPESSOAS = 6; // mudar para 150
		int idade, contador = 1,
		qtdTotalCalmas = 0, qtdFemininaNervosas = 0, qtdMasculinoAgressivos = 0, 
		qtdOutrasCalmas = 0, qtdNervosasMais40 = 0, qtdCalmasMenos18 = 0;
		char genero, caracteristica;

		while (contador <= TOTALPESSOAS) {

			System.out.printf("1) Informe a idade da pessoa %d: ", contador);
			idade = ler.nextInt();

			System.out.printf("\nOpções:"
					+ "\n- 1 para feminino"
					+ "\n- 2 para masculino"
					+ "\n- 3 para outros"
					+ "\n\n2) Informe o gênero da pessoa %d: ", contador);
			genero = ler.next().charAt(0);

			System.out.printf("\nOpções:"
					+ "\n- 1 para calma"
					+ "\n- 2 para nervosa"
					+ "\n- 3 para agressiva"
					+ "\n\n3) Informe a característica da pessoa %d: ", contador);
			caracteristica = ler.next().charAt(0);

			System.out.println("\n--------------------\n");

			if (caracteristica == '1') {
				qtdTotalCalmas++;
			}
			if ((genero == '1') && (caracteristica == '2')) {
				qtdFemininaNervosas++;
			}
			if ((genero == '2') && (caracteristica == '3')) {
				qtdMasculinoAgressivos++;
			}
			if ((genero == '3') && (caracteristica == '1')) {
				qtdOutrasCalmas++;
			}
			if ((caracteristica == '2') && (idade > 40)) {
				qtdNervosasMais40++;
			}
			if ((caracteristica == '1') && (idade < 18)) {
				qtdCalmasMenos18++;
			}

			contador++;

		}

		System.out.printf("Total de pessoas calmas: %d\n"
				+ "Total de mulheres nervosas: %d\n"
				+ "Total de homens agressivos: %d\n"
				+ "Total de outros calmos: %d\n"
				+ "Total de pessoas nervosas com mais de 40 anos: %d\n"
				+ "Total de pessoas calmas com menos de 18 anos: %d\n",
				qtdTotalCalmas, qtdFemininaNervosas, qtdMasculinoAgressivos,
				qtdOutrasCalmas, qtdNervosasMais40, qtdCalmasMenos18);

		ler.close();
	}

}