package com.introducao.herança.exer1ContaBancária;

public class ChequeEspecial extends Contabancária{

    public static double limite = 1000;




    static double getLimite() {
        return limite;
    }

    private static void setLimite(double limiteV) {
        limite = limiteV;
    }

    public static void sacarChequeEspecial(double x){
       setLimite(getLimite()-x);
    }


}
