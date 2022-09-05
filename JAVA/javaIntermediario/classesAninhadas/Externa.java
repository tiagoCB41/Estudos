package com.javaIntermediario.classesAninhadas;

public class Externa {
    private String texto  = "texto externo";

    public void imprimir(){
        System.out.println(texto);
    }

    //INTERNA
    public class Interna {
        private String texto = "texto interno";

        public void imprimir(){
            System.out.println(texto);
            System.out.println(Externa.this.texto);
        }
    }





    public static void main(String[] args){

        Externa externa = new Externa();
        Interna interna = externa.new Interna();
        interna.imprimir();


    }
}
