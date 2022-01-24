programa
{
	
	funcao inicio()
	{
		inteiro x// numero que eu recebo
		real med // pois o numero de resposta pode ser quebrado
		inteiro quant=0// zero para poder iniciar/ contador
		inteiro tot=0//zero para iniciar
		
		escreva("Insira um numero\n")
		leia (x)

		enquanto (x>=0)//se inserir 0 ele contabiliza, se for negativo -# ele não roda
		{
		quant++ //++ equivale a +1 ou seja quantidade = quantidade + 1	
		tot = tot+x//pegar o total ja inserido e adicionar x ao contador
		limpa()
		escreva("Insira um numero\n")
		leia (x)
		
		}
		med= tot/quant //média é feita com o numero total dividido pela quantidade que o computador recebeu
		escreva("\na quantidade de valores inseridos é "+ quant)
		escreva("\no total da soma é "+tot)
		escreva("\n A média da somatória de todos os numeros inseridos é " +med)
	
		escreva("\n(:  FIM DO PROGRAMA!!! :)")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */