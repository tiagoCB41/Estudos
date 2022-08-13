package com.filas.queueComPrioridade;

import org.jetbrains.annotations.NotNull;

public class Pacientes implements Comparable<Pacientes>{
    private String nome;
    private int prioridade;

    public Pacientes(String nome, int prioridade) {
        super();
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int compareTo(@NotNull Pacientes o) {

        if (this.prioridade > o.getPrioridade()){
            return 1;
        } else if (this.prioridade < o.getPrioridade()){
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Pacientes{" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}
