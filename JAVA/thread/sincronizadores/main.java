package com.thread.sincronizadores;

public class main {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5,6,7};

        ThreadSoma t1 = new ThreadSoma("#1" , array1);
        ThreadSoma t2 = new ThreadSoma("#2" , array1);
    }
}
