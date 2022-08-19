package com.enumeradores.metodosAbstratos;

public class main {
    public static void main(String[] args){

       Pessoa tiago = new Pessoa();

       tiago.setDocumento(Documento.CPF);
       tiago.setNumeroDocumento(tiago.getDocumento().geraTeste());
       System.out.println(tiago);

       Pessoa empresaX = new Pessoa();
       empresaX.setDocumento(Documento.CNPJ);
       empresaX.setNumeroDocumento(empresaX.getDocumento().geraTeste());
       System.out.println(empresaX);


  }
}
