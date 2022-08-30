package com.javaIntermediario.varargs;

public class main {
    public static void main(String[] args){

        //SOMANDO 2 NUMEROS COM METODO NORMAL (TAMANHO DETERMINADO PELO METODO)
        System.out.println(soma(1,2));
        //SOMANDO NUMEROS DE UM VETOR (TAMANHO INDETERMINADO)
        int [] vetor = {1,2,3,4};
        System.out.println(soma(vetor));
        //SOMANDO COM VAR ARGS
        System.out.println(soma(1,2,3,4,5,6,7,8));



    }
    static int soma(int a, int b){
        return a+b;
    }

    static int soma(int[] vet){
        int total = 0;
        for (int i=0; i< vet.length; i++){
            total += vet[i];
        }
        return total;
    }

    static int soma(Integer... x){
        int total = 0;
        for (int i=0; i< x.length; i++){
            total += x[i];
        }
        return total;
    }

}
