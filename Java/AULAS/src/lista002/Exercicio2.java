package lista002;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num1, num2, num3;
		
		System.out.println("Informe três números (separados pela tecla enter): ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
				
		if ((num1 <= num2) && (num2 <= num3)) {
			System.out.printf("%d %d %d", num1, num2, num3);
		} 
		else if ((num1 <= num3) && (num3 <= num2)) {
			System.out.printf("%d %d %d", num1, num3, num2);
		}
		else if ((num2 <= num1) && (num1 <= num3)) {
			System.out.printf("%d %d %d", num2, num1, num3);
		}
		else if ((num2 <= num3) && (num3 <= num1)) {
			System.out.printf("%d %d %d", num2, num3, num1);
		}
		else if ((num3 <= num1) && (num1 <= num2)) {
			System.out.printf("%d %d %d", num3, num1, num2);
		}
		else if ((num3 <= num2) && (num2 <= num1)) {
			System.out.printf("%d %d %d", num3, num2, num1);
		}
		
		
		ler.close();
		
	}

}