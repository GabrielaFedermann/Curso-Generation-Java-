programa
{
	
	funcao inicio()
	{
		inteiro n1[4][6],n2[4][6],m1[4][6],l=0,c=0,m2[4][6],l1=0,c1=0//matriz e variaveis para receber os valores
		para(l=0;l<4;l++)//condição de linha
		{
			para (c=0;c<6;c++)//condição de coluna
			{
				escreva("Insira o valor de N1 na posição: L"+l+" C"+c+" ")// receber valores para tabela n1
				leia (n1[l][c])//atribuir os valores recebidos
			}
		}
		para(l=0;l<4;l++)//condição de linha
		{
			para (c=0;c<6;c++)// condição de coluna
			{
				escreva("Insira o valor de N2 na posição: L "+l+" C "+c)// receber valores para tabela n2
				leia (n2[l][c])//atribuir valores para tabela n2
			}
		}
		para(l=0;l<4;l++)//condição
		{
			para (c=0;c<6;c++)//condição
			{
				m1[l][c]=n1[l][c]+n2[l][c]//soma dos valores para m1
				m2[l][c]=n1[l][c]-n2[l][c]//diferença dos valores para m2
			}
		}
		para(l=0;l<4;l++)//condição
		{
			para (c=0;c<6;c++)//condição
			{
			escreva("\n A soma é "+ m1[l][c] + "\n A diferença é "+m2[l][c])//imprimir os valores
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 672; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 10, 2}-{n2, 6, 19, 2}-{m1, 6, 28, 2}-{m2, 6, 45, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */