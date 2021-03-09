package APLICACAO;

import java.util.Scanner;
import CLASSES.Conta;
import CLASSES.ContaPoupanca;
import CLASSES.ContaCorrente;
import CLASSES.ContaEspecial;
import CLASSES.ContaEmpresa;
import CLASSES.ContaEstudantil;

public class Main {
	public static void main(String[] args) {
		Conta conta = new CLASSES.Conta();
		int opcao = 0;
		int acao = 0;
		double valor;
		int mov = 0;
		String variedade = "";

		Scanner s = new Scanner(System.in);

		do {
			System.out.println("Banco Edbank");
			System.out.println("*Voc� Ed mais*");
			System.out.println();
			System.out.println("1 - CONTA POUPAN�A");
			System.out.println("2 - CONTA CORRENTE");
			System.out.println("3 - CONTA ESPECIAL");
			System.out.println("4 - CONTA EMPRESA");
			System.out.println("5 - CONTA ESTUDANTIL");
			System.out.println("6 - SAIR");
			System.out.println();
			System.out.print("DIGITE O C�DIGO DA OP��O SELECIONADA: ");
			opcao = s.nextInt();
			if (opcao == 1)////////////////////////////////////// CONTA/POUPAN�A///////////////////////////////////////////
			{
				conta = new CLASSES.ContaPoupanca();
				variedade = "POUPAN�A";
			} else if (opcao == 2)////////////////////////////////////// CONTA/CORRENTE///////////////////////////////////////////
			{
				conta = new CLASSES.ContaCorrente();
				variedade = "CORRENTE";
			} else if (opcao == 3)////////////////////////////////////// CONTA/ESPECIAL///////////////////////////////////////////
			{
				conta = new CLASSES.ContaEspecial();
				variedade = "ESPECIAL";
			} else if (opcao == 4)////////////////////////////////////// CONTA/EMPRESA////////////////////////////////////////////
			{
				conta = new CLASSES.ContaEmpresa();
				variedade = "EMPRESA";
			} else if (opcao == 5)////////////////////////////////////// CONTA/ESTUDANTIL/////////////////////////////////////////
			{
				conta = new CLASSES.ContaEstudantil();
				variedade = "ESTUDANTIL";
			} else {
				conta = new CLASSES.Conta();
			}
			do {
				mov = mov + 1;
				System.out.println("Banco Edbank");
				System.out.println("*Voc� Ed mais*");
				System.out.println();
				System.out.println("CONTA " + variedade);
				System.out.println("Saldo Atual: " + conta.getSaldo());
				System.out.print("MOVIMENTO : 1-Debito ou 2-Credito: ");
				acao = s.nextInt();
				if (acao == 1 || acao == 2) {
					System.out.print("Valor do movimento: R$");
					valor = s.nextInt();
					if (acao == 1) {
						conta.Debito(valor);
					} else if (acao == 2) {
						conta.Credito(valor);
					}
				} else {
					System.out.println("Erro, entrada inv�lida.");
					mov = mov - 1;
				}
				System.out.print("Continuar S/N:");
				var mais = s.next().toUpperCase().charAt(0);
				if (mais == 'N') {
					mov = 10;
				}
			} while (mov < 10);
			if (opcao == 2) {
				((CLASSES.ContaCorrente) conta).pedirTalao();
			}
		} while (opcao != 6);
	}
}