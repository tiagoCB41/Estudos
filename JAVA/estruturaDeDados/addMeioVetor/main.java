package com.estruturaDeDados.addMeioVetor;

public class main {
    public static void main(String[] args){

        Vetor vetor = new Vetor(10);


        try {
            vetor.adicionar("posi��o 0");
            vetor.adicionar("posi��o 1");
            vetor.adicionar("posi��o 2");
            vetor.adicionar("posi��o 3");
            vetor.adicionar("posi��o 4");

        } catch (Exception e) {
            e.printStackTrace();
        }



        vetor.adicionar("tiago",3);

        System.out.println(vetor.getElementosTeste());





    }
}
