package com.introducao.aulajava.IfElse;

import java.util.Scanner;

public class ifElse {

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual sua idade?");

        int age = scan.nextInt();

        if (age >= 18) {

            System.out.println("Voc� � maior de idade.");
        } else {

            System.out.println("Voc� ainda n�o � maior de idade, volte daqui a " + (18 - age) + " anos.");
        }

    }

}
