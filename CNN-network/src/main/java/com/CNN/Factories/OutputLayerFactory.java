package com.CNN.Factories;

import com.CNN.Layers.OutputLayer;
import com.CNN.Utills.LayerConfigurator;

public class OutputLayerFactory {
    public static OutputLayer build(LayerConfigurator configurator) {
        OutputLayer toReturn= new OutputLayer(configurator);
        toReturn.build();
        return toReturn ;
    }

}
