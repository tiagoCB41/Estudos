package com.enumeradores.metodosAbstratos;

public enum Documento {

    CPF {
        @Override
        public String geraTeste() {
            return GeraCpfCnpj.cpf();
        }
    },CNPJ {
        @Override
        public String geraTeste() {
          return GeraCpfCnpj.cnpj();
        }
    };

    public abstract String geraTeste();
}
