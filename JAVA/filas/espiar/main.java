package com.filas.espiar;

public class main {
    public static void main(String[] args){

        Filas<Integer> filas = new Filas<>(1);


       
        filas.empilheirar(1);
        filas.empilheirar(2);
        filas.empilheirar(3);

        System.out.println(filas);

        System.out.println(filas.espiar());











    }
}
