package exemplos;

public class LacosRepeticao {

	public static void main(String[] args) {
		
		for(int contador = 1; contador <= 10; contador ++)
		{
			System.out.printf("%d Olá Mundo\n", contador);
		}
		System.out.println("");
		for(int contador = 10; contador >= 1; contador --)
		{
			System.out.printf("Olá Mundo %d\n" , contador);
		}
		System.out.println("");
		int contador1 = 1;
		while(contador1 <= 10)
		{

			System.out.println(contador1 + "\n");
			contador1 = contador1 + 1; // é a mesma coisa que contador ++
		}
		System.out.println("");
		int contador2 = 10;
		do
		{
			System.out.println(contador2 + "\n");
			contador2 = contador2 - 1;
		}
		while(contador2 >= 1);
		}
	}

