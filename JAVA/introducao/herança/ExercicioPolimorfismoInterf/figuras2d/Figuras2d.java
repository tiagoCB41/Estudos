package com.introducao.herança.ExercicioPolimorfismoInterf.figuras2d;

import com.introducao.herança.ExercicioPolimorfismoInterf.DimensaoSuperficial;
import com.introducao.herança.ExercicioPolimorfismoInterf.FiguraGeometrica;

public abstract class Figuras2d extends FiguraGeometrica implements DimensaoSuperficial {

    double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
