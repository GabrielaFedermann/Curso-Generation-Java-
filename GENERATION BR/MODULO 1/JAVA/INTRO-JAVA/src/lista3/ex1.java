package lista3;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		int x, big = 0;
		int[] vetor = new int[5];
		Scanner ler = new Scanner(System.in);

		for (x = 0; x < 5; x++)
			
		{
			System.out.println("Escreva as notas.\n");
			vetor[x] = ler.nextInt();
			if (vetor[x] > big)
				
				
			{
				big = vetor[x];
			}
		}
		System.out.println("A maior nota foi:" + big);
	}

}