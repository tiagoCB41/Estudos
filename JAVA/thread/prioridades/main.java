package com.thread.prioridades;

public class main {


    public static void main(String[] args){
        MinhaThread thread1 = new MinhaThread("tiago1", 500);
        MinhaThread thread2 = new MinhaThread("tiago2", 500);
        MinhaThread thread3 = new MinhaThread("tiago3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        //VALORES TAMBÉM VÁLIDOS PARA SETPRIORITY (1 A 10)

    }
}
