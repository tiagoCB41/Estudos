package com.introducao.herança.ExercicioPolimorfismoInterf.figuras3d;

public class Piramide extends Figuras3d {

    private double areaBase;
    private double altura;

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularVolume() {
        setVolume((getAreaBase()*getAltura())/3);
    }

    @Override
    public String toString() {
        return super.toString() +"\nPiramide{" +
                "areaBase=" + areaBase +
                ", altura=" + altura +
                ", volume=" + volume +
                '}';
    }
}
