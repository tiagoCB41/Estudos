package com.introducao.tratamentoDeErros.tryEndcatch;

public class main {

    public static void main(String[] args){

        //*TRY = tente executar o c�digo
        try{
            System.out.println("texto antes do erro(SER� IMPRESSO)");
            int[] vetor = new int[4];
            vetor[4] = 1;
            System.out.println("texto depois do erro(N�O SER� IMPRESSO)");

        }//*CATCH = C�DIGO DE RESOLU��O DO ERRO
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Texto ap�s o tratamento do erro");

        }


    }

}
