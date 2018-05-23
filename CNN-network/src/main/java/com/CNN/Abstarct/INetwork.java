package com.CNN.Abstarct;

import org.deeplearning4j.nn.conf.layers.ConvolutionLayer;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;

import java.util.HashMap;
import java.util.Map;

public interface INetwork {

    void build(Map<Integer, ILayer> layers);

    void train(int epochs, DataSetIterator data);

    void predict(DataSetIterator data);
}
