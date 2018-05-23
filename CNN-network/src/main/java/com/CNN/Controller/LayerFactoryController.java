package com.CNN.Controller;

import com.CNN.Abstarct.ILayer;
import com.CNN.Factories.ConvLayerFactory;
import com.CNN.Factories.DenseLayerFactory;
import com.CNN.Factories.OutputLayerFactory;
import com.CNN.Factories.SubsampLayerFactory;
import com.CNN.Layers.OutputLayer;
import com.CNN.Utills.LayerConfigurator;

public class LayerFactoryController {
    public static ILayer createDenseLayer(LayerConfigurator configurator){
        return DenseLayerFactory.build(configurator);
    }

    public static ILayer createConvLayer(LayerConfigurator configurator){
        return ConvLayerFactory.build(configurator);
    }

    public static ILayer createSubsampLayer(LayerConfigurator configurator){
        return SubsampLayerFactory.build(configurator);
    }

    public static ILayer createOutputLayer(LayerConfigurator configurator){
        return OutputLayerFactory.build(configurator);
    }
}
