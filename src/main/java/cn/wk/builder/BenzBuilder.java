package cn.wk.builder;

import java.util.List;

/**
 * Created by wukun on 2019/10/16.
 */
public class BenzBuilder extends CarBuilder {
    CarModel benzModel = new BenzModel();

    protected void setSequence(List<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    protected CarModel getCarModel() {
        return this.benzModel;
    }
}
