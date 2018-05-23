package com.CNN.Factories;

import com.CNN.Layers.DenseLayer;
import com.CNN.Utills.LayerConfigurator;

public class DenseLayerFactory {

    public static DenseLayer build(LayerConfigurator configurator) {
        DenseLayer toReturn= new DenseLayer(configurator);
        toReturn.build();
        return toReturn ;
    }
}
