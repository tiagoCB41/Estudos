package com.estruturaDeDados.aumentarCapacidade;

public class main {
    public static void main(String[] args){

        Vetor vetor = new Vetor(3);


        try {
            vetor.adicionar("posição 0");
            vetor.adicionar("posição 1");
            vetor.adicionar("posição 2");
            vetor.adicionar("posição 3");
            vetor.adicionar("posição 4");

        } catch (Exception e) {
            e.printStackTrace();
        }






        //VETOR FOI DECLARADO COM O TAMANHO = 3
        //APOS O TAMANHO SER DOBRADO COM O METODO aumentarTamanho
        //O TAMANHO FICOU 6
        System.out.println(vetor.elementos.length);







    }
}
