package com.pilhas.estaVazia;

public class Pilha <T> extends EstruturaEstatica<T> {

    public Pilha () {
        super();
    }

    public Pilha (int capacidade) {
        super(capacidade);
    }

    public void empilhar(T elemento) throws Exception {
        super.adicionar(elemento);
    }
}
