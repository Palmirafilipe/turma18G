package lista003;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero = 233;

		do 
		{
			System.out.printf("%d\n", numero);
			if ((numero >= 300) && (numero <= 400)) 
			{
				numero += 3;
			}
			else 
			{
				numero += 5;
			}

		} 
		while (numero <= 456);

		ler.close();

	}

}

