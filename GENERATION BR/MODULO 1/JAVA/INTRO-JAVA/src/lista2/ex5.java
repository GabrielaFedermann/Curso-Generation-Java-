package lista2;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		int num=0, x;
		
		Scanner ler = new Scanner(System.in);
		
		do 
		{
			System.out.println("Insira o numero desejado");
			x=ler.nextInt();
			num = num+x;					
		}
		while (x>0);
		System.out.println("O valor da soma dos numeros é: "+num);
		

	}

}
