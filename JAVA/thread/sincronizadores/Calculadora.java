package com.thread.sincronizadores;

public class Calculadora {
    private int soma;

    public int somar(int[] valores){
        this.soma = 0;

        for (int i=0; i<valores.length; i++){
            soma += valores[i];
            System.out.println("Executando a soma " + Thread.currentThread().getName()
            + " somando o valor de " + valores[i] + " com o total de " + soma);
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return soma;
    }
}
