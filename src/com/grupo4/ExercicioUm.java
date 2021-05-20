package com.grupo4;

import java.util.Scanner;

public class ExercicioUm implements Activity {
    @Override
    public void execute() {
        Scanner keyboard  = new Scanner(System.in);

        System.out.println("Insira um valor:");
        int n = keyboard.nextInt();

        for (int i = 0; i < n; i++) {

            if (i %  2 == 0) {
                System.out.println(i);
            }
        }
    }
}