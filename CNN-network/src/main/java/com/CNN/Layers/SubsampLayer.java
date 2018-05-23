package com.CNN.Layers;

import com.CNN.Abstarct.ILayer;
import com.CNN.Utills.LayerConfigurator;
import org.deeplearning4j.nn.conf.layers.Layer;
import org.deeplearning4j.nn.conf.layers.SubsamplingLayer;

public class SubsampLayer implements ILayer {

    private SubsamplingLayer subsamplingLayer;
    private LayerConfigurator configurator;

    public SubsampLayer(LayerConfigurator configurator) {
        this.configurator = configurator;
    }


    @Override
    public void build() {
        int horizontalIndex = 0;
        int verticalIndex = 1;
        System.out.print(this.configurator.toString());
        this.subsamplingLayer = new SubsamplingLayer.Builder(SubsamplingLayer.PoolingType.MAX)
                .kernelSize(this.configurator.getKernelSize().get(horizontalIndex),this.configurator.getKernelSize().get(verticalIndex))
                .stride(this.configurator.getStride().get(horizontalIndex),
                        this.configurator.getStride().get(verticalIndex))
                .build();
    }

    @Override
    public Layer getLayer() {
        return this.subsamplingLayer;
    }
}
