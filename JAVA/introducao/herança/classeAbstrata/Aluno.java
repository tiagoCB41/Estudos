package com.introducao.heran�a.classeAbstrata;

public class Aluno extends Pessoa {

    private String curso;
    private double [] notas;


    public Aluno(String nome, String endereco, String telefone, String cpf, String curso, double[] notas) {
        super(nome, endereco, telefone, cpf);
        this.curso = curso;
        this.notas = notas;
    }

    public Aluno() {
        super();
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

    public String obterEtiquetaEndere�o () {
        return "endere�o do aluno = " + getEndereco();
    }


    public void imprimirEtiquetaEndere�o() {
        System.out.println("Imprimindo etiqueta do aluno");
        System.out.println(obterEtiquetaEndere�o());
    }



}
