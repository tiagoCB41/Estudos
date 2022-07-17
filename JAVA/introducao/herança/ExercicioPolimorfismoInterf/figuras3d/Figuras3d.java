package com.introducao.herança.ExercicioPolimorfismoInterf.figuras3d;

import com.introducao.herança.ExercicioPolimorfismoInterf.DimensaoVolumetrica;
import com.introducao.herança.ExercicioPolimorfismoInterf.FiguraGeometrica;

public abstract class Figuras3d extends FiguraGeometrica implements DimensaoVolumetrica {

    double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
