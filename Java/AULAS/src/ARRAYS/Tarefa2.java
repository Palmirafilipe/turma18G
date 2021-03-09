package ARRAYS;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int lancamentos[]= new int[10];
		int somaValores =0;
		int maiorPontuacao =0;
		int contadorMaiorPontuacao =0;
		double mediaAritmetica =0;
		
		
		for(int x=0; x<lancamentos.length; x++) {
			System.out.printf("Digite o resultado do lançamento %d :",(x+1));
			lancamentos[x]=leia.nextInt();
		}
		for(int x=0; x<lancamentos.length; x++) {
			System.out.printf("O valor do lancamento %d é %d\n", (x+1), lancamentos[x]);
			somaValores = somaValores+lancamentos[x];
			
			if (lancamentos[x] >= maiorPontuacao) {
				
				if (lancamentos[x] > maiorPontuacao) {
					contadorMaiorPontuacao = 0;
				}
				maiorPontuacao = lancamentos[x];
				contadorMaiorPontuacao++;
			}
			
		}
		mediaAritmetica = somaValores / (double) lancamentos.length;
		
		System.out.printf("Total dos lancamentos digitados: %d \n", somaValores);
		System.out.printf("A média é %.2f \n", mediaAritmetica);
		System.out.printf("O maior valor é %d\n", maiorPontuacao);
		System.out.printf("O maior valor aparece %d vezes\n", contadorMaiorPontuacao);
	}
}
