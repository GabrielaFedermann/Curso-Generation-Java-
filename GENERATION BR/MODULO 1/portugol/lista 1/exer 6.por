programa
{
	inclua biblioteca Matematica -->Mat

	
	funcao inicio()
	{
		real x1, x2, y1, y2, distancia
		escreva("Insira os valores do plano 1 ")
		leia (x1, y1)
		escreva ("Insira os valores do plano 2 ")
		leia (x2, y2)
		distancia = (x2-x1)+(y2-y1) //raiz e potencia se anularam
		escreva ("Distancia: " + distancia)
		//prova real   distancia = Mat.raiz((((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))),2.0)
		//escreva ("\nDistancia: " + distancia)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 443; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */