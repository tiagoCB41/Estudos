package com.estruturaDeDados.labs.labs1Contem;

public class main {
    public static void main(String[] args) throws Exception {

        Vetor<String> vetor = new Vetor<String>(2);



        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");


        System.out.println(vetor.contem("C"));


    }
}
