package com.pilhas.introducao;

public class EstruturaEstatica <T> {

    private int tamanho;

    private T [] elementos;

    public int tamanho(){
        return this.tamanho;
    }

    public EstruturaEstatica(int capacidade) {
        //ATRIBUINDO O TIPO GENERICO DA CLASSE AO VETOR ELEMENTOS
        this.elementos = (T[]) new Object [capacidade];
    }

    public EstruturaEstatica() {
        this.elementos = (T[]) new Object [10];
    }

    protected void adicionar(T elemento) throws Exception {
        aumentarCapacidade();
        if (tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Lista já está cheia, não é possivel adicinonar mais elementos");
        }
    }


    protected void adicionar(T elemento,int posicao){
        aumentarCapacidade();
        if (!(posicao >= 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        } else {

            for (int i = tamanho; i > posicao; i--) {
                this.elementos[i] = this.elementos[i - 1];
            }
            this.elementos[posicao] = elemento;
            tamanho++;
        }
    }




    public void aumentarCapacidade(){
        if (this.tamanho == elementos.length){
            T[] elementosNovos = (T[])new Object[elementos.length * 2];
            for (int i=0; i < this.tamanho; i ++){
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }



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
}
