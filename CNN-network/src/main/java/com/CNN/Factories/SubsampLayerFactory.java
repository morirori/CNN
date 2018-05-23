package com.CNN.Factories;

import com.CNN.Abstarct.ILayer;
import com.CNN.Layers.SubsampLayer;
import com.CNN.Utills.LayerConfigurator;

public class SubsampLayerFactory {
    public static SubsampLayer build(LayerConfigurator conf){
        SubsampLayer layer = new SubsampLayer(conf);
        layer.build();
        return layer;
    }
}
