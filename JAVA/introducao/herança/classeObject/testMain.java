package com.introducao.heran�a.classeObject;

public class testMain {

    public static void main(String[] args){

        double [] notasDoMain = {8 , 9 , 8};


        Aluno tiago = new Aluno();

        tiago.setCurso("Sistemas de informa��o");
        tiago.setNotas(notasDoMain);

        System.out.println(tiago.toString());



        ////////////////////

        String comparate1 = "tiago";
        String comparate2 = "TIAGO";

        //ESSA PRIMEIRA FORMA DE COMPARA��O DE STRINGS N�O � VI�VEL
        //ANOTADO APENAS PARA MOSTRAR QUE � POSSIVEL
        //System.out.println(comparate1 == comparate2);


        System.out.println(comparate1.equals(comparate2));


        System.out.println(comparate1.equalsIgnoreCase(comparate2));


        ////////////////////////////////////////////////


        Aluno tiago2 = new Aluno();
        tiago2.setCurso("Sistemas de informa��o");
        tiago2.setNotas(notasDoMain);

        System.out.println(tiago.equals(tiago2));




    }
}
