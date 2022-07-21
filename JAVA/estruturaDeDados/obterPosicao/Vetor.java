package com.estruturaDeDados.obterPosicao;

public class Vetor {

    private int tamanho;
    private String[] elementos;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }

    //N�O � EFICIENTE, POIS VAI SEMPRE LOOPEAR DO INICIO DO VETOR
    /*public void adicionarFinal (String elemento){
        for (int i=0; i < elementos.length; i++){
            if ( this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/


    //ESSA SEGUNDA FORMA, LOOPEIA DA ULTIMA POSI��O ADICIONADA
    //FOI ADICIONADO UMA NOVA VARIAVEL DO TIPO INT TAMANHO

    public void adicionarFinal(String elemento) throws Exception {

        if (tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Lista j� est� cheia, n�o � possivel adicinonar mais elementos");
        }
    }


    //EXEMPLO MOSTRADO NA AULA
    public String toString() {

        StringBuilder s  = new StringBuilder();
        s.append("[");
        for (int i=0; i < tamanho-1; i++){
            s.append(elementos[i]);
            s.append(",");
        }
        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");

        return s.toString();
    }

    //EXEMPLO CRIADO POR MIM
    public String getElementosTeste() {

        StringBuilder s  = new StringBuilder();
        s.append("[");
        for (int i=0; i < tamanho; i++){
            if (i == tamanho-1){
                s.append(elementos[i]);
            }else {
                s.append(elementos[i]);
                s.append(",");
            }

        }
        s.append("]");

        return s.toString();
    }

    //OBTER ELEMENTO DA POSI��O X
    public String busca (int posi��o){
        if (!(posi��o > 0 && posi��o <tamanho)){
            throw new IllegalArgumentException("Posi��o inv�lida");
        }
        return elementos[posi��o-1];
    }

    //OBTER A POSI��O DO ELEMENTO X
    public int obterPosi��o (String x) {
        for (int i=0; i< tamanho ;i++){
            if (elementos[i].equalsIgnoreCase(x)){
                return i;
            }
        }
        return -1;
    }


}
