/*
 *  5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
 *   Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
 */
package Lista1;

import java.util.Scanner;

public class ex5 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		float a,b,c, media;
		System.out.println("Insira primeira nota.");
		a = ler.nextFloat();
		System.out.println("Insira segunda nota.");
		b = ler.nextFloat();
		System.out.println("Insira pterceira nota.");
		c = ler.nextFloat();
		a= a*2;
		b=b*3;
		c=c*5;
		media=(a+b+c)/10;
				
		System.out.println(" a média ponderada é: "+media);
	}

}
