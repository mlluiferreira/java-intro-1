package com.grupo4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Desenvolva um programa para mostrar por console os primeiros n números primos,
// sendo n um valor que o usuário irá inserir pelo console.

public class ExercicioQuatro implements Activity {
    @Override
    public void execute() {
        System.out.println("Digite a quantidade de numeros primos a serem mostrados: ");
        Scanner scanner = new Scanner(System.in);
        int quantityOfNumbers = scanner.nextInt();

        List<Integer> primeNumbers = new ArrayList<>();

        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            if(ehPrimo(i)) {
                System.out.println(i);
                primeNumbers.add(i);
            }
            if(primeNumbers.size() == quantityOfNumbers) break;
        }
    }

    boolean ehPrimo(int numero) {
        List<Integer> multiplos = new ArrayList<>();

        for(int i  = 1; i <= numero/2; i++) {
            if(numero % i == 0) multiplos.add(i);
        }

        multiplos.add(numero);

        return multiplos.size() == 2;
    }
}
