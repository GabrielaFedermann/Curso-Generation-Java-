package lista2;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int x, quantia=0, total=0;
		double med;
		
		do
		{
			System.out.println("Insira os valores, digite 0 ao terminar para sair.");
			x=ler.nextInt();
			if (x%3==0 && x>1)
			{
			quantia++;
			total=total+x;
			}
		}
		while(x!=0);
			med=total/quantia;
		System.out.println("a quantia de valores inseridos é "+ quantia);
		System.out.println(" A média dos numeros inseridos "+med);
		}

}
