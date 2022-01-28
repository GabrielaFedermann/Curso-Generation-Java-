package lista3;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int st = 0, c = 0, l = 0, sd = 0;

		for (l = 0; l < 3; l++)
			
		{
			for (c = 0; c < 3; c++)
				
			{
				System.out.println("Digite um numero: ");
				(matriz[l][c]) = ler.nextInt();
				st = st + matriz[l][c];
				if (l == c)
					
				{
					sd = sd + matriz[l][c];
				}
			}
		}
		for (l = 0; l < 3; l++)
			
		{
			for (c = 0; c < 3; c++)
				
			{
				System.out.println("\t" + matriz[l][c]);
			}
			System.out.println("\n");
		}
		System.out.println("\n A soma total dos numeros é: " + st + " \nA soma da diagonal é " + sd + 7
				+ "\n ISSO É TUDO PESSOAL!!  É ISSO AI VELHINHO!!");
	}

}
