package com.CNN.Network;

import com.CNN.Abstarct.ILayer;
import com.CNN.Abstarct.INetwork;
import com.CNN.Utills.NetworkConfigurator;
import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;

import java.util.Map;

public class CNNNetwork implements INetwork {

    private Map<Integer,ILayer> layerMap;
    private NetworkConfigurator configurator;
    private MultiLayerNetwork network;


    public CNNNetwork(NetworkConfigurator configurator) {

        this.configurator = configurator;
    }

    @Override
    public void build(Map<Integer,ILayer> layers) {
        this.layerMap=layers;
        NeuralNetConfiguration.ListBuilder conf = new NeuralNetConfiguration.Builder().
                seed(this.configurator.getSeed())
                .l2(this.configurator.getL2coef())
                .list()
                .setInputType(this.configurator.getInputType())
                .backprop(true).pretrain(false);

        layerMap.forEach((k,v) -> conf.layer(k,v.getLayer()));
        MultiLayerConfiguration finalConf = conf.build();
        this.network = new MultiLayerNetwork(finalConf);
        this.network.init();
    }

    @Override
    public void train(int epochs, DataSetIterator data){
        for (int i=1; i<epochs; i++){
            this.network.fit(data);
            data.reset();
        }
    }
    @Override
    public void predict(DataSetIterator data) {
        this.network.evaluate(data);
    }
}
