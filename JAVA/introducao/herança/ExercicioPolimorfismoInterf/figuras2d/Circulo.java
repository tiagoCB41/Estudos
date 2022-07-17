package com.introducao.herança.ExercicioPolimorfismoInterf.figuras2d;


public class Circulo extends Figuras2d {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void CalcularArea() {

        setArea((getRaio()*getRaio()) * 3.14);

    }

    @Override
    public String toString() {
        return super.toString() +"\nCirculo{" +
                "raio=" + raio + " área," + getArea() +
                '}';
    }
}
