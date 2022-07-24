package com.estruturaDeDados.removerPosicaoVetor;

public class main {
    public static void main(String[] args){

        Vetor vetor = new Vetor(3);


        try {
            vetor.adicionar("posição 0");
            vetor.adicionar("posição 1");
            vetor.adicionar("posição 2");
            vetor.adicionar("posição 3");
            vetor.adicionar("posição 4");

        } catch (Exception e) {
            e.printStackTrace();
        }



        System.out.println(vetor.getElementosTeste());

        //REMOVENDO PELA POSIÇÃO ("POSIÇÃO 1")
        vetor.removerPos(1);
        System.out.println(vetor.getElementosTeste());

        //REMOVENDO PELO CONTEUDO ("POSIÇÃO 2")
        vetor.removerString("posição 2");
        System.out.println(vetor.getElementosTeste());

        System.out.println(vetor.getTamanho());









    }
}
