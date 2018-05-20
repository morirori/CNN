package com.CNN.Utills;

import lombok.Getter;
import lombok.Setter;
import org.nd4j.linalg.activations.Activation;

import java.util.List;
@Getter
@Setter
public class LayerConfigurator {
    private Integer width;
    private Integer height;
    private List<Integer> stride;
    private Integer outputs;
    private Activation activationFun;
    private Integer channels;

}
