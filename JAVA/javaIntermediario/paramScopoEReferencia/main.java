package com.javaIntermediario.paramScopoEReferencia;

public class main {
    public static void main(String[] args){

        int valor = 10;
        Contato contato = new Contato("tiago", "4004");

        System.out.println("****VALORES ORIGINAIS");

        System.out.println(valor);
        System.out.println(contato);

        testePassagemValorReferencia(valor,contato);


        System.out.println("****EXEMPLO 1");

        //EXEMPLO 1 VAI ALTERAR O VALOR DO PONTEIRO DENTRO DO METODO
        System.out.println(valor);
        System.out.println(contato);



        testePassagemValorReferencia2(valor,contato);

        System.out.println("****EXEMPLO 2");

        //O EXEMPLO DOIS VAI ALTERAR O OBJETO SEM ALTERAR O PONTEIRO

        System.out.println(valor);
        System.out.println(contato);




        System.out.println("****EXEMPLO 3");
        //O EXEMPLO 3 VAI ALTERAR O PONTEIRO DENTRO DO MAIN,
        //PORTANTO CONSEGUIRÁ SER USADO NOVAMENTE


        contato = testePassagemValorReferencia3(valor, contato);


        System.out.println(valor);
        System.out.println(contato);






    }

    private static void testePassagemValorReferencia(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;
        contato = new Contato("tiago2","4003");
    }

    private static void testePassagemValorReferencia2(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;
        contato.setNome(contato.getNome() + novoValor);
    }

    ////////CRIADO POR MIM

    private static Contato testePassagemValorReferencia3(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;
        return new Contato("teste","4000");

    }
}
