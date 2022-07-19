package com.estruturaDeDados.imprimirElementosVetor;

public class main {
    public static void main(String[] args){

        Vetor vetor = new Vetor(4);


        try {
            vetor.adicionarFinal("posição 1");
            vetor.adicionarFinal("posição 2");
            vetor.adicionarFinal("posição 3");
            vetor.adicionarFinal("posição 4");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor);

        System.out.println(vetor.getElementosTeste());



    }
}
