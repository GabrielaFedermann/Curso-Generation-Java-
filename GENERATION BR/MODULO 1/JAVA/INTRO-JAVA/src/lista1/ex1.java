/*
 *  1. Fa�a um sistema que leia a idade de uma pessoa expressa em 
 *  anos, meses e dias e mostre-a expressa apenas em dias.
 */

package Lista1;

import java.util.Scanner;

public class ex1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int ano, mes, dia;
		System.out.println("Insira quantos anos voc� tem: ");
		ano = ler.nextInt();
		System.out.println("Insira quantos meses voc� tem: ");
		mes = ler.nextInt();
		System.out.println("insira quantos dias voc� tem: ");
		dia = ler.nextInt();
		System.out.println("Voc� tem " + (ano*365 + mes*30 + dia) + " dias de vida!");
	}
	
}
