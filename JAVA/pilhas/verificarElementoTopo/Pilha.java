package com.pilhas.verificarElementoTopo;

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

    public T topo(){
        if (estaVazia()){
            return null;
        }
        return super.elementos[tamanho()-1];
    }
}
