package com.introducao.aulajava.While_e_DoWhile;

import java.util.Scanner;

public class whilExercise {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor para começar a contagem");
        int i = scan.nextInt();


        System.out.println("Digite o valor máximo da contagem");
        int max = scan.nextInt();

        System.out.println("contando de: " + i + " até " + max);
        while(i <= max) {
            System.out.println(i);
            i++;
        }

        //VAI SAIR DO WHILE O VALOR DO MAX + 1

        //CONTAGEM ATÉ O DOBRO DO MAX USANDO O DO-WHILE

        do {
            System.out.println(i);
            i++;
        } while (i <= (max * 2));


        System.out.println(i);
    }

}
