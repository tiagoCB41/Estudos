package com.pilhas.verificarElementoTopo;

public class main {
    public static void main (String[] args) throws Exception {

        Pilha<Integer> pilha = new Pilha<Integer>(2);


        //TESTANDO O METODO COM A PILHA VAZIA
        System.out.println(pilha);
        System.out.println(pilha.topo());

        //TESTANDO O METODO COM A PILHA NÃO VAZIA
        pilha.empilhar(1);
        pilha.empilhar(10);
        System.out.println(pilha);
        System.out.println(pilha.topo());



    }
}
