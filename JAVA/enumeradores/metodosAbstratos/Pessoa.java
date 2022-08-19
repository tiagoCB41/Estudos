package com.enumeradores.metodosAbstratos;

public class Pessoa {

    private Documento documento;
    private String numeroDocumento;


    public Pessoa() {}

    public Pessoa(Documento documento, String numeroDocumento) {
        this.documento = documento;
        this.numeroDocumento = numeroDocumento;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "documento=" + documento +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                '}';
    }
}
