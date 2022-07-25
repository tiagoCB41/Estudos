package com.estruturaDeDados.labs.labs2LasIndexOf;

public class main {
    public static void main(String[] args) throws Exception {

        Vetor<String> vetor = new Vetor<String>(2);



        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("C");
        vetor.adicionar("C");
        vetor.adicionar("A");


        System.out.println(vetor.ultimoIndice("A"));

        System.out.println(vetor.ultimoIndice2("A"));


    }
}
