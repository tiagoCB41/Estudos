package com.javaIntermediario.printf;

public class main {
    public static void main(String[] args){

        //IMPRIME STRING DA FORMA QUE FOI DIGITADI
        System.out.printf("%s", "Olá, mundo");
        System.out.println();

        //IMPRIME STRING EM CAIXA ALTA
        System.out.printf("%S", "Olá, mundo");
        System.out.println();

        //IMPRIME CHAR DA FORMA QUE FOI DIGITADO
        System.out.printf("%c", 'c');
        System.out.println();

        //IMPRIME O CHAR EM CAIXA ALTA
        System.out.printf("%C", 'c');
        System.out.println();

        //PULAR LINHA COM PRINTF
        System.out.printf("%n");

        //IMPRIMIR NUMERO INTEIRO
        int valor = 123456789;
        System.out.printf("%d", valor);
        System.out.println();

        //IMPRIMIR FLOAT
        double pontoFlutuante = 3.146;
        System.out.printf("%f", pontoFlutuante);
        System.out.println();

        //**DEFINIR TAMANHO A SER IMPRESSO
        String ola = "ola, mundo";

        //ALINHAR A ESQUERDA
        System.out.printf("%20s", ola);
        System.out.println();


        //ALINHAR A DIREITA
        System.out.printf("%-20s", ola);
        System.out.println();


        //DEFINIR SE UM NUMERO É POSITIVO OU NEGATIVO(imprime o + ou - antes do valor)
        System.out.printf("%+d", valor);
        System.out.println();

        //DEFINIR A QUANTIDADE DE CARACTERES DO NUMERO

        System.out.printf("%015d", valor);
        System.out.println();

        //SEPARAR OS MILHARES

        System.out.printf("%,d", valor);
        System.out.println();

        //IMPRIME APENAS O - , CASO SEJA POSITIVO NÃO IRÁ IMPRIMIR NADA.

        System.out.printf("% d", valor - (valor*2));
        System.out.println();

        //DEFINIR CASAS DECIMAIS DO FLOAT(arredonda para mais)

        System.out.printf("%.2f", pontoFlutuante);
        System.out.println();

        //VALOR MONÉTARIO, REAIS.

        System.out.printf("R$%10.2f", pontoFlutuante);
        System.out.println();

        //teste metodo

        teste();
    }

    public static void teste (){
        double[] precos = {102,300.13,31.40,30004.3,302.12};
        for (int i = 0; i < precos.length ; i++){
            System.out.printf("%s %02d total de: R$%,10.2f %n" ,"item",i+1, precos[i] );
        }
    }
}
