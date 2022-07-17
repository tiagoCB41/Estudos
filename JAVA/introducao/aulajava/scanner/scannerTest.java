package com.introducao.aulajava.scanner;

import java.util.Scanner;

public class scannerTest {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo.");

        String nomeCompleto = scan.nextLine();

        System.out.println("Digite sua idade: ");

        int age = scan.nextInt();

        System.out.println ("Seu nome completo é: " + nomeCompleto + "\nSua idade é: " + age  );

    }

}
