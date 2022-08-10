package com.filas.introducao;

public class main {
    public static void main(String[] args){

        Filas<Integer> filas = new Filas<>(1);

        //ESTÁ VAZIA?
        System.out.println(filas.estaVazia());


        //EMPILHEIRANDO
        filas.empilheirar(1);
        filas.empilheirar(2);
        filas.empilheirar(3);
        //IMPRIMINDO TAMANHO
        System.out.println(filas.getTamanho());

        //ESTÁ VAZIA?
        System.out.println(filas.estaVazia());

        //TOSTRING
        System.out.println(filas);

        //DESENFILEIRANDO E IMPRIMINDO TAMANHO
        System.out.println(filas.desenfileirar());
        System.out.println(filas.getTamanho());

        //TOSTRING
        System.out.println(filas);




    }
}
