package com.introducao.tratamentoDeErros.ExercicioLabs;

import java.util.Arrays;

public class Agenda {
    Contato [] contatos;

    public Agenda () {
        contatos = new Contato[3];
    }

    public void adicionarContato (Contato c) throws ExceptionAgendaCheia {
        boolean cheia = false;
        for (int i = 0; i< contatos.length; i++) {
            cheia = true;
            if (contatos[i] == null) {
                contatos[i] = c;
                cheia = false;
                break;
            }
        }

        if (cheia == true) {
            throw new ExceptionAgendaCheia();
        }
    }

    public int consultarContato (String name) throws ExceptionContatoInexistente {

        boolean sucess = false;
        for (int i = 0; i < contatos.length; i++) {

            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(name)) {
                    return i;

                }
            }
        }
        if (!sucess) {
            throw new ExceptionContatoInexistente();
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + Arrays.toString(contatos) +
                '}';
    }
}
