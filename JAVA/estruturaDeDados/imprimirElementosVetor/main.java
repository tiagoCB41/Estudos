package com.estruturaDeDados.imprimirElementosVetor;

public class main {
    public static void main(String[] args){

        Vetor vetor = new Vetor(4);


        try {
            vetor.adicionarFinal("posi��o 1");
            vetor.adicionarFinal("posi��o 2");
            vetor.adicionarFinal("posi��o 3");
            vetor.adicionarFinal("posi��o 4");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor);

        System.out.println(vetor.getElementosTeste());



    }
}
