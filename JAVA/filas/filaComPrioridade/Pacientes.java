package com.filas.filaComPrioridade;

import org.jetbrains.annotations.NotNull;

public class Pacientes implements Comparable<Pacientes>{
    private String nome;
    private int prioridade;

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

        if (this.prioridade < o.getPrioridade()){
            return 1;
        }else if (this.prioridade > getPrioridade()) {
            return -1;
        }else{return 0;}


    }
}
