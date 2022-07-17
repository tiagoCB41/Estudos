package com.introducao.tratamentoDeErros.ExercicioLabs;

public class ExceptionContatoInexistente extends Exception {


    public String toString(String nome) {
        return "Contato: " + nome + " inexistente.";
    }
}
