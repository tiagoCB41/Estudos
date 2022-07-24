package com.estruturaDeDados.generealizarVetor;

public class Vetor {

    private int tamanho;
    //DECLARANDO COMO OBJECT, O VETOR IR� RECEBER TODOS OS TIPOS PRIMITIVOS
    //E AT� MESMO RECEBER OUTRO OBJETO DE CLASSE
    private Object [] elementos;

    public Vetor(int capacidade) {
        this.elementos = new Object [capacidade];
    }


    public void adicionar(Object elemento) throws Exception {
        aumentarCapacidade();
        if (tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Lista j� est� cheia, n�o � possivel adicinonar mais elementos");
        }
    }

    //EXEMPLO CRIADO POR MIM //E COMPATIVEL COM O EXEMPLO MOSTRADO NA AULA
    //********ADICIONANDO O METODO AUMENTAR CAPACIDADE
    public void adicionar(Object elemento,int posicao){
        aumentarCapacidade();
        if (!(posicao >= 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posi��o inv�lida");
        } else {

            for (int i = tamanho; i > posicao; i--) {
                this.elementos[i] = this.elementos[i - 1];
            }
            this.elementos[posicao] = elemento;
            tamanho++;
        }
    }



    //O METODO ABAIXO S� SER� EXECUTADO QUANDO
    //O VETOR ESTIVER CHEIO(tamanho == elementos.length)
    public void aumentarCapacidade(){
        if (this.tamanho == elementos.length){
            Object[] elementosNovos = new Object[elementos.length * 2];
            for (int i=0; i < this.tamanho; i ++){
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
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

    //REMOVER PELA POSI��O
    public void removerPos(int posicao){
        if (!(posicao > 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posi��o inv�lida");
        }
        for (int i=posicao; i<tamanho; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }

    public int getTamanho() {
        return tamanho;
    }

    //REMOVER PELA STRING
    public void removerString (String x){
        int posicao = obterPosi��o(x);
        if (!(posicao > 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posi��o inv�lida");
        }
        for (int i=posicao; i<tamanho; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }

    //OBTER ELEMENTO DA POSI��O X
    public Object busca (int posicao){
        if (!(posicao > 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posi��o inv�lida");
        }
        return elementos[posicao];
    }

    //OBTER A POSI��O DO ELEMENTO X
    public int obterPosi��o (String x) {
        for (int i=0; i< tamanho ;i++){
            if (elementos[i].equals(x)){
                return i;
            }
        }
        return -1;
    }


}
