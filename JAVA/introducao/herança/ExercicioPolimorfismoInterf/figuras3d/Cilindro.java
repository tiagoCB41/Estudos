package com.introducao.herança.ExercicioPolimorfismoInterf.figuras3d;

public class Cilindro extends Figuras3d {

    private double raioDaBase;
    private double altura;

    public double getRaioDaBase() {
        return raioDaBase;
    }

    public void setRaioDaBase(double raioDaBase) {
        this.raioDaBase = raioDaBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularVolume() {

        setVolume(((getRaioDaBase()*getRaioDaBase())*3.14)*altura);

    }

    @Override
    public String toString() {
        return super.toString() + "\nCilindro{" +
                "raioDaBase=" + raioDaBase +
                ", altura=" + altura +
                ", volume=" + volume +
                '}';
    }
}
