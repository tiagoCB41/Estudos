package com.estruturaDeDados.removerPosicaoVetor;

public class main {
    public static void main(String[] args){

        Vetor vetor = new Vetor(3);


        try {
            vetor.adicionar("posi��o 0");
            vetor.adicionar("posi��o 1");
            vetor.adicionar("posi��o 2");
            vetor.adicionar("posi��o 3");
            vetor.adicionar("posi��o 4");

        } catch (Exception e) {
            e.printStackTrace();
        }



        System.out.println(vetor.getElementosTeste());

        //REMOVENDO PELA POSI��O ("POSI��O 1")
        vetor.removerPos(1);
        System.out.println(vetor.getElementosTeste());

        //REMOVENDO PELO CONTEUDO ("POSI��O 2")
        vetor.removerString("posi��o 2");
        System.out.println(vetor.getElementosTeste());

        System.out.println(vetor.getTamanho());









    }
}
