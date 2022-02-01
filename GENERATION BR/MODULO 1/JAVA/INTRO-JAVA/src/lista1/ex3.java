/*
 * 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa 
 * em segundos e mostre-o expresso em horas, minutos e segundos.
 */

package Lista1;

import java.util.Scanner;

public class ex3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int segundo, minuto, hora;
		System.out.println("Insira o tempo do evento em segundos.");
		segundo = ler.nextInt();
		hora = segundo/3600;
		minuto = segundo%3600/60;
		segundo = segundo%3600%60;
		System.out.println("Seu evento durou: " + hora + " horas " + minuto + " minutos " + segundo + " segundos");
				
	}

}
