package com.enumeradores.valueAndValueof;



public class main {
    public static void main(String[] args){

        //ADICIONA TODOS OS VALORES DO ENUM NO ARRAY
        DiaSemana[] dias = DiaSemana.values();

        //FOR IMPRIMINDO O ARRAY
        for (int i=0; i<dias.length; i++){
            //System.out.println(dias[i]);
        }

        //EXEMPLO ACIMA DE FORMA MAIS SIMPLIFICADA
        for (DiaSemana dia: DiaSemana.values()){
            System.out.println(dia);
        }

        //VALUEOF ATRIBUI APENAS UM VALOR DO ENUM
        DiaSemana diaVO = Enum.valueOf(DiaSemana.class,"DOMINGO");
        System.out.println("ValueOf --- " + diaVO);

    }
}
