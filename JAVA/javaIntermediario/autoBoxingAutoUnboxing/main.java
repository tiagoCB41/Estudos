package com.javaIntermediario.autoBoxingAutoUnboxing;

public class main {
    public static void main(String[] args){

        Short num1 = (short) 1;
        Byte num2 = (byte) 1;
        Integer num3 = 100;
        Long num4 = 10000l;
        Double num5 = 3.5555;
        Boolean flag2 = Boolean.TRUE;
        Character b = 'b';

        //TRANSFORMANDO UM VALOR DE UMA CLASS EM UM TIPO PRIMITIVO
        //AUTO UN-BOXING
        int num6 = num3;
        System.out.println(num6 == num3);

        //AUTO-BOXING EM EXPRESSÕES
        num3++;
        System.out.println(num3);

        //MAL USO
        //PARA MANIPULAR DADOS É MELHOR TRABALHAR COM TIPOS PRIMITIVOS, PARA
        //SOMENTE DEPOIS FAZER AUTO BOXING PARA UMA CLASSE WRAPPER.
        Double nota1 , nota2 ,nota3;

        nota1 = 6.7;
        nota2 = 8.5;
        nota3 = 4.7;

        Double media = (nota1 * nota2 * nota3)/3;

        System.out.println(media);




    }
}
