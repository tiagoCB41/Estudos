package com.filas.filaComPrioridade;

public class Filas<T>{
    protected T [] elementos;
    protected int tamanho;


    public Filas(int capacidade) {
        this.elementos = (T[]) new Object [capacidade];
    }

    public Filas() {
        this.elementos = (T[]) new Object [10];
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void enfileirar(T elemento){
        aumentarCapacidade();
        if (tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
        }
    }

    private void aumentarCapacidade() {
        if (tamanho == elementos.length){
            T[] elementosSub = (T[]) new Object [elementos.length*2];
            for (int i=0; i<tamanho; i++){
                elementosSub[i] = elementos[i];
            }
            elementos = elementosSub;
        }
    }

    public T desenfileirar() {
        if (estaVazia()){
            return null;
        }

        T value = elementos[0];
        for (int i=0; i<tamanho; i++){
        elementos[i] = elementos[i+1];
        }
        tamanho--;
        return value;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public T espiar () {
        return elementos[0];
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0 ; i < tamanho; i++){
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
}
