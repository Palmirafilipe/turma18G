programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		inteiro numero1
		inteiro numero2
		inteiro numero3
		inteiro numero4

		inteiro quadrado1
		inteiro quadrado2
		inteiro quadrado3
		inteiro quadrado4
		
		escreva("Digite o 1o numero: ")
		leia(numero1)
		escreva("digite o 2o  numero: ")
		leia(numero2)
		escreva("Digite o 3o numero: ")
		leia(numero3)
		escreva("Digite o 4o numero: ")
		leia(numero4)

		//quadrado1 = numero1 * numero1
		quadrado1 = Mat.potencia(numero1,2)
		quadrado2 = Mat.potencia(numero2,2)
		quadrado3 = Mat.potencia(numero3,2)
		quadrado4 = Mat.potencia(numero4,2)

		se (quadrado3 >= 1000)
		{
		escreva("Quadrado do terceiro número: ",quadrado3,"\n")
		}
		senao
		{
		escreva("Numero 1: ", numero1," e seu quadrado é: ",quadrado1,"\n")
		escreva("Numero 2: ", numero2," e seu quadrado é: ",quadrado2,"\n")
		escreva("Numero 3: ", numero3," e seu quadrado é: ",quadrado3,"\n")
		escreva("Numero 4: ", numero4," e seu quadrado é: ",quadrado4,"\n")
		escreva("Escreva fim de programa")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1038; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */