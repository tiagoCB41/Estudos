package com.estruturaDeDados.addFinalVetor;

public class main {
    public static void main(String[] args){

        Vetor vetor = new Vetor(2);


        try {
            vetor.adicionarFinal("posi��o 1");
            vetor.adicionarFinal("posi��o 2");
            vetor.adicionarFinal("posi��o 3");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor.getElementos());

    }
}
