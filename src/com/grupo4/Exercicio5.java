package com.grupo4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 implements Activity{

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe N");
        int n = scanner.nextInt();
        System.out.println("Informe M");
        int m = scanner.nextInt();
        System.out.println("Informe D");
        int d = scanner.nextInt();

        ArrayList<Integer> resultado = new ArrayList<>();

        for (int i = 0; resultado.size() < n; i++){
            if (verifyDigits(i, m, d)){
                resultado.add(i);
            }
        }

        for (Integer numeroTeste: resultado) {
            System.out.println(numeroTeste);
        }

    }

    private boolean verifyDigits(int i, int m, int d) {
        String number = String.valueOf(i);
        char[] digits1 = number.toCharArray();
        int count = 0;
        for (char numberChar: digits1) {
            if (Integer.parseInt(String.valueOf(numberChar)) == d){
                count++;
            }
        }
        return count >= m;
    }
}
