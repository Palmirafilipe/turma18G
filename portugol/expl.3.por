programa
{
	
	funcao inicio()
	{
		inteiro tempoDuracao
		inteiro horas = 0
		inteiro minutos = 0
		inteiro segundos = 0


		escreva("Digite o tempo de duração em swgundos:")
		leia (tempoDuracao)

		horas = tempoDuracao /3600
		minutos = (tempoDuracao % 3600) /60
		segundos = (tempoDuracao % 3600) %60

		escreva("Hora[s]: ", horas)
		escreva("\nMinutos[s]: ", minutos)
		escreva("\nSegundos[s]:", segundos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 125; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */