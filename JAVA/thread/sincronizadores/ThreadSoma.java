package com.thread.sincronizadores;



public class ThreadSoma implements Runnable{

    private String nome;
    private int [] numbers;
    private static Calculadora calc = new Calculadora();

    public ThreadSoma(String nome, int[] numbers) {
        this.nome = nome;
        this.numbers = numbers;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println(nome + " iniciada");
        int soma = calc.somar(this.numbers);
        System.out.println("O resultado da soma é: " + soma);
        System.out.println(nome + " terminada");
    }
}
