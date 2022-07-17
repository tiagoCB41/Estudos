package com.introducao.tratamentoDeErros.criandoExceptions;

public class DivisaoNaoExata extends Exception{

    //EXEMPLO DE CLASSE PARA ERROS
    private int num;
    private int den;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    @Override
    //O QUE SERÁ IMPRESSO NO ERRO
    public String toString() {
        return "resultado da divisão de: " + num + "/" + den + " é não é inteiro";
    }

    //PEGANDO OS ITENS QUE SERÃO USADOS NO ERRO
    public DivisaoNaoExata(int num, int den) {
        super();
        this.num = num;
        this.den = den;
    }
}
