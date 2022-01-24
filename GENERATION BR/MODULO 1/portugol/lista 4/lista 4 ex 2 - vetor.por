programa
{
	
	funcao inicio()
	{
		inteiro maior=0, soma=03, vetor[10], x, contmaior=0

		para (x=0;x<10;x++)
		{
			escreva("Jogue o dado")
			leia (vetor[x])
			se(vetor[x]>maior)
			{
				maior=vetor[x]
			}
			soma=soma+vetor[x]			
		}
		para(x=0;x<10;x++)
		{
			se(vetor[x]==maior)
			{
				contmaior++
			}
			escreva(vetor[x]+"\t")
		
		}
		escreva("\nA média dos lançamentos é "+soma/10)
		escreva ("\nO maior valor aparece "+ maior+" vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 308; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */