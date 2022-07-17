package com.introducao.tratamentoDeErros.ExercicioLabs;

public class main {
    public static void main(String[] args) throws ExceptionAgendaCheia, ExceptionContatoInexistente {
        Agenda agenda = new Agenda();

        //ADICIONANDO CONTATO 1
        Contato tiago1 = new Contato();
        tiago1.setNome("test");
        agenda.adicionarContato(tiago1);

        //ADICIONANDO CONTATO 2
        Contato tiago2 = new Contato();
        agenda.adicionarContato(tiago2);


        //ADICIONANDO CONTATO 3
        Contato tiago3 = new Contato();
        agenda.adicionarContato(tiago3);




        System.out.println(agenda.toString());
    }
}
