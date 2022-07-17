package com.introducao.heran�a.ExercicioPolimorfismoInterf.figuras3d;

import com.introducao.heran�a.ExercicioPolimorfismoInterf.DimensaoVolumetrica;
import com.introducao.heran�a.ExercicioPolimorfismoInterf.FiguraGeometrica;

public abstract class Figuras3d extends FiguraGeometrica implements DimensaoVolumetrica {

    double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
