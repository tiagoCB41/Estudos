package com.introducao.POO.introdução.metodoComRetorno;


public class carroMain {

    public static void main(String[] args) {

        carroReturn van = new carroReturn();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();

        System.out.println("Resultado do metodo obter autonomia: " + autonomia);
    }
}