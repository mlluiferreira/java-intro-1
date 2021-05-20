package com.grupo4.exercicio2;

import java.util.Map;

public class Empresa {
    private String nome;
    private Map<Integer, Double> valores;
    private Double crescimento;

    public Empresa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<Integer, Double> getValores() {
        return valores;
    }

    public void setValores(Integer ano, Double valores) {
        this.valores.put(ano, valores);
    }

    public Double getCrescimento() {
        return crescimento;
    }

    public void setCrescimento(Double crescimento) {
        this.crescimento = crescimento;
    }
}
