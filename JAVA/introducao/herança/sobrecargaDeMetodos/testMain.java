package com.introducao.heran�a.sobrecargaDeMetodos;

public class testMain {

    public static void main (String[] args){

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("rua 1");
        aluno.setEndereco("rua 2");
        professor.setEndereco("rua 3");


        System.out.println(pessoa.obterEtiquetaEndere�o());
        System.out.println(aluno.obterEtiquetaEndere�o());
        System.out.println(professor.obterEtiquetaEndere�o());







    }
}
