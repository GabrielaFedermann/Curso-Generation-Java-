package Lista3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int l = 0, c = 0;
		int m2[][] = new int[4][6];
		int l1 = 0, c1 = 0;

		Scanner ler = new Scanner(System.in);
		for (l = 0; l < 4; l++) {
			for (c = 0; c < 6; c++) {
				System.out.println("Insira o valor de N1 na posição: L" + l + " C" + c + " ");
				(n1[l][c]) = ler.nextInt();
			}
		}
		for (l = 0; l < 4; l++)
			
		{
			for (c = 0; c < 6; c++)
				
			{
				System.out.println("Insira o valor de N2 na posição: L " + l + " C " + c);
				(n2[l][c]) = ler.nextInt();
			}
		}
		for (l = 0; l < 4; l++)
			
		{
			for (c = 0; c < 6; c++)
				
			{
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
		for (l = 0; l < 4; l++)
			
		{
			for (c = 0; c < 6; c++)
				
			{
				System.out.println("\n A soma é " + m1[l][c] + "\n A diferença é " + m2[l][c]);
			}
		}
	}
}