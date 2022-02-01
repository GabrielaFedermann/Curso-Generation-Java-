/*
 *  1. Faça um sistema que leia a idade de uma pessoa expressa em 
 *  anos, meses e dias e mostre-a expressa apenas em dias.
 */

package Lista1;

import java.util.Scanner;

public class ex1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int ano, mes, dia;
		System.out.println("Insira quantos anos você tem: ");
		ano = ler.nextInt();
		System.out.println("Insira quantos meses você tem: ");
		mes = ler.nextInt();
		System.out.println("insira quantos dias você tem: ");
		dia = ler.nextInt();
		System.out.println("Você tem " + (ano*365 + mes*30 + dia) + " dias de vida!");
	}
	
}
