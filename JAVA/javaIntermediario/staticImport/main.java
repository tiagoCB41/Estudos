package com.javaIntermediario.staticImport;

//IMPORTANDO UM METODO DE CADA VEZ
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//IMPORTANDO TUDO.
//import static java.lang.Math.*;

public class main {
    public static void main(String[] args){

        double a = 2;
        double b = 3;
        double c = 4;

        //METODO POTENCIA
        System.out.println(pow(a,b));

        //METODO RAIZ QUADRADA
        System.out.println(sqrt(c));

    }
}
