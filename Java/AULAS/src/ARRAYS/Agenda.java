package ARRAYS;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		String agenda[][] = new String[31][24];
		int dia, hora, atividades=0;
		
		char opcao='1';
		 
		do {
			System.out.println("Informe o dia (1-31): ");
			dia = ler.nextInt();
			dia = dia - 1;
			System.out.println("Informe a hora (0-23): ");
			hora = ler.nextInt();
			System.out.println("Informe sua tarefa: ");
			agenda[dia][hora] = ler.next();
			System.out.println("Deseja continuar? Digite 1-sim / 0-não: ");
			opcao = ler.next().charAt(0);
		}
		while(opcao!='0');
		System.out.println("\nAgenda\n");
		for(int x=0; x<31;x++) {
			for(int y=0; y<24;y++) {
				if(agenda[x][y]!=null) {
					System.out.printf("Dia %d as %dh: %s\n", x+1, y, agenda[x][y]);
					atividades++;
					
				}
			}
		}
		System.out.printf("\nVocê tem %d atividades este mês", atividades);
	}

}
