package com.estruturaDeDados.VetorDinamicoGENERICS;

public class main {
    public static void main(String[] args) throws Exception {
        // ENTRE "<>" DEFINIR O TIPO DO VETOR COMO MOSTRADO ABAIXO
        Vetor<Contato> vetor = new Vetor<Contato>(2);

        Contato c1 = new Contato("tiago1" , "7899-7845");
        Contato c2 = new Contato("tiago2" , "7899-7845");
        Contato c3 = new Contato("tiago3" , "7899-7845");


        vetor.adicionar(c1);
        vetor.adicionar(c2);
        vetor.adicionar(c3);



        System.out.println(vetor.getElementosTeste());
        System.out.println(vetor.getTamanho());

        //TESTANDO O METODO OBTER POSIÇÃO COM O TIPO VETOR <T>
        //**TESTE OK**
        System.out.println("TEST RESULT = " + vetor.obterPosição(c3));
    }
}
