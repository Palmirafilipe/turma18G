programa
{
	
	funcao inicio()
	{

	inteiro notas[3][3]

	cadeia alunos[3]


	para(inteiro contadorAluno = 0; contadorAluno < 3; contadorAluno ++)
	{
		escreva("Informe o nome do aluno: ")
		leia(alunos[contadorAluno])
		para(inteiro contadorNota = 0; contadorNota < 3; contadorNota ++)
		{
			escreva("Informe a nota ", contadorNota + 1, ": ")
			leia(notas[contadorAluno][contadorNota])
		}
		escreva("\n")
	}

	para(inteiro contadorAluno = 0; contadorAluno < 3; contadorAluno ++)
	{
		escreva("Nome do aluno: ", alunos[contadorAluno], "\n")	
		para(inteiro contadorNota = 0; contadorNota < 3; contadorNota ++)
		{
			escreva("Nota ",contadorNota + 1,": ", notas[contadorAluno][contadorNota], "\n")
		}
		escreva("\n")
	}
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 542; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */