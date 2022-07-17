package com.introducao.POO.introdução.construtoresO;

public class objCarro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public objCarro(){ }

    public objCarro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
        System.out.println("passou pelo construtor geral");
    }


    public objCarro (String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("passou pelo primeiro construtor");

    }


    public objCarro (String marca, String modelo){
        this(marca, modelo, 10);
        System.out.println("passou pelo segundo construtor");



    }







    void exibirAutonomia(){

        System.out.println("metodo exibirAutonomia foi iniciado:  " + capCombustivel * consumoCombustivel + "km");

    }

    double obterAutonomia() {

        System.out.println("Metodo obterAutonomia foi chamado");

        return capCombustivel * consumoCombustivel;

    }

}
