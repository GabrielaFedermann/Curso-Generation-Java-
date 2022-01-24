programa
{
	
	funcao inicio()
	{
		inteiro x 
		inteiro soma =0//para verdadeiro e falso
		para(x=3;x<=500;x+=3)//numero inicial, numero de para, ordem de soma
		{
			se (x%2==1)//par ou impar
			{
				escreva(x+"\n")// escreve os numeros na tela
				soma = soma+x//soma
			}
			
		}
		escreva("a soma dos numeros impares multiplos de 3 de 1 até 500 é: "+soma)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 378; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */