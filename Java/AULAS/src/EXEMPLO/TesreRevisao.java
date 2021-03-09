package EXEMPLO;

import java.util.Scanner;


import REVISAO Aluno;
import REVISAO.Cahorro;
import REVISAO.Pessoa;


public class TesreRevisao {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		String nome;
		int anoNascimento;
		char genero;
		
		
		System.out.println("Digite o nome do amigo/a: ");
		nome = ler.next();
		Pessoa amigo = new Pessoa(nome);
		Aluno aluno1 = new Aluno("Miira", 1);
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = ler.nextInt();
		
		System.out.println("Digite M-masculino, F-femenino ou O-outros: ");
		genero = ler .next().toUpperCase().charAt(0);
		
		
		Pessoa cliente = new Pessoa(nome, anoNascimento, genero);
		
		System.out.println("O nome da amizade é "+amigo.getNome();
		System.out.println("O nome do client é "+cliente.getNome()+" e seuano de nascimento é: ");
		
		if (cliente.idade(2050) >=18) {
		}
		
		System.out.println("Cliente é adulto");
		System.out.println("E a idade é "+cliente.idade(2050));
	}
	else {
		
		System.out.println("Cliente é adulto");
		Object cliente;
		System.out.println("E a idade é "+cliente.idade(2050));
		
	}
}
