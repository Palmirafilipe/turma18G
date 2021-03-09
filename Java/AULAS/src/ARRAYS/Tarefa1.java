package ARRAYS;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		int valores[] = new int[5];
		int maiorPontuacao = 0;
		
		
		
		for (int y=0;y<valores.length; y++) {
			System.out.println("Digite o valor"+(y+1) +" : " );
			valores[y]= ler.nextInt();
		}
	
		for (int y=0;y<valores.length; y++) {
			System.out.println("O valor " +(y+1)+" é "+valores[y]);
			if (valores[y] > maiorPontuacao) {
				maiorPontuacao = valores[y];
			}
		}
		System.out.println("O maior valor é " + maiorPontuacao);
	}

}
