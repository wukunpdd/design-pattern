package cn.wk.builder;

import java.util.List;

/**
 * Created by wukun on 2019/10/16.
 */
public class BMWBuilder extends CarBuilder {
    CarModel bmwModel = new BMWModel();

    protected void setSequence(List<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    protected CarModel getCarModel() {
        return this.bmwModel;
    }
}
