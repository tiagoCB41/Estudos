package com.javaIntermediario.escopoVariaveis;

public class main {
    public static void main(String[] args){

        EscopoVariaveis teste = new EscopoVariaveis();

        teste.setValor(10);
        System.out.println(teste.getValor());//10

        System.out.println(teste.calcularValor(20));//30, MAS NÃO FOI ADICIONADO
        // A PROPRIEDADE DA CLASSE, POIS NÃO FOI USADO O *THIS.VALOR NO METODO
        System.out.println(teste.getValor());



        //*DEMAIS EXEMPLOS DENTRO DA CLASSE EscopoVariaveis*

    }
}
