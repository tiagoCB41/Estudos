package com.pilhas.exerciceParImparEZero;

import com.pilhas.stack.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilhar(T elemento) throws Exception {
        super.adicionar(elemento);
    }

    public T topo(){
        if (estaVazia()){
            return null;
        }
        return super.elementos[tamanho()-1];
    }

    public T desempilha (){
        if (estaVazia()){
            return null;
        }
        T elemento = elementos[tamanho-1];
        //E SE QUISER APAGAR O ELEMENTO
        elementos[tamanho-1] = null;
        --tamanho;
        return elemento;

    }
}
