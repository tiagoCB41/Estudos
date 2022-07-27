package com.estruturaDeDados.labs.labs5Limpar;

public class main {
    public static void main(String[] args) throws Exception {

        Vetor<String> vetor = new Vetor<String>(2);



        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("C");
        vetor.adicionar("C");
        vetor.adicionar("A");


        vetor.removeElemento("C");

        System.out.println(vetor.getElementosTeste());

        System.out.println(vetor.getElementoPOS(1));

        vetor.limpar();

        System.out.println(vetor.getElementosTeste());




    }
}
