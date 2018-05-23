package com.CNN.Layers;

import com.CNN.Abstarct.ILayer;
import com.CNN.Utills.LayerConfigurator;
import org.deeplearning4j.nn.conf.layers.Layer;

public class OutputLayer implements ILayer {

    LayerConfigurator configurator;
    org.deeplearning4j.nn.conf.layers.OutputLayer layer;

    public OutputLayer(LayerConfigurator configurator) {
        this.configurator = configurator;
    }

    @Override
    public void build() {
        this.layer =  new org.deeplearning4j.nn.conf.layers.OutputLayer.Builder(this.configurator.getLossFunction())
                .activation(this.configurator.getActivationFun())
                .nOut(this.configurator.getOutputs())
                .build();

    }

    @Override
    public Layer getLayer() {
        return this.layer;
    }
}
