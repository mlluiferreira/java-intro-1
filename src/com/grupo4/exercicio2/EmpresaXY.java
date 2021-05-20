package aula20Maio;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class EmpresaXY {
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        Map<String,Double> empresas = new HashMap<>();
        int ano = 2021;

        empresas.put("X",1.13);
        empresas.put("Y",18.4);

        System.out.println("Empresa X - " + "01/01/" + ano + " - Valor da empresa X: " + 1.13 + "m");
        System.out.println("Empresa Y - " + "01/01/" + ano + " - Valor da empresa Y: " + 18.4 + "m");

        while(true){
            double valorx = empresas.get("X");
            double valory = empresas.get("Y");

            valorx = valorx + (valorx * 1.48);
            valory = valory + (valory * 0.37);

            empresas.put("X",valorx);
            empresas.put("Y",valory);

            System.out.println("Empresa X - " + "01/01/" + ano + " - Valor da empresa X: " + formatter.format(valorx) + "m");
            System.out.println("Empresa Y - " + "01/01/" + ano + " - Valor da empresa Y: " + formatter.format(valory) + "m");

            ano += 1;

            if(valorx > valory)
                break;
        }
    }
}
