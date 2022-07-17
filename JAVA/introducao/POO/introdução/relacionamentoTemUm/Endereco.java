package com.introducao.POO.introdução.relacionamentoTemUm;

public class Endereco {

    private String nomeDaRua;
    private String numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String CEP;

    public Endereco() {
    }

    public Endereco(String nomeDaRua, String numero, String complemento, String cidade, String estado, String CEP) {
        this.nomeDaRua = nomeDaRua;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
}
