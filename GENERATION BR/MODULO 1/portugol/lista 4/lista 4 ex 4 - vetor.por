programa
{
	
	funcao inicio()
	{
		  inteiro m[3][3],st=0, c=0,  l=0, sd=0//m[3][3] é para criar a matriz/ l, c, st, sd =0 para iniciar com valor

    		para (l=0;l<3;l++)//condição para alinha
    		{
        		para (c=0;c<3;c++)//condição para coluna
   	 		{
       	 		escreva("Digite um numero: ")
   		 		leia (m[l][c])//leitura na matriz
        			st=st+m[l][c]//soma total com a matriz
        			se(l==c)//se a linha e  acoluna forem a mesa, ele le o valor
        			{
        				sd=sd+m[l][c]//conta para soma da diagoal
        			}

        		}
    		}
    		limpa()
    		para(l=0;l<3;l++)//repete pra dar boa
    		{
        		para(c=0;c<3;c++)//repete pra dar boa
			{
            		escreva ("\t"+ m[l][c])//\t = tabulação
        		}
        		escreva ("\n")
    		}
    		escreva("\n A soma total dos numeros é: "+st+" \nA soma da diagonal é "+sd+7"\nISSO É TUDO PESSOAL!!\n")
    		
    }
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 471; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */