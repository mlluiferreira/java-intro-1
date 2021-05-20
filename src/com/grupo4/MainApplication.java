package com.grupo4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainApplication {
    public static void main(String... args) {

        Map<Integer, Activity> activities = new HashMap<>();

        activities.put(1, new ExercicioUm());
        activities.put(2, new ExercicioDois());
        activities.put(3, new Exercicio3());
        activities.put(4, new ExercicioQuatro());
        activities.put(5, new Exercicio5());

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o numero do exercicio: ");
            int exercicio = scanner.nextInt();

            Activity atividade = activities.getOrDefault(exercicio, new DummyActivity());
            atividade.execute();
        }

    }
}
