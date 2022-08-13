package com.filas.queueComPrioridade;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class main {
    public static void main(String[] args){


        //DECLARANDO O METODO DE COMPARAÇÃO DENTRO DE UMA NEW COMPARATOR
        //COMO MOSTRA O EXEMPLO ABAIXO

        Queue<Pacientes> paciente = new PriorityQueue<>(
                new Comparator<Pacientes>() {
                    public int compare(Pacientes p1, Pacientes p2) {
                    return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
                    }
                }
        );





        paciente.add(new Pacientes("a", 2));
        paciente.add(new Pacientes("c", 1));

        System.out.println(paciente);


        // OU UTILIZANDO O METODO COMPARETO IMPLEMENTADO DENTRO
        // DA CLASSE INSTANCIADA

        Queue<Pacientes> paciente2 = new PriorityQueue<>();

        paciente2.add(new Pacientes("a", 2));
        paciente2.add(new Pacientes("c", 1));
        paciente2.add(new Pacientes("b", 3));

        System.out.println(paciente2);


    }
}
