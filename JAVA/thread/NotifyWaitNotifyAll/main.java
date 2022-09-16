package com.thread.NotifyWaitNotifyAll;

public class main {
    public static void main(String[] args){

        TiqueTaque tt = new TiqueTaque();
        ThreadTT tique = new ThreadTT("Tique", tt);
        ThreadTT taque = new ThreadTT("Taque", tt);

        try {
            tique.t.join();
            taque.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
