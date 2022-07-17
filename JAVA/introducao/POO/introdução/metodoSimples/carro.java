package com.introducao.POO.introdução.metodoSimples;

public class carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){

        System.out.println("A autonomia do carroReturn é " + capCombustivel * consumoCombustivel + "km");

    }
}
