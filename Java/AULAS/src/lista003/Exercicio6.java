package lista003;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero, soma = 0, contador = 1;

		System.out.print("Informe um n�mero: ");
		numero = ler.nextInt();

		do 
		{
			
			soma = soma + contador;
			contador++;
		}
		while (contador <= numero);

		System.out.printf("A soma dos n�meros de 1 a %d � %d", numero, soma);

		ler.close();

	}

}
