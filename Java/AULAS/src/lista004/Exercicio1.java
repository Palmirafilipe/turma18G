package lista004;


import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero = 1000;

		for (int contador = numero; contador <= 1999; contador++) {
			if (numero % 11 == 5) {
				System.out.printf("%d\n", numero);
			}
			numero++;
		}

		ler.close();
	}

}
