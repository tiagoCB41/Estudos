package com.introducao.POO.introdução.metodoStaticExerc;

import java.util.Scanner;

public class metodoStatic {
    static int age;
    static String conversor;
    static int resultado;
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos anos vc tem?");
        age = scan.nextInt();



        System.out.println("Deseja converter para: " +
                "\nSegundos: digite \"s\" " +
                "\nMinutos: digite \"min\"" +
                "\nDias: digite \"d\"");
        conversor = scan.next();

        conveter();





    }


    static void conveter(){
        if(conversor.equals("s")){
            resultado = converterParaSegundos();
            System.out.println("Resltado: \n" + resultado);
        }else if (conversor.equals("min")){
            resultado = converterParaMinuto();
            System.out.println("Resltado: \n" + resultado);
        }else if(conversor.equals("h")){
            resultado = converterParaHoras();
            System.out.println("Resltado: \n" + resultado);
        }else if(conversor.equals("d")){
            resultado = converterParaDias();
            System.out.println("Resltado: \n" + resultado);
        }else{
            System.out.println("digite uma unidade de conversão válida");
        }

    }

    static int converterParaSegundos(){
        return 60*60*24*365*age;
    }

    static int converterParaMinuto(){
        return 60*24*365*age;
    }

    static int converterParaHoras(){
        return 24*365*age;
    }

    static int converterParaDias(){
        return 365*age;
    }


}
