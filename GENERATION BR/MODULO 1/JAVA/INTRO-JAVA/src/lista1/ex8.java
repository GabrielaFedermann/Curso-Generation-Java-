/*
 *  8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor
 *   e dos impostos (aplicados ao custo de fábrica).
 *    Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
 *   escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
 */

package lista1;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		double fabrica, consumidor, imposto28, imposto45;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o valor de fabrica do veiculo ");
		fabrica = ler.nextFloat();
		imposto28 = fabrica*0.28;
		imposto45 = fabrica*0.45;
		consumidor= fabrica + imposto28 + imposto45;
		
		System.out.println(" O valor do veiculo para o consumidor é: "+consumidor);

	}

}
