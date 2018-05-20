package com.CNN.Layers;

import com.CNN.Abstarct.ILayer;
import com.CNN.Utills.LayerConfigurator;
import lombok.Getter;
import org.deeplearning4j.nn.conf.layers.ConvolutionLayer;
import org.deeplearning4j.nn.conf.layers.Layer;

public class CNNLayer implements ILayer {
    private final int HorizontalStrideIndex=0;
    private final int VerticalStrideIndex=1;

    private ConvolutionLayer convolutionLayer;
    private LayerConfigurator configurator;

    public CNNLayer(LayerConfigurator configurator) {
        this.configurator = configurator;
    }

    @Override
    public Layer getLayer(){
        return this.convolutionLayer;
    }

    @Override
    public void build(){
        this.convolutionLayer = new ConvolutionLayer.Builder(this.configurator.getWidth(),
                        this.configurator.getHeight())
                .nIn(this.configurator.getChannels())
                .nOut(this.configurator.getOutputs())
                .stride(this.configurator.getStride().get(HorizontalStrideIndex),
                        this.configurator.getStride().get(VerticalStrideIndex))
                .activation(this.configurator.getActivationFun())
                .build();

    }

}

