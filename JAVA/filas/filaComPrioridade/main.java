package com.filas.filaComPrioridade;

public class main {
    public static void main(String[] args){


        FilaComPrioridade<Integer> fila  = new FilaComPrioridade<Integer>();

        fila.emfileira(1);
        fila.emfileira(3);
        fila.emfileira(2);
        fila.emfileira(0);

        System.out.println(fila);

    }
}
