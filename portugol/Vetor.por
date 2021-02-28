programa
{
	
	funcao inicio()
	{

	inteiro notas[3]

//	notas[0] = 7
//	notas[1] = 5
//	notas[2] = 8

	para(inteiro contador = 0; contador < 3; contador ++)
	{
		escreva("Informe a nota: ")
		leia(notas[contador])
	}

	para(inteiro contador = 0; contador < 3; contador ++)
	{
	escreva("A nota ", contador + 1, " é: ", notas[contador], "\n")
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 92; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */