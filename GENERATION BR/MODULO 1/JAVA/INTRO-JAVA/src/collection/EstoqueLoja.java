package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstoqueLoja {

    public static void main(String[] args) {
        List<String> itens = new ArrayList<>(); //volta sempre pra interface
        itens.add("psp");
        itens.add("ps4");
        itens.add("ps5");
        itens.add("xbox1");
        itens.add("xboxx");

        Collections.sort(itens);
        System.out.println(itens);
        boolean existe = itens.contains("ps5");
        System.out.println(existe);
        itens.add(1, "xboxx"); // set 
        System.out.println(itens);  // naum
        itens.remove(2);
        System.out.println(itens);

        System.out.println(itens.get(2)); // mostra o escolhido

        System.out.println(itens.size()); // size

        itens.clear(); // apaga geral
        System.out.println(itens);
    }
}
