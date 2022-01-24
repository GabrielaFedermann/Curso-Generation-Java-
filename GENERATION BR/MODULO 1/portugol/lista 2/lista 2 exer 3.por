programa
{
	
	funcao inicio()
	{
		real b, a, h
		escreva ("Insira os valores de  AREA do triangulo\n")
		leia (a)
		escreva ("\nInsira os valores de BASE do triangulo\n")
		leia (b)

		se ((a>=0)e(b>=0))
		{
			h=b*a/2
			escreva ("\nA área do Triangulo é: "+h)
		}
		senao
		{
			escreva ("\nInsira valores validos.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */