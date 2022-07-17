package com.introducao.heran�a.ExercicioPolimorfismoInterf.figuras2d;

import com.introducao.heran�a.ExercicioPolimorfismoInterf.DimensaoSuperficial;
import com.introducao.heran�a.ExercicioPolimorfismoInterf.FiguraGeometrica;

public abstract class Figuras2d extends FiguraGeometrica implements DimensaoSuperficial {

    double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
