programa
{
	
	funcao inicio()
	{
		inteiro idade
		escreva ("Insira a idade do participante do torneio de natação  ")
		leia (idade)

		se ((idade == 5) ou (idade == 6) ou (idade == 7))
		{
			escreva ("Participante da categoria INFANTIL A")
		}
		senao se ((idade == 8) ou (idade == 9) ou (idade == 10) ou (idade == 11))
		{
			escreva ("Participante da categoria INFANTIL B ")
		}
		senao se ((idade == 12 ) ou (idade == 13))
		{
			escreva ("Participante da categoria JUVENIL A")
		}
		senao se  ((idade == 14) ou (idade == 15) ou (idade == 16) ou (idade == 17))
		{
			escreva ("Participante da categoria JUVENIL B")
		}
		senao se ((idade >=18))
		{
			escreva ("Participante da categoria ADULTOS")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 708; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */