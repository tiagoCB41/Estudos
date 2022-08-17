package com.enumeradores.construtores;

public class main {
    public static void main(String[] args){


        //DECLARANDO UMA VARIAVEL ENUM E IMPRIMINDO O GET VALOR
        DiaSemana dia = DiaSemana.QUARTA;

        System.out.println(dia + " " + dia.getValor());


        //ATRIBUINDO UMA VARIAVEL ENUM EM UMA CLASSE
        Data data = new Data(17,8,2022,dia);

        System.out.println(data);


        //ENUM DENTRO DA CLASSE INSTANCIADA
        Pessoa tiago = new Pessoa();
        tiago.setNome("tiago");
        tiago.setGenero((Pessoa.Genero.MASCULINO));

        System.out.println(tiago);



    }
}
