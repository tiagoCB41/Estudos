package com.javaIntermediario.paramScopoEReferencia;

public class Contato {

    private String nome;
    private String tele;


    public Contato() {
    }

    public Contato(String nome, String tele) {
        this.nome = nome;
        this.tele = tele;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", tele='" + tele + '\'' +
                '}';
    }
}
