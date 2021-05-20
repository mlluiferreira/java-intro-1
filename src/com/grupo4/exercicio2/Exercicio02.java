package com.grupo4.exercicio2;

import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {

    }

    public static void exercicio01(){
        Integer[] vetor = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        System.out.println("Ordem crescente: ");
        Arrays.stream(vetor).sorted().forEach(n -> System.out.println(n));
        System.out.println("\n\nOrdem decrescente: ");
        Arrays.stream(vetor).sorted(Comparator.reverseOrder()).forEach(n-> System.out.println(n));
    }


    public static void exercicio03(){
        int qtd = 3;
        List<Produto> produtos = criaListaDeProdutos();

        double valorFinal = produtos.stream()
                .map(Produto::calculaValorTotal)
                .reduce((double) 0, (valor1, valor2) -> valor1 + valor2)
                .doubleValue();

        System.out.println("Valor total: " + valorFinal);
    }

    private static List<Produto> criaListaDeProdutos(){
        List<Produto> produtos = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            Scanner teclado = new Scanner(System.in);
            Produto produto = new Produto();
            System.out.println("Digite o nome do produto: ");
            produto.setNome(teclado.next());
            System.out.println("Digite o valor do produto: ");
            produto.setValor(teclado.nextDouble());
            System.out.println("Digite a quantidade do produto: ");
            produto.setQuantidade(teclado.nextInt());

            produtos.add(produto);

        }
        return produtos;
    }
}
