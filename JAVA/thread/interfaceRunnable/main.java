package com.thread.interfaceRunnable;

public class main {

    //ENTRE EXTENDER A CLASSE THREAD OU IMPLEMENTAR A CLASSE RUNNABLE
    //A MELHOR OP��O VAI DEPENDER DA NECESSIDADE
    //LEVANDO EM CONTA QUE UMA CLASSE S� PODE EXTENDER UMA CLASSE M�E
    //CASO SEJA NECESS�RIO EXTENDER ALGUMA OUTRA CLASSE, SE TORNA VI�VEL
    //TER QUE IMPLEMENTAR A INTERFACE RUNNABLE
    public static void main(String[] args){
        MinhaThread thread1 = new MinhaThread("tiago1", 1000);
        MinhaThread thread2 = new MinhaThread("tiago2", 500);
        MinhaThread thread3 = new MinhaThread("tiago3", 800);


    }
}
