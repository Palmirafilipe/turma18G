package lista004;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero, pares = 0, impares = 0;

		for (int contador = 1; contador <= 10; contador++) {
			System.out.printf("%d) Informe um valor: ", contador);
			numero = ler.nextInt();

			if (numero % 2 == 0) {
				pares++;
			}
			else {
				impares++;
			}
		}

		System.out.printf("\nVoc� digitou %d n�meros pares e %d n�meros �mpares.", pares, impares);

		ler.close();
	}

}
