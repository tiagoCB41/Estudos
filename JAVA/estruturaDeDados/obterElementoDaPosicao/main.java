package com.estruturaDeDados.obterElementoDaPosicao;

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

        //TESTANDO A FUN��O BUSCAR
        System.out.println(vetor.busca(2));

        //LAN�ANDO A EXCE��O DA FUN��O BUSCAR
        System.out.println(vetor.busca(70));




    }
}
