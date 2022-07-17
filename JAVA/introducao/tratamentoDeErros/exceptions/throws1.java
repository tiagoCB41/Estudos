package com.introducao.tratamentoDeErros.exceptions;

import java.util.Scanner;

public class throws1 {
    public static void main(String[] args) {

        System.out.println("Entre com um número decimal");
        try {
            double num = leNumero();
            System.out.println("Você digitou " + num);
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }

    }

    //THROWS É USADO PARA DEFINIR UMA EXCEPTION, MAS O TRATAMENTO DO ERRO
    //SERÁ DEFINIDA APENAS QUANDO O METODO FOR UTILIZADO
    public static double leNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
