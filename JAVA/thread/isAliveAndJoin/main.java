package com.thread.isAliveAndJoin;

public class main {
    public static void main(String[] args){
        MinhaThread thread1 = new MinhaThread("#1" , 900);
        MinhaThread thread2 = new MinhaThread("#2" , 500);
        MinhaThread thread3 = new MinhaThread("#3" , 1500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        while(t1.isAlive() || t2.isAlive() || t3.isAlive()){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //*********OU*************
        //O JOIN VAI ESPERAR A TREAD ACABAR PARA INICIAR A PRÓXIMA TAREFA
        /*
        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){
        e.printStackTrace();
        }
        */


        System.out.println("o programa foi fnalizado");

    }
}
