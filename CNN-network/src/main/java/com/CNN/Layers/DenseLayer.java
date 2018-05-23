package com.CNN.Layers;

import com.CNN.Abstarct.ILayer;
import com.CNN.Utills.LayerConfigurator;
import org.deeplearning4j.nn.conf.layers.Layer;
import org.nd4j.linalg.activations.Activation;

public class DenseLayer implements ILayer {

    private org.deeplearning4j.nn.conf.layers.DenseLayer denseLayer;
    private LayerConfigurator configurator;

    public DenseLayer(LayerConfigurator configurator) {
        this.configurator = configurator;
    }

    @Override
    public void build() {
        this.denseLayer = new org.deeplearning4j.nn.conf.layers.DenseLayer.Builder()
                .activation(this.configurator.getActivationFun())
                .nOut(this.configurator.getOutputs())
                .build();
    }
    @Override
    public Layer getLayer() {
        return denseLayer;
    }
}
