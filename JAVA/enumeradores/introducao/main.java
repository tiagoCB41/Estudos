package com.enumeradores.introducao;

public class main {
    public static void main(String[] args){

usandoEnum();

    }



    private static void usandoEnum (){
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;

        System.out.println("imprimindo dias da semana:");
        imprimirDiaSemaana(segunda);
        imprimirDiaSemaana(terca);
        imprimirDiaSemaana(quarta);
        imprimirDiaSemaana(quinta);
        imprimirDiaSemaana(sexta);
        imprimirDiaSemaana(sabado);
        imprimirDiaSemaana(domingo);

    }

    private static void imprimirDiaSemaana(DiaSemana Dia){
        switch (Dia) {
            case SEGUNDA:
                System.out.println("segunda");
                break;
            case TERCA:
                System.out.println("terça");
                break;
            case QUARTA:
                System.out.println("quarta");
                break;
            case QUINTA:
                System.out.println("quinta");
                break;
            case SEXTA:
                System.out.println("sexta");
                break;
            case SABADO:
                System.out.println("sábado");
                break;
            case DOMINGO:
                System.out.println("domingo");
                break;

            default:
                break;
        }
    }
    //EXEMPLO RECEBENDO INT
    /*private static void utilizandoConstantes(){
        int segunda = Enumeradores.SEGUNDA;
        int terça = Enumeradores.TERÇA;
        int quarta = Enumeradores.QUARTA;
        int quinta = Enumeradores.QUINTA;
        int sexta = Enumeradores.SEXTA;
        int sabado = Enumeradores.SABADO;
        int domingo = Enumeradores.DOMINGO;

        System.out.println("imprimindo dias da semana:");
        imprimirDiaSemaana(segunda);
        imprimirDiaSemaana(terça);
        imprimirDiaSemaana(quarta);
        imprimirDiaSemaana(quinta);
        imprimirDiaSemaana(sexta);
        imprimirDiaSemaana(sabado);
        imprimirDiaSemaana(domingo);

    }*/

    //EXEMPLO RECEBENDO INT
    /*private static void imprimirDiaSemaana(int Dia){
        switch (Dia) {
            case 1:
                System.out.println("segunda");
                break;
            case 2:
                System.out.println("terça");
                break;
            case 3:
                System.out.println("quarta");
                break;
            case 4:
                System.out.println("quinta");
                break;
            case 5:
                System.out.println("sexta");
                break;
            case 6:
                System.out.println("sábado");
                break;
            case 7:
                System.out.println("domingo");
                break;

            default:
                break;
        }
    }*/
}
