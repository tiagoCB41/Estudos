package com.introducao.heran�a.exer1ContaBanc�ria;

public class ChequeEspecial extends Contabanc�ria{

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
