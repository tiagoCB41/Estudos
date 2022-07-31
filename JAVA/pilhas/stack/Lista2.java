package com.pilhas.stack;

public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2(int capacidade) {
        super(capacidade);
    }

    public Lista2() {
        super();
    }

    public void adicionar (T elemento) throws Exception {
        super.adicionar(elemento);
    }

    public void adicionar (T elemento, int posicao ){
        super.adicionar(elemento, posicao);
    }
}
