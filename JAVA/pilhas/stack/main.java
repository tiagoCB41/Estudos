package com.pilhas.stack;

import java.util.Stack;

public class main {
    public static void main (String[] args) throws Exception {

        Stack<Integer> pilha = new Stack<>();

        //CONSULTAR TAMANHO
        System.out.println(pilha.isEmpty());

        //ADICIONAR
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        //CONSULTAR TAMANHO
        System.out.println(pilha.isEmpty());

        //CONSULTAR TAMANHO
        System.out.println(pilha.size());

        //TOSTRING
        System.out.println(pilha);

        //ESPIAR ULTIMA POSIÇÃO
        System.out.println(pilha.peek());

        //DESEMPILHAR
        System.out.println(pilha.pop());

        System.out.println(pilha);

    }
}
