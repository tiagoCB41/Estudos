package com.filas.queue;

import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args){
        Queue<Integer> fila = new LinkedList<>();

        //ADICIONAR
        fila.add(1);
        fila.add(2);
        fila.add(3);

        //TOSTRING
        System.out.println(fila);

        //ESPIAR
        System.out.println(fila.peek());

        //DESENFILEIRAR
        System.out.println(fila.remove());

        System.out.println(fila);

        
    }
}
