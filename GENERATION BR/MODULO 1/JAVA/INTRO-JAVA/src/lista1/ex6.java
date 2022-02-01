/*
 * 6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
 *  P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
 *  D = RAIZ QUADRADA DE (X2-X1)AO QUADRADO + (Y2-Y1) AO QUADRADO
 */

package Lista1;

import java.util.Scanner;

public class ex6 {
	public static void main(String args[])
	{
		double  x1, x2, y1, y2, distancia;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o valo x1 do plano 1");
		x1=ler.nextDouble();
		System.out.println("Insira o valor y1 do plano 1");
		y1=ler.nextDouble();
		System.out.println("Insira o valor x2 do plano 2");
		x2=ler.nextDouble();
		System.out.println("Insira o valo y2 do plano 2");
		y2=ler.nextDouble();
		distancia = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println(" A distancia é: " + distancia);
	}
	
}
