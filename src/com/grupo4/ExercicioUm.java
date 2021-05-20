package com.grupo4;

import java.util.Scanner;

public class ExercicioUm implements Activity {
    @Override
    public void execute() {

        //Desenvolva um programa para mostrar os primeiros n números pares, 
        //sendo n um valor que o usuário irá inserir pelo console. 
        Scanner keyboard  = new Scanner(System.in);

        System.out.println("Exercicio 01 - Insira um valor:");
        int n = keyboard.nextInt();

        for (int i = 0; i < n; i++) {

            if (i %  2 == 0) {
                System.out.println(i);
            }
        }
    }
}