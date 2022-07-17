package com.introducao.POO.introdução.metodoSimples;

public class mainCarro {

    public static void main(String[] args) {

        carro van = new carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();
    }
}
