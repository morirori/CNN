package com.CNN.Utills;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.nd4j.linalg.activations.Activation;
import org.nd4j.linalg.lossfunctions.ILossFunction;
import org.nd4j.linalg.lossfunctions.LossFunctions;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class LayerConfigurator {
    private Integer width;
    private Integer height;
    private List<Integer> stride;
    private Integer outputs;
    private Activation activationFun;
    private Integer inputs;
    private List<Integer>kernelSize;
    private LossFunctions.LossFunction lossFunction;
}
