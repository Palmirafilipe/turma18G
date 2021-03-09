package lista2;

import java.util.Scanner;

public class Exercici1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double M;
		double P;
		double E;
		System.out.print("Sistema de pesagem de São Paulo: ");
		System.out.print("\nVerifique o peso do seuproduto: ");
		System.out.print("\nInforme o kilo do produto: ");
		P = ler.nextDouble();
		
		E = P - 50;
		M = 4.0 * E;
		if (P > 50 )
		{
			System.out.printf("Você excedeu o peso de %f kilos: ", E);
			System.out.printf("\nvocê possui multa no valor de %f reaias: ", M);
		}
		else if (P <= 50)
		{
		E = 0;
		M = 0.00;
			System.out.printf("Você não possui kilo excedente");
			System.out.printf("\nVocê não possui multa a ser paga para o Estado");
			}
			
			ler.close();
		}
	}

	


	

