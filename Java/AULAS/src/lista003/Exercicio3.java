package lista003;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double numero = 0, somatorio = 0, media = 0;
		int total = 0;

		while (numero >= 0) {
			System.out.print("Informe um número positivo: ");
			numero = ler.nextDouble();

			if (numero >= 0) {
				somatorio = somatorio + numero;
				total++;
			}
		}

		if (total != 0.0) {
			media = somatorio / total;
		}

		System.out.printf("\nTotal de números positivos: %d"
				+ "\nSomatório dos números positivos: %.2f"
				+ "\nMédia dos números positivos: %.2f", 
				total, somatorio, media);

		ler.close();

	}

}
