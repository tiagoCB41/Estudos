package com.javaIntermediario.garbageCollector;

import com.javaIntermediario.paramScopoEReferencia.Contato;

public class coletorDeLixo {

    public static void obterMemoriaUsada(){
        //CONVERSOR DE BYTE PARA MEGABYTE
        final  int MB = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime();
        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB + "MB");

    }

    public static void main(String[] args){

        Contato[] contatos = new Contato[10000000];

        for(int i = 0; i< contatos.length; i++){
            contatos[i] = new Contato("nome" + 1, "00");
        }

        System.out.println("contatos criados");

        obterMemoriaUsada();

        contatos = null;

        //NO EXEMPLO PEDE PARA ESCREVER ESSA PRÓXIMA LINHA
        //, MAS O CÓDIGO FUNCIONA SEM ELE
        Runtime.getRuntime().runFinalization();


        Runtime.getRuntime().gc();
        System.out.println("contatos removidos da memória");

        obterMemoriaUsada();

        //RUNTIME GARBAGECOLLECTOR É POUCO USADO, SENDO MAIS
        //EFICAZ O USO DE FERRAMENTAS VISUAIS (PROFILLING)
        //DADO O EXEMPLO DO JVISUALVM
    }
}
