package com.estruturaDeDados.addFinalVetor;

public class main {
    public static void main(String[] args){

        Vetor vetor = new Vetor(2);


        try {
            vetor.adicionarFinal("posição 1");
            vetor.adicionarFinal("posição 2");
            vetor.adicionarFinal("posição 3");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor.getElementos());

    }
}
