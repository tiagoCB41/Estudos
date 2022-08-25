package com.javaIntermediario.wrappers;

public class main {
    public static void main (String[] args){


        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000;
        float num5 = 3.5F;
        double num6 = 3.5555;
        boolean flag = true;
        char a = 'a';

        //CLASSES REPRESENTANDO OS TIPOS PRIMITIVOS

        //metodo dando erro

        /*Short num7 = new Short((short) 1);
        Byte num8 = new Byte((byte)10);
        Integer num9 = new Integer(100);
        Long num10 = new Long(100l);
        Float num11 = new Float(3.5f);
        Double num12 = new Double(3.555);
        Boolean flag2 = new Boolean(true);*/




        //metodo que deu certo
        Byte num8 = (byte) 10;
        Integer num9 = 100;
        Long num10 = 100l;
        Float num11 = 3.5f;
        Double num12 = 3.555;
        Boolean flag2 = Boolean.TRUE;

        Integer num13 = (int) num1;
        System.out.println(num9.byteValue());
        System.out.println(num10.intValue());


        //TRANSFORMANDO DE STRING PARA NUMERO
        int transform1 = Integer.parseInt("1000");
        System.out.println(transform1 + 1);

        double transform2 = Double.parseDouble("8.5");
        System.out.println(transform2+ 1.5);

    }
}
