package com.introducao.heran�a.intro;

public class testeMain {
    public static void main(String[] args){

        Aluno tiago = new Aluno();

        //Cpf � uma vari�vel da super class pessoa
        tiago.setCpf("testcpf");

        System.out.println(tiago.getCpf());



    }
}
