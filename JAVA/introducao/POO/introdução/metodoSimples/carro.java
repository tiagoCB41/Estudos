package com.introducao.POO.introdu��o.metodoSimples;

public class carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){

        System.out.println("A autonomia do carroReturn � " + capCombustivel * consumoCombustivel + "km");

    }
}
