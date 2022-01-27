package lista2;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		int x=0, menorIdade=0, maiorIdade=0;
		Scanner ler = new Scanner(System.in);

        while (x!=99)
        {
            System.out.println("Qual a sua idade?");
            x=ler.nextInt();

            if(x<21)
            {
                menorIdade++;
                System.out.println("Numero de menores de idade: "+ menorIdade);

            }
            if(x>50)
            {
                maiorIdade++;
                System.out.println("Numero de maiores de idade: "+ maiorIdade);
            }
        }
        
        
    }
}