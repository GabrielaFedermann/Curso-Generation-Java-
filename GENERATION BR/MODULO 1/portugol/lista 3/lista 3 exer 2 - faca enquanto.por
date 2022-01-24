programa
{
	
	funcao inicio()
	{
		inteiro x
		inteiro soma=0// não pode iniciar sem valor
 			escreva("Digite um numero\n")
			leia (x)
		
		faca {
			
			escreva("\n"+x+"\n")
			soma = soma+x// vai pegar a soma 0 adicionar o valor de x
			x--//pegar o valor de x e  diminuir 1 (x-- é independente de soma)
		}
		enquanto (x>=1)// enquanto x for maior igual a 1 ele vai repetir, quando acabar ele para e vai para o escreva
		escreva(" a soma é: " + soma)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */