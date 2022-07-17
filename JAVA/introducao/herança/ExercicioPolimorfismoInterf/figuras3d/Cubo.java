package com.introducao.herança.ExercicioPolimorfismoInterf.figuras3d;

public class Cubo extends Figuras3d {

    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularVolume() {
        setVolume(getAltura()*getAltura() * getAltura());
    }

    @Override
    public String toString() {
        return super.toString() + "\nCubo{" +
                "altura=" + altura +
                ", volume=" + volume +
                '}';
    }
}
