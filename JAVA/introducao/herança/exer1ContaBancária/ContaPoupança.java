package com.introducao.heran�a.exer1ContaBanc�ria;

class  ContaPoupan�a extends Contabanc�ria {

    static final double diaRendimento = 1.1;


    private static double getDiaRendimento() {
        return diaRendimento;
    }



    public static double calcularDiaRendimento(double x){

        return  x * getDiaRendimento();
    }

}
