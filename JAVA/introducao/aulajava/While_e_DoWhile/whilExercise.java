package com.introducao.aulajava.While_e_DoWhile;

import java.util.Scanner;

public class whilExercise {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor para come�ar a contagem");
        int i = scan.nextInt();


        System.out.println("Digite o valor m�ximo da contagem");
        int max = scan.nextInt();

        System.out.println("contando de: " + i + " at� " + max);
        while(i <= max) {
            System.out.println(i);
            i++;
        }

        //VAI SAIR DO WHILE O VALOR DO MAX + 1

        //CONTAGEM AT� O DOBRO DO MAX USANDO O DO-WHILE

        do {
            System.out.println(i);
            i++;
        } while (i <= (max * 2));


        System.out.println(i);
    }

}
