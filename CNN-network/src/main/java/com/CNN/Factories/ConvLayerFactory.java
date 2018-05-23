package com.CNN.Factories;

import com.CNN.Layers.ConvLayer;
import com.CNN.Utills.LayerConfigurator;

public class ConvLayerFactory {

    public static ConvLayer build(LayerConfigurator configurator) {
        ConvLayer toReturn= new ConvLayer(configurator);
        toReturn.build();
        return toReturn ;
    }
}
