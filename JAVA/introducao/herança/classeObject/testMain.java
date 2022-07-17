package com.introducao.herança.classeObject;

public class testMain {

    public static void main(String[] args){

        double [] notasDoMain = {8 , 9 , 8};


        Aluno tiago = new Aluno();

        tiago.setCurso("Sistemas de informação");
        tiago.setNotas(notasDoMain);

        System.out.println(tiago.toString());



        ////////////////////

        String comparate1 = "tiago";
        String comparate2 = "TIAGO";

        //ESSA PRIMEIRA FORMA DE COMPARAÇÃO DE STRINGS NÃO É VIÁVEL
        //ANOTADO APENAS PARA MOSTRAR QUE É POSSIVEL
        //System.out.println(comparate1 == comparate2);


        System.out.println(comparate1.equals(comparate2));


        System.out.println(comparate1.equalsIgnoreCase(comparate2));


        ////////////////////////////////////////////////


        Aluno tiago2 = new Aluno();
        tiago2.setCurso("Sistemas de informação");
        tiago2.setNotas(notasDoMain);

        System.out.println(tiago.equals(tiago2));




    }
}
