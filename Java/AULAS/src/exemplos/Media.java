package exemplos;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.print("Informe a segunta nota: ");
		nota2 = ler.nextDouble();
		System.out.print("Informe a terceira nota: ");
		nota3 = ler.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		System.out.println("A média das notas é: " + media);
		System.out.printf("A média das notas %.2f, %.2f e %.2f é: %.3f \n",
				nota1, nota2, nota3, media);
		
		if(media >= 5)
		{
			System.out.println("O aluno foi aprovado");
		}
		else
		{
			System.out.print("O aluno foi reprovado");
		}
		
		ler.close();
	}

}
