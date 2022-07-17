package com.introducao.tratamentoDeErros.tryEndcatch;

public class main {

    public static void main(String[] args){

        //*TRY = tente executar o código
        try{
            System.out.println("texto antes do erro(SERÁ IMPRESSO)");
            int[] vetor = new int[4];
            vetor[4] = 1;
            System.out.println("texto depois do erro(NÃO SERÁ IMPRESSO)");

        }//*CATCH = CÓDIGO DE RESOLUÇÃO DO ERRO
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Texto após o tratamento do erro");

        }


    }

}
