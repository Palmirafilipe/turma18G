package lista002;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero;
		System.out.print("Informe um n�mero: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) {
			System.out.printf("O n�mero %d � par e sua ra�z quadrada � %.2f.", 
					numero, Math.sqrt(numero));
		}
		else {
			System.out.printf("O n�mero %d � �mpar e sua pot�ncia ao quadrado � %d.", 
					numero, (int)Math.pow(numero, 2));
		}

		ler.close();
		
	}

}