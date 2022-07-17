package com.introducao.herança.exer1ContaBancária;

class  ContaPoupança extends Contabancária {

    static final double diaRendimento = 1.1;


    private static double getDiaRendimento() {
        return diaRendimento;
    }



    public static double calcularDiaRendimento(double x){

        return  x * getDiaRendimento();
    }

}
