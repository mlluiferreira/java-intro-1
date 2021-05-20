package com.grupo4;

import java.util.Scanner;

public class ExercicioDois implements Activity {
//    Desenvolva um programa para mostrar os primeiros n números múltiplos de m, sendo n e m valores que o
//    usuário irá inserir via console. Lembre-se que um número a é divisível por b se a é divisível por b.
    @Override
    public void execute() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Exercicio 02 - Digite um valor: ");
        int numero = teclado.nextInt();
        System.out.print("Exercicio 02 - Digite um numero para verificar o multiplo: ");
        int multiplo = teclado.nextInt();

        for (int i = 0 ; i < multiplo ; i ++){
            if (i * multiplo == numero ) System.out.println(i);
        }
    }
}
