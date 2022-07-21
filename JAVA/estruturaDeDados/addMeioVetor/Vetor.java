package com.estruturaDeDados.addMeioVetor;

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

    public void adicionar(String elemento) throws Exception {

        if (tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Lista já está cheia, não é possivel adicinonar mais elementos");
        }
    }

    //EXEMPLO CRIADO POR MIM //E COMPATIVEL COM O EXEMPLO MOSTRADO NA AULA
    public void adicionar(String elemento,int posicao){

        if (!(posicao > 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        } else {

            for (int i = tamanho; i > posicao; i--) {
                this.elementos[i] = this.elementos[i - 1];
            }
            this.elementos[posicao] = elemento;
            tamanho++;
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

    //OBTER ELEMENTO DA POSIÇÃO X
    public String busca (int posicao){
        if (!(posicao > 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao -1];
    }

    //OBTER A POSIÇÃO DO ELEMENTO X
    public int obterPosição (String x) {
        for (int i=0; i< tamanho ;i++){
            if (elementos[i].equalsIgnoreCase(x)){
                return i;
            }
        }
        return -1;
    }


}
