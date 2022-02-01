/*
 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e
 *  mostre-a expressa em anos, meses e dias. 
 */

package Lista1;

import java.util.Scanner;

public class ex2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int dia, dias, mes, ano;
		System.out.println("Insira quantos dias de vida você tem: ");
		dias = ler.nextInt();
		ano = dias/365;
				mes = dias%365/30;
				dia = dias%365%30;
				System.out.println("Você tem "+ano+" anos "+mes+" meses e "+dia+" dias de vida");
	}

}
