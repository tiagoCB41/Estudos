package com.introducao.herança.ExercicioPolimorfismoInterf.figuras2d;


public class Quadrado extends Figuras2d {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void CalcularArea() {
        setArea(getLado()*4);
    }

    @Override
    public String toString() {
        return super.toString() +"\nQuadrado{" +
                "lado=" + lado +
                ", area=" + area +
                '}';
    }
}
