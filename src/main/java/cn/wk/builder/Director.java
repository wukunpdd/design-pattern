package cn.wk.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wukun on 2019/10/16.
 */
public class Director {
    private List<String> sequence = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getBenzModel_A(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return (BenzModel)benzBuilder.getCarModel();
    }

    public BenzModel getBenzModel_B(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return (BenzModel)benzBuilder.getCarModel();
    }

    public BMWModel getBMWModel_A(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        bmwBuilder.setSequence(sequence);
        return (BMWModel)bmwBuilder.getCarModel();
    }

    public BMWModel getBMWModel_B(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        bmwBuilder.setSequence(sequence);
        return (BMWModel)bmwBuilder.getCarModel();
    }
}
