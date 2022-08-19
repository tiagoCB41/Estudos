package com.enumeradores.labsCalculadora;

public class main {
    public static void main(String[] args){

        double x = 3;
        double y = 6;

        for (Caculadora calc : Caculadora.values()){
            System.out.print(x);
            System.out.print(calc.getSimbolo());
            System.out.print(y);
            System.out.println(" = " + calc.executarOperacao(x,y));
        }

    }
}
