programa
{
	
	funcao inicio()
	{
		real M
		real P
		real E
		
		escreva("sistema de pesagem do estado de São Paulo")
		escreva("\nverifique aqui o peso dos seus produtos")
		escreva("\ninforme o kilo do produto")
		leia(P)

		E = P - 50
		M = 4.0 - E
		
		se (P > 50 )
		{
		escreva("Você excedeu o peso de: ", E, " kilos")
		escreva("\nvocê não possui multa no valor de: ", M, " reais")
		}
		senao se (P <= 50)
		{
		E = 0
		M = 0.00
		escreva("Você não possui kilo excedente: ", E)
		escreva("\nVocê não possui multa a ser paga para o Estado: ", M)}}		
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 559; 
 * @PONTOS-DE-PARADA = 13;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */