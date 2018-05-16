package com.CNN.Layers;

import com.CNN.Abstarct.ILayer;
import org.deeplearning4j.nn.conf.layers.ConvolutionLayer;
import org.nd4j.linalg.activations.Activation;
import java.util.List;

public class CNNLayer implements ILayer {

    private Integer width;
    private Integer height;
    private List<Integer> stride;
    private ConvolutionLayer convolutionLayer;
    private Integer outputs;
    private Activation activationFun;
    private Integer channels;

    @Override
    public ConvolutionLayer build(){
        return new ConvolutionLayer.Builder(this.width,this.height)
                .nIn(this.channels)
                .nOut(this.outputs)
                .stride(this.stride.get(0),this.stride.get(1))
                .activation(this.activationFun)
                .build();

    }

}

