package com.enumeradores.labsCalculadora;

public enum Caculadora {

    SOMAR("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    },SUBTRAIR("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    },MULTIPLICAR("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    },DIVIDIR("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    private String simbolo;

    Caculadora(String simbolo){
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public abstract double executarOperacao(double x, double y);

}
