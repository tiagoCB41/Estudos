package com.introducao.POO.introdução.exercicioLampada;

public class testLampada {

    public static void main (String[] args) {

     ObjLampada test = new ObjLampada();

     test.setLigada(false);

     test.mostrarEstado();

     test.ligar();

     test.mostrarEstado();

     test.mudarEstado();

     test.mostrarEstado();



    }
}
