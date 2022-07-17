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
    //O QUE SER� IMPRESSO NO ERRO
    public String toString() {
        return "resultado da divis�o de: " + num + "/" + den + " � n�o � inteiro";
    }

    //PEGANDO OS ITENS QUE SER�O USADOS NO ERRO
    public DivisaoNaoExata(int num, int den) {
        super();
        this.num = num;
        this.den = den;
    }
}
