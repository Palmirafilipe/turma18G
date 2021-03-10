package lista003;


import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero = 0;

		System.out.print("Informe um número: ");
		numero = ler.nextInt();

		System.out.printf("%d ", numero);
		while (numero <= 100) {
			numero = numero * 3;
			System.out.printf("%d ", numero);
		}

		ler.close();

	}

}