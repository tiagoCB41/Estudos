package com.introducao.tratamentoDeErros.criandoExceptions;

public class main {public static void main(String[] args){

    int [] numeros = {2,4,7,8,10};
    int [] denomin = {2,0,2,0};

    for (int i=0 ; i < numeros.length ; i++){
        try{
            if (numeros[i] % 2 != 0){
                throw new DivisaoNaoExata(numeros[i], denomin[i]);
            }
            System.out.println("Resultado da multiplicação 1" + (numeros[i] / denomin[i]));
        }
        catch (DivisaoNaoExata e){
            //DA SYSTEM OUT IMPRIMINDO QUAL FOI O ERRO
            System.out.println(e.getMessage());

            //MOSTRA O ERRO COMPLETO, COM TIPO DE ERRO E LINHA QUE ESTÁ O ERRO
            e.printStackTrace();
        }catch (ArithmeticException e){

            //DA SYSTEM OUT IMPRIMINDO QUAL FOI O ERRO
            System.out.println(e.getMessage());

            //MOSTRA O ERRO COMPLETO, COM TIPO DE ERRO E LINHA QUE ESTÁ O ERRO
            e.printStackTrace();
        }

    }

}
}
