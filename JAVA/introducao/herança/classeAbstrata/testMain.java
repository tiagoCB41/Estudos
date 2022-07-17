package com.introducao.herança.classeAbstrata;

public class testMain {

    public static void main (String[] args){

        //Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        //pessoa.setEndereco("rua 1");
        aluno.setEndereco("rua 2");
        professor.setEndereco("rua 3");


        //System.out.println(pessoa.obterEtiquetaEndereço());
        aluno.imprimirEtiquetaEndereço();
        professor.imprimirEtiquetaEndereço();







    }
}
