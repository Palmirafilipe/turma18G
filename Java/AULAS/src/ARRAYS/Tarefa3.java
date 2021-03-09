package ARRAYS;

import java.util.Random;

public class Tarefa3 {
public static void main(String[] args) {
	
		Random dados = new Random();
	int n1[][] = new int[4][6];
	int n2[][] = new int[4][6];
	int m1[][] = new int[4][6];
	int m2[][] = new int[4][6];
	
	for(int x=0; x<4;x++) {
		for(int y=0;y<6; y++) {
			n1[x][y]= dados.nextInt(10)+1;
			n2[x][y]= dados.nextInt(10)+1;
		}
	}
	
	for(int x=0; x<4;x++) {
		for(int y=0; y<6;y++) {
			m1[x][y]=n1[x][y]+n2[x][y];
			m2[x][y]=n1[x][y]-n2[x][y];
		}
	}
		System.out.println("Matriz N1");
		for(int x=0; x<4;x++) {
			for(int y=0; y<6;y++) {
			System.out.print(n1[x][y]);
		System.out.print(" ");
		
		}
		System.out.println();
		}
		System.out.println();
		System.out.println("Matriz n2");
		for(int x=0; x<4;x++) {
			for(int y=0; y<6;y++) {
				System.out.print(n2[x][y]);
			System.out.print(" ");
			
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("Matriz M1");
		 for (int x=0; x<4; x++) {
			for(int y=0; y<6;y++) {
				System.out.print(m1[x][y]);
			System.out.print(" ");
			
			}
			System.out.println();
			
			}
		System.out.println();
		System.out.println("Matriz M2");
		
		for(int x=0; x<4;x++) {
			for(int y=0; y<6;y++) {
				System.out.print(m2[x][y]);
		System.out.print(" ");
		
			}
			System.out.println();
	
			}
			System.out.println();
		}
	}
