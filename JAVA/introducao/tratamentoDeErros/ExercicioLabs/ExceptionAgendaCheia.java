package com.introducao.tratamentoDeErros.ExercicioLabs;

public class ExceptionAgendaCheia extends Exception  {

    @Override
    public String toString() {
        return "A agenda está cheia";
    }
}
