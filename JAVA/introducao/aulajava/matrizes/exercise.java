package com.introducao.aulajava.matrizes;

import java.util.Random;

public class exercise {

    public static void main (String[] args){

        int[][] matriz = new int[4][4];

        //CLASSE PARA DEFINIR VALORES ALEATÓRIOS
        Random numerosAleatorios = new Random();

        int maior = 0;
        int col = 0;
        int linha = 0;

        //PRIMEIRO FOR "LOOPEAR" AS LINHAS
        for (int i = 0 ; i< matriz.length; i++){
            //SEGUNDO FOR "LOOPEAR" AS COLUNAS E DEFINIR OS VALORES ALEATÓRIOS
            for(int j = 0 ; j < matriz.length ; j++){
                //RODAR A CLASSE RANDOM ATRIBUINDO OS VALORES NA MATRIZ
                matriz[i][j] = numerosAleatorios.nextInt(100);
                System.out.print(matriz[i][j] + " ");
                // ESSE IF VAI ATRIBUINDO OS VALORES NA VARIAVEL "MAIOR" TODA VEZ
                // QUE UM VALOR NA MATRIZ FOR MAIOR QUE O ANTERIOR
                if (matriz[i][j] > maior) {

                    maior = matriz[i][j];
                    col = j;
                    linha = i;
                }
            }
            System.out.println();
        }
            System.out.println("MAIOR:" + maior);
            System.out.println("LINHA:" + linha);
            System.out.println("COLUNA:" + col);
    }

}
