package lista003;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int soma = 0;

		for (int numero = 1; numero <= 500; numero++) 
		{

			if ((numero % 2 != 0) && (numero % 3 == 0)) 
			{
			
				soma += numero;
			}
		}

		System.out.printf("A soma dos n�meros de 1 a 500 que s�o m�ltiplos de 3 � %d", soma);

		ler.close();

	}

}

