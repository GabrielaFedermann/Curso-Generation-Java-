package Lista3;

import java.util.Scanner;

public class ex2 {
	

	public static void main(String[] args) {
		int maior=0, soma=03, x, contmaior=0;
		int []vetor = new int [10];
		Scanner ler = new Scanner(System.in);

				for (x=0;x<10;x++)
				{
					System.out.println("Jogue o dado");
					vetor[x]=ler.nextInt();
					if(vetor[x]>maior)
					{
						maior=vetor[x];
					}
					soma=soma+vetor[x];			
				}
				for(x=0;x<10;x++)
				{
					if(vetor[x]==maior)
					{
						contmaior++;
					}
					System.out.println(vetor[x]+"\t");
				
				}
				System.out.println("\nA média dos lançamentos é "+soma/10);
				System.out.println("\nO maior valor aparece "+ maior+" vezes");

	}

}
