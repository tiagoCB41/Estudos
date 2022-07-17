package com.introducao.aulajava.Arrays;

public class Arrays {

    public static void main (String[] args){

        double[] temperaturas = new double[365];

        temperaturas[0] = 31.5;
        temperaturas[1] = 29.6;
        temperaturas[2] = 30;
        temperaturas[3] = 31.8;
        temperaturas[4] = 32.3;

        //IMPRIMIR UMA POSIÇÃO DO ARRAY
        System.out.println("o valor da temperatura do dia 1 é: " + temperaturas[0]);

        //VER QUANTAS POSIÇÕES O ARRAY TEM
        System.out.println( "o array tem: " + temperaturas.length + " posições");

        //IMPRIMIR TODOS OS VALORES (PRECISA SER FEITO POR LOOP)

        for (int i = 0 ; i < temperaturas.length ; i++) {
            if (temperaturas[i] == 0) {
                continue;
            }
            System.out.println("o valor da temperatura do dia " + (i+1) + " é " + temperaturas[i]);
        }


    }

}
