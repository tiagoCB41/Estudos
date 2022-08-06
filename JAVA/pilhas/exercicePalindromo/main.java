package com.pilhas.exercicePalindromo;



import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        Pilha<Character> pilha = new Pilha<Character>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra para verificar se ela � um Pal�mdromo.");

        String word = scan.nextLine();

        for (int i=0; i<word.length() ; i++){
            pilha.empilhar(word.charAt(i));
        }

        String wordCompare = "";

        while(!pilha.estaVazia()) {
            wordCompare += pilha.desempilha();
        }

        System.out.println("Palavra digitada ao contr�rio: " + wordCompare);

        System.out.println("A palavra � um pal�mdromo? " + word.equals(wordCompare));

    }
    }

