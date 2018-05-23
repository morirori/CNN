package com.CNN.Factories;

import com.CNN.Abstarct.ILayer;
import com.CNN.Abstarct.INetwork;
import com.CNN.Network.CNNNetwork;
import com.CNN.Utills.NetworkConfigurator;

import java.util.Map;

public class CNNNetworkFactory {
    public static CNNNetwork build(NetworkConfigurator configurator, Map<Integer,ILayer> layers){
        CNNNetwork network = new CNNNetwork( configurator);
        network.build(layers);
        return network;
    }
}
