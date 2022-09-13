package com.thread.intro;

public class main {
    public static void main(String[] args){

        MinhaThread thread = new MinhaThread("thread #1", 500);

        MinhaThread thread2 = new MinhaThread("thread #2",2000);

        //SE CHAMAR COM O METODO THREAD, SÃO EXECUTADOS SIMULTANEAMENTE
        System.out.println("**metodo thread");
        thread.start();
        thread2.start();

        //CASO CONTRÁRIO (metodo run) SERÁ EXECUTADO UM DE CADA VEZ


}}
