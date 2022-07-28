package com.pilhas.desempilha;

public class main {
    public static void main (String[] args) throws Exception {

        Pilha<Integer> pilha = new Pilha<Integer>(2);


        //TESTANDO O METODO COM A PILHA VAZIA
        System.out.println(pilha);
        System.out.println(pilha.desempilha());

        //TESTANDO O METODO COM A PILHA NÃO VAZIA
        pilha.empilhar(1);
        pilha.empilhar(10);
        pilha.empilhar(20);
        System.out.println(pilha);
        System.out.println(pilha.desempilha());
        System.out.println(pilha);



    }
}
