package ARRAYS;

import java.util.Random;
import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int soma =0;
		
		for(int x=0; x<3;x++) {
			for(int y=0;y<3; y++) {
				System.out.printf("Informe o número %d da linha %d: ", x+1, y+1);
				matriz[x][y]=ler.nextInt();
				
				
			}
		}

		for(int x=0; x<3;x++) {
			for(int y=0; y<3;y++) {
				System.out.printf("%d ", matriz[x][y]);
				
				if(x==y) {
				soma = soma + matriz[x][y];
				
				}
			}
			System.out.println();
		}
		System.out.printf("\n a soma dos números da diagonal é %d", soma);
	
	}
}
