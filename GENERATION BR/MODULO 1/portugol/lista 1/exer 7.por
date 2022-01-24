programa
{
	
	funcao inicio()
	{
		real a,b,c,d,E,f, x, y
		escreva("insira os valores para: A, B, C, D, E, F ")
		leia (a, b, c, d, E, f)
		x = (c*E-b*f)/(a*E-b*d)
		y = (a*f-c*d)/(a*E-b*d)
		escreva(" o valor de X é "+x+"\n O valor de Y é "+y)
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