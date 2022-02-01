package Lista2;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
        int valor1, valor2, valor3, valor4, valor5, valor6, valor7, valor8, valor9, valor0;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o 1° valor");
        valor1 = ler.nextInt();
        System.out.println("Insira o 2° valor");
        valor2 = ler.nextInt();
        System.out.println("Insira o 3° valor");
        valor3 = ler.nextInt();
        System.out.println("Insira o 4° valor");
        valor4 = ler.nextInt();
        System.out.println("Insira o 5° valor");
        valor5 = ler.nextInt();
        System.out.println("Insira o 6° valor");
        valor6 = ler.nextInt();
        System.out.println("Insira o 7° valor");
        valor7 = ler.nextInt();
        System.out.println("Insira o 8° valor");
        valor8 = ler.nextInt();
        System.out.println("Insira o 9° valor");
        valor9 = ler.nextInt();
        System.out.println("Insira o 10° valor");
        valor0 = ler.nextInt();

        for  (int v=1; v<=10; v++)
        {
            if (v%2==0)
                System.out.println("O valor é par! ");

        else 
        {
            System.out.println("O valor é impar! ");
        }
        }
    }

	}
