package com.estruturaDeDados.aumentarCapacidade;

public class main {
    public static void main(String[] args){

        Vetor vetor = new Vetor(3);


        try {
            vetor.adicionar("posi��o 0");
            vetor.adicionar("posi��o 1");
            vetor.adicionar("posi��o 2");
            vetor.adicionar("posi��o 3");
            vetor.adicionar("posi��o 4");

        } catch (Exception e) {
            e.printStackTrace();
        }






        //VETOR FOI DECLARADO COM O TAMANHO = 3
        //APOS O TAMANHO SER DOBRADO COM O METODO aumentarTamanho
        //O TAMANO FICOU 6
        System.out.println(vetor.elementos.length);







    }
}
