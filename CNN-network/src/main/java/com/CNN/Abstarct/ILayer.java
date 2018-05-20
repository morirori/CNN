package com.CNN.Abstarct;

import org.deeplearning4j.nn.conf.layers.ConvolutionLayer;
import org.deeplearning4j.nn.conf.layers.Layer;

public interface ILayer {
     void build();
     Layer getLayer();
}
