package com.estruturaDeDados.addMeioVetor;

public class main {
    public static void main(String[] args){

        Vetor vetor = new Vetor(10);


        try {
            vetor.adicionar("posição 0");
            vetor.adicionar("posição 1");
            vetor.adicionar("posição 2");
            vetor.adicionar("posição 3");
            vetor.adicionar("posição 4");

        } catch (Exception e) {
            e.printStackTrace();
        }



        vetor.adicionar("tiago",3);

        System.out.println(vetor.getElementosTeste());





    }
}
