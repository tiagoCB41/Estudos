package com.pilhas.empilhar;

public class main {
    public static void main (String[] args) throws Exception {

        Pilha<Integer> pilha = new Pilha<Integer>(2);

        for (int i=1; i<=10; i++){
            pilha.empilhar(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());


    }
}
