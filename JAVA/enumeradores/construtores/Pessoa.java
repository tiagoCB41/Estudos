package com.enumeradores.construtores;

public class Pessoa {
    enum Genero {
        FEMININO('F'), MASCULINO('M');

        private char valor;

        Genero(char valor){
            this.valor = valor;
        }

        public char getValor() {
            return valor;
        }
    }

    public String nome;
    public Genero genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", genero=" + genero.getValor() +
                '}';
    }
}
