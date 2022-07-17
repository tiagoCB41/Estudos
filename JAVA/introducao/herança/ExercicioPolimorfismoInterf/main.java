package com.introducao.herança.ExercicioPolimorfismoInterf;

import com.introducao.herança.ExercicioPolimorfismoInterf.figuras2d.Circulo;
import com.introducao.herança.ExercicioPolimorfismoInterf.figuras2d.Figuras2d;
import com.introducao.herança.ExercicioPolimorfismoInterf.figuras2d.Quadrado;
import com.introducao.herança.ExercicioPolimorfismoInterf.figuras2d.Triangulo;
import com.introducao.herança.ExercicioPolimorfismoInterf.figuras3d.Cilindro;
import com.introducao.herança.ExercicioPolimorfismoInterf.figuras3d.Cubo;
import com.introducao.herança.ExercicioPolimorfismoInterf.figuras3d.Figuras3d;
import com.introducao.herança.ExercicioPolimorfismoInterf.figuras3d.Piramide;

public class main {
    public static void main(String[] args) {

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];

        Circulo circulo = new Circulo();
        circulo.setNome("Circulo");
        circulo.setRaio(3);
        circulo.setCor("azul");
        circulo.CalcularArea();

        figuras[0] = circulo;


        /////////////////////////////////////

        Quadrado quadrado = new Quadrado();

        quadrado.setNome("Quadrado");
        quadrado.setCor("azul");
        quadrado.setLado(4);
        quadrado.CalcularArea();

        figuras[1] = quadrado;



        /////////////////////////////////////
        Triangulo triangulo = new Triangulo();

        triangulo.setNome("Triangulo");
        triangulo.setCor("azul");
        triangulo.setAltura(5);
        triangulo.setBase(3);
        triangulo.CalcularArea();

        figuras[2] = triangulo;


        /////////////////////////////////////
        Cilindro cilindro = new Cilindro();

        cilindro.setNome("Cilindro");
        cilindro.setCor("azul");
        cilindro.setAltura(3);
        cilindro.setRaioDaBase(1);
        cilindro.calcularVolume();

        figuras[3] = cilindro;

        /////////////////////////////////////
        Cubo cubo = new Cubo();
        cubo.setNome("Cubo");
        cubo.setCor("azul");
        cubo.setAltura(2);
        cubo.calcularVolume();

        figuras[4] = cubo;

        /////////////////////////////////////
        Piramide piramide = new Piramide();
        piramide.setNome("Piramide");
        piramide.setCor("azul");
        piramide.setAltura(4);
        piramide.setAreaBase(3);
        piramide.calcularVolume();

        figuras[5] = piramide;

        for (FiguraGeometrica test : figuras){
            if (test instanceof Figuras2d){
                System.out.println("Figura 2D");
            } else if (test instanceof Figuras3d) {
                System.out.println("Figura 3D");
            }
            System.out.println(test);
            System.out.println();
        }
    }
}
