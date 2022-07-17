package com.introducao.tratamentoDeErros.multiplosCatch;

public class multiplosCatch1 {
    public static void main(String[] args){

        int [] numeros = {2,4,6,8,10};
        int [] denomin = {2,0,2,0};

        for (int i=0 ; i < numeros.length ; i++){
            try{
                System.out.println("Resultado da multiplicação 1" + (numeros[i] / denomin[i]));
            }
            catch (Throwable e){
                System.out.println("Throwable captura todos os erros");
            }

        }

    }
}
