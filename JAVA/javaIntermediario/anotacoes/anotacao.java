package com.javaIntermediario.anotacoes;

public @interface anotacao {

    String autor();

    int aulaNumero();

    String blog() default "teste.com";

}
