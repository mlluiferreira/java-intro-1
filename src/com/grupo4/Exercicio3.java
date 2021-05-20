package com.grupo4;

import java.util.Scanner;

public class Exercicio3 implements Activity{
    @Override
    public void execute() {
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();
        Boolean cont = false;

        for(int i = 2; i < num; i++){
            if(num % i == 0) {
                cont = true;
                break;
            }
        }

        if(cont) {
            System.out.printf("Nao é primo");
        }else {
            System.out.printf("É primo");
        }
    }
}
