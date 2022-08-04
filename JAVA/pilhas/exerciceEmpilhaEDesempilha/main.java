package com.pilhas.exerciceEmpilhaEDesempilha;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) throws Exception {

        Pilha<Integer> pilha = new Pilha<Integer>();

        int[] numbers = new int[10];
        Scanner scan = new Scanner(System.in);

        for (int i=1; i<=10; i++){
            System.out.println("Digite o " + i + "° numero.");
            int number = scan.nextInt();
            numbers[i-1] = number;
        }

        for (int i=0; i<10; i++){
            if (numbers[i]%2 == 0){
                pilha.empilhar(numbers[i]);
                System.out.println("empilhando: " + numbers[i]);
            }else {
                if (pilha.estaVazia()){System.out.println("Ultimo numero verificado é impar\nmas é mpossivel desempilhar, pois a pilha já está vazia");
                }else {
                    System.out.println( "Como o ultimo numero verificado: " + numbers[i] +  " é impar" + "\nestamos desempilhando o ultimo valor " + pilha.topo() + " da pilha.");
                    pilha.desempilha();
                }
            }
        }

        System.out.println("*desempilhando o que restou da pilha após a operação*");


        while(!pilha.estaVazia()){
            System.out.println("desempilhando: " + pilha.desempilha());
        }

        System.out.println("Pilha vazia");

    }
}
