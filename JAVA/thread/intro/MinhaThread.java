package com.thread.intro;

public class MinhaThread extends Thread {

    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    //METODO RUN

    public void run() {

        try {
            for (int i = 1; i < 6; i++) {
                System.out.println(nome + " contador #" + i);
                //THREAD VAI DORMIR POR ESSE TEMPO EM MILISEGUNDOS
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(nome + " acabou");
    }
}


