package com.javaIntermediario.classesAninhadas;

public class ExternaLocal {

        public void metodo(){

            class Local {

                private String local = "texto classe local";

                public void imprimir(){
                    System.out.println(local);
                }
            }
            Local local = new Local();
            local.imprimir();
        }

        public static void main(String[] args){
        ExternaLocal externaLocal = new ExternaLocal();
        externaLocal.metodo();
        }
}
