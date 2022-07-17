package com.introducao.POO.introdução.construtoresO;

public class carroMain {

    public static void main(String[] args){

        objCarro van = new objCarro("fiat","ducato");
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
    }
}

