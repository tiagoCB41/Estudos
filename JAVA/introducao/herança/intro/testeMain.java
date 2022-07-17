package com.introducao.herança.intro;

public class testeMain {
    public static void main(String[] args){

        Aluno tiago = new Aluno();

        //Cpf é uma variável da super class pessoa
        tiago.setCpf("testcpf");

        System.out.println(tiago.getCpf());



    }
}
