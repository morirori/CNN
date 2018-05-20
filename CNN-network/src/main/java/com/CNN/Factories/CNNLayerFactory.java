package com.CNN.Factories;

import com.CNN.Layers.CNNLayer;
import com.CNN.Utills.LayerConfigurator;
import org.deeplearning4j.nn.conf.layers.ConvolutionLayer;
import org.nd4j.linalg.activations.Activation;

import java.util.List;

public class CNNLayerFactory {

    public static CNNLayer build(LayerConfigurator configurator) {
        CNNLayer toReturn= new CNNLayer(configurator);
        toReturn.build();
        return toReturn ;
    }
}
