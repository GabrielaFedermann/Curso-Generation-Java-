programa
{/*
	 *  Quando o número de horas exceder a 50 calcule o excesso de pagamento 
	 *  armazenando-o na variável E, caso contrário zerar tal variável. 
	 *  A hora excedente de trabalho vale R$ 20,00. No final do processamento 
	 *  imprimir o salário total e o salário excedente.
*/
	funcao inicio()
	{
		inteiro c, n, E, v
		escreva("Informe seu código ")
		leia (c)

		escreva("\nInforme suas horas trabalhadas.\n ")
		leia(n)

			se (n<=50)
			{
				n=n*10
				escreva("Funcionário "+c+" você receberá R$ "+n+",00")
			}
			senao
			{
				E=n-50
				v= E*20
				escreva("Funcionário "+c+" Você receberá R$ "+v+",00 de horas extras pois trabalhou "+E+" horas extras")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 667; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */