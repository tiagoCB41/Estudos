package com.filas.filaComPrioridade;

public class main {
    public static void main(String[] args){


        FilaComPrioridade<Integer> fila  = new FilaComPrioridade<Integer>();

        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(2);
        fila.enfileira(0);

        System.out.println(fila);


        FilaComPrioridade<Pacientes> paciente  = new FilaComPrioridade<>();

        paciente.enfileira(new Pacientes("a", 2));
        paciente.enfileira(new Pacientes("b", 3));
        paciente.enfileira(new Pacientes("c", 1));

        System.out.println(paciente);

    }
}
