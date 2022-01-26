/*
 * 7. Um sistema de equações lineares do tipo: , pode ser resolvido segundo mostrado abaixo:
 *  Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
 */

package lista1;

import java.util.Scanner;

public class ex7 {
	public static void main(String args[])
	{
		float a,b,c,d,e,f, x, y;
		Scanner ler = new Scanner(System.in);
		System.out.println("insira os valores para: A");
		a=ler.nextFloat();
		System.out.println("insira os valores para: B");
		b=ler.nextFloat();
		System.out.println("insira os valores para: C");
		c=ler.nextFloat();
		System.out.println("insira os valores para: D");
		d=ler.nextFloat();
		System.out.println("insira os valores para: E");
		e=ler.nextFloat();
		System.out.println("insira os valores para: F");
		f=ler.nextFloat();
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		System.out.println(" O valor para X é "+x+"\n O valor para Y é "+y);
	}
}
