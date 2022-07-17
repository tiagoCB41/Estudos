package com.introducao.herança.ExercicioPolimorfismoInterf.figuras2d;


public class Triangulo extends Figuras2d {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void CalcularArea() {
        setArea((getBase()*altura)/2);
    }

    @Override
    public String toString() {
        return super.toString() +"\nTriangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + area +
                '}';
    }
}
