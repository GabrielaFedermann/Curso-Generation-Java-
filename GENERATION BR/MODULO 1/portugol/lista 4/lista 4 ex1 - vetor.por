
programa
{
	
	funcao inicio()
	{
		inteiro x, big=0 //big =0 pra poder iniciar com valor
		inteiro vetor[5]

		para (x=0;x<5;x++) // da valor 0 ao x, ai se x for maior que 5 ele da x+1
		{
			escreva("escreva as notas.\n")
			leia (vetor[x])//ler o numero e colocar no vetor
			se (vetor[x]>big)//condição pro vetor
			{
				big=vetor[x]// verificar se o valor no vetor é o maior
			
			}
		}
				
		escreva ("a maior nota foi:"+big)// imprimir o maior
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 8, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */