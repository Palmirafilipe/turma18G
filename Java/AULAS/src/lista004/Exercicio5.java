package lista004;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double numero, somatorio = 0;

		do {		
			System.out.print("Informe um n�mero: ");
			numero = ler.nextDouble();
			somatorio += numero;	
		} 
		while (numero != 0);

		System.out.printf("O somat�rio dos n�meros digitados �: %.2f", somatorio);

		ler.close();
	}

}