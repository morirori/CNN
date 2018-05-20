package com.CNN.Abstarct;

import org.deeplearning4j.nn.conf.layers.ConvolutionLayer;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;

import java.util.HashMap;
import java.util.Map;

public interface INetwork {

    void build();

    void predict();

}
