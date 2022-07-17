package com.introducao.tratamentoDeErros.exceptions;

public class exceptionsStacktrace {
    public static void main(String[] args){

        int [] numeros = {2,4,6,8,10};
        int [] denomin = {2,0,2,0};

        for (int i=0 ; i < numeros.length ; i++){
            try{
                System.out.println("Resultado da multiplicação 1" + (numeros[i] / denomin[i]));
            }
            catch (Exception e){
            //DA SYSTEM OUT IMPRIMINDO QUAL FOI O ERRO
                System.out.println(e.getMessage());

            //MOSTRA O ERRO COMPLETO, COM TIPO DE ERRO E LINHA QUE ESTÁ O ERRO
                e.printStackTrace();
            }

        }

    }
}
