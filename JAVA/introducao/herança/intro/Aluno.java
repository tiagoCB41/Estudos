package com.introducao.herança.intro;

public class Aluno extends Pessoa{

    private String curso;
    private double [] notas;


    public Aluno() {
    }

    public Aluno(String curso, double[] notas) {

        this.curso = curso;
        this.notas = notas;
    }



    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(double total){
        for (int i = 0; i < notas.length; i++){
            total += notas[i];
        }
        return total;
    }

    public String calculaAprovado() {
        return "0";
    }

}
