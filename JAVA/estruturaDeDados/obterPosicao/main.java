package com.estruturaDeDados.obterPosicao;

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

        //TESTANDO A FUNÇÃO BUSCAR POSIÇÃO
        System.out.println(vetor.obterPosição("posição"));






    }
}
