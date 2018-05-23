package com.CNN.Utills;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.deeplearning4j.nn.conf.Updater;
import org.deeplearning4j.nn.conf.inputs.InputType;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.nd4j.weightinit.WeightInit;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class NetworkConfigurator {
    private WeightInit weights;
    private Updater updater;
    private long seed;
    private long l2coef;
    private InputType inputType;


}
