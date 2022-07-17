package com.introducao.herança.UpcastingEDowncasting;

public class main {
    public static void main (String[] args){

        //UPCASTING
        Aluno aluno1 = new Aluno();
        aluno1.setCpf("123test");
        //Pessoa pessoa1 = aluno1;
        //OU
        Pessoa pessoa1 = (Pessoa) aluno1;
        System.out.println(pessoa1.getCpf());


    }
}
