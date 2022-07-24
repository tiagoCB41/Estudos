package com.estruturaDeDados.generealizarVetor;

public class main {
    public static void main(String[] args) throws Exception {
        //AUMENTAR CAPACIDADE OBJECT **OK
        Vetor vetor = new Vetor(1);

        Contato c1 = new Contato("tiago1" , "7899-7845");
        Contato c2 = new Contato("tiago2" , "7899-7845");
        Contato c3 = new Contato("tiago3" , "7899-7845");

        //ATRIBUINDO OBJETOS DA CLASSE CONTATO AO VETOR OBJECT ELEMENTOS
        vetor.adicionar(c1);
        vetor.adicionar(c2);
        vetor.adicionar(c3);
        vetor.adicionar("test",0);

        System.out.println(vetor.getElementosTeste());
        System.out.println(vetor.getTamanho());
    }
}
