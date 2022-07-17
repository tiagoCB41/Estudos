package com.estruturaDeDados.addFinalVetor;

import java.util.Arrays;

public class Vetor {

    private int tamanho;
    private String[] elementos;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }

    //NÃO É EFICIENTE, POIS VAI SEMPRE LOOPEAR DO INICIO DO VETOR
    /*public void adicionarFinal (String elemento){
        for (int i=0; i < elementos.length; i++){
            if ( this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/


    //ESSA SEGUNDA FORMA, LOOPEIA DA ULTIMA POSIÇÃO ADICIONADA
    //FOI ADICIONADO UMA NOVA VARIAVEL DO TIPO INT TAMANHO

    public void adicionarFinal(String elemento) throws Exception {

        if (tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Lista já está cheia, não é possivel adicinonar mais elementos");
        }
    }


    public String getElementos() {
        return Arrays.toString(elementos);
    }
}
