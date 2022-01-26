/*
 *  4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
 *   calcule a seguinte expressão: D = (R+S)*2 -- ONDE R = (A+B) AO QUADRADO E S = (B+C) AO QUADRADO
 */

package lista1;

import java.util.Scanner;

public class ex4 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		float  a, b, c, r, s, d;
		System.out.println("insira valor de A ");
		a = ler.nextFloat();
		System.out.println("insira valor de B ");
		b = ler.nextFloat();
		System.out.println("insira valor de C ");
		c = ler.nextFloat();
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		d = (r+s)/2;
		System.out.println("valor de  D = "+d);
	}

}
