package com.CNN.Factories;

import com.CNN.Abstarct.INetwork;
import com.CNN.Network.CNNNetwork;
import com.CNN.Utills.NetworkConfigurator;

public class CNNNetworkFactory {
    public static CNNNetwork build(NetworkConfigurator configurator){
        CNNNetwork network = new CNNNetwork( configurator);
        network.build();
        return network;
    }
}
