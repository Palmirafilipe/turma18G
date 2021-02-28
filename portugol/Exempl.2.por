programa
{

	inteiro anoNasc, mesNasc, diaNasc, anoAtual, mesAtual, diaAtual 
	inteiro idadeEmAnos, idadeEmMeses, idadeEmDias,difDias,totalEmDias
	
	funcao 
	inicio()

	{
		
		cadeia nome
		
		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite o dia em que você nasceu: ")
		leia(diaNasc)
		escreva("Digite o mês em que você (em algarismo):")
		leia(mesNasc)
		escreva("Digite o ano em que você nasceu: ")
		leia(anoNasc)
		escreva("Qual dia é hoje? ")
		leia(diaAtual)
		escreva("Em qual mes estamos? ")
		leia(mesAtual)
		escreva("Em que ano estamos? ")
		leia(anoAtual)

		idadeEmAno = (anoAtual - anoNasc) * 365

		idadeEmMes = (mesAtual - mesNasc) * 30

		idadeEmDia = (diaAtual - diaNasc)
		se (mesNasc > mesAtual)
{
			difDias = (30 -diaAtual)
			idade = idadeEm
}

		totalEmDias = idadeEmAnos + idadeEmMeses
		escreva("Sua idade em dias é: ", totalEmDias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 13; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */