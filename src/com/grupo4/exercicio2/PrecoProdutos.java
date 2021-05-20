package aula20Maio;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrecoProdutos {
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        Map<Integer,ArrayList<String>> produtos = new HashMap<>();

        for(int i = 0; i < 3; i++){
            ArrayList<String> atributos = new ArrayList<>();

            Scanner entrada = new Scanner(System.in);
            atributos.add(entrada.nextLine());
            Scanner entrada2 = new Scanner(System.in);
            atributos.add(entrada2.nextLine());
            Scanner entrada3 = new Scanner(System.in);
            atributos.add(entrada3.nextLine());

            produtos.put(i+1,atributos);
        }

        System.out.println(produtos);

        for(Map.Entry<Integer,ArrayList<String>> produto: produtos.entrySet()){
            System.out.println("Produto: " + produto.getKey());
            double total = Double.parseDouble(produto.getValue().get(1)) * Double.parseDouble(produto.getValue().get(2));

            System.out.println("Total: " + formatter.format(total));
        }
    }
}
