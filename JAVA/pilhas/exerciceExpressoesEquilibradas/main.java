package com.pilhas.exerciceExpressoesEquilibradas;


public class main {
    public static void main(String[] args) throws Exception {






        System.out.println(verificarExpressao("()}"));
        System.out.println(verificarExpressao("({}"));
        System.out.println(verificarExpressao("(){}"));
        System.out.println(verificarExpressao("()"));
        System.out.println(verificarExpressao("([)]"));





    }
    final static String ABRE = "([{";
    final static String FECHA = ")]}";


    static boolean verificarExpressao(String x) throws Exception {
        Pilha<Character> pilha = new Pilha<Character>();
        for (int i=0; i<x.length(); i++){

            char simbolo, topo;
            simbolo = x.charAt(i);

            if (ABRE.indexOf(simbolo) > -1){
                pilha.empilhar(simbolo);
            }else if (FECHA.indexOf(simbolo) > -1){
                if (pilha.estaVazia()){
                return false;
                }else {
                    topo = pilha.desempilha();
                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                        return false;
                    }
                }
            }

        }

        return pilha.estaVazia();
    }

    }

