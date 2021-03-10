package lista002;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero;
		System.out.print("Informe um número: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) {
			System.out.printf("O número %d é par e sua raíz quadrada é %.2f.", 
					numero, Math.sqrt(numero));
		}
		else {
			System.out.printf("O número %d é ímpar e sua potência ao quadrado é %d.", 
					numero, (int)Math.pow(numero, 2));
		}

		ler.close();
		
	}

}