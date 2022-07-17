package com.introducao.aulajava.For;

import java.util.Scanner;

public class ForExercise {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o inicio da contagem:");
        int inicio = scan.nextInt();

        System.out.println("Digite o fim da contagem:");
        int fim = scan.nextInt();

     /* for (int i = inicio; i <= fim ; i++ ) {

            System.out.println(inicio);
            inicio++;
        } */

    for (int i = inicio, j = fim ; i <= fim ; i++, j-- ){

        System.out.println("Contagem crescente: " + i + "contagem decrescente:" + j);

        }

    }
}
