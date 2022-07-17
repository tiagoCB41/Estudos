package com.introducao.POO.introdução.recursividade;

public class recursividadeEX {
    static int test;
    public static void main(String[] args){

       test = fatorial(5);
       System.out.println(test);

    }
    static int fatorial (int num){

        if (num == 0){
            return 1;
        }
        return num * fatorial(num-1);
    }
}
