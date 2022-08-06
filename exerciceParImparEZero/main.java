package com.pilhas.exerciceParImparEZero;



import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        Pilha <Integer>par = new Pilha<Integer>();
        Pilha <Integer>impar = new Pilha<Integer>();


        Scanner scan = new Scanner(System.in);

        for (int i=1; i<=10; i++){
            System.out.println("Digite o " + i + "° numero.");
            int number = scan.nextInt();

            if (number%2 == 0 && !(number == 0) ){
                System.out.println("empilhando o seguinte numero na pilha de numeros pares:" + number);
                par.empilhar(number);

            }else if (number%2 == 1){
                System.out.println("empilhando o seguinte numero na pilha de numeros impares:" + number);
                impar.empilhar(number);
            }else if (number == 0){
                System.out.println("Numero 0, irá desempilhar um numero em nas pilhas impar e par.");
                if (!par.estaVazia()){
                    System.out.println("Desempilhando o seguinte numero da pilha par:" + par.desempilha());
                }else if (par.estaVazia()){
                    System.out.println("A pilha par está vazia. impossivel desempilhar");
                }
                if (!impar.estaVazia()){
                    System.out.println("Desempilhando o seguinte numero da pilha impar:" + impar.desempilha());
                }else if (impar.estaVazia()){
                    System.out.println("A pilha impar está vazia. impossivel desempilhar");
                }
                }
            }

        while(!impar.estaVazia()){
            System.out.println("desempilhando impar: " + impar.desempilha());
        }
        System.out.println("pilha impares desempilhada.");

        while(!par.estaVazia()){
            System.out.println("desempilhando par: " + impar.desempilha());
        }
        System.out.println("pilha pares desempilhada.");

    }

    }

