package com.introducao.POO.introdução.metodosGetAndSet;

public class objCarro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    //MARCA
    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    //MODELO
    public String getModelo(){
        return this.marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    //NUMERO DE PASSAGEIROS
    public int getNumPassageiros(){
        return this.numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }

    //CAPACIDADE DE CONBUSTIVEL
    public double getCapCombustivel(){
        return this.capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel){
        this.capCombustivel = capCombustivel;
    }

    //CONSUMO DE COMBUSTIVEL
    public double getConsumoCombustivel(){
        return this.consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel){
        this.consumoCombustivel = consumoCombustivel;
    }
}
