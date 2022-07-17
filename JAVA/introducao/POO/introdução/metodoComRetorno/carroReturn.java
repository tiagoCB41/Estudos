package com.introducao.POO.introdução.metodoComRetorno;

public class carroReturn {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){

        System.out.println("metodo exibirAutonomia foi iniciado:  " + capCombustivel * consumoCombustivel + "km");

    }

    double obterAutonomia() {

        System.out.println("Metodo obterAutonomia foi chamado");

        return capCombustivel * consumoCombustivel;

    }
}
