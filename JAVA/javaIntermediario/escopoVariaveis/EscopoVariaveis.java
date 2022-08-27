package com.javaIntermediario.escopoVariaveis;

public class EscopoVariaveis {

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int calcularValor(int valor){
        valor = valor + 10;
        return valor;
        //PARA FAZER REFERENCIA AO ATRIBUTO VALOR DA CLASSE, PRECISA
        //USAR THIS.VALOR
    }

    public int teste(){
        int valor = 5;


            valor--;


        return valor;

        //PARA FAZER REFERENCIA AO ATRIBUTO VALOR DA CLASSE, PRECISA
        //USAR THIS.VALOR
    }


    public void outroTeste (){

        boolean flag = true;

        if (flag){

            int umaVariavel = 10;

            umaVariavel++;

            System.out.println(umaVariavel);

        }

        //UMA VARIAVEL DECLARADA DENTRO DE UM BLOCO ("{}")
        //TEM ESCOPO LOCAL APENAS DENTRO DESSE BLOCO

        //System.out.println(umaVariavel);   *ERRO CAPTURADO

    }

    public void maisUmTeste (int num){
        int total = 0;

        try{
            int outroNum = 0;
            total = num/outroNum;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            total++;
            //outroNum++; *ERRO DE ESCOPO, POIS A VARIAVEL OUTRONUM
            //FOI DECLARADA DENTRO DE OUTRO BLOCO

            //e.printStackTrace(); *MESMO ERRO
        }
    }

}
