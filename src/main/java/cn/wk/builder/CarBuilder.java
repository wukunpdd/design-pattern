package cn.wk.builder;

import java.util.List;

/**
 * Created by wukun on 2019/10/16.
 */
public abstract class CarBuilder {
    protected abstract void setSequence(List<String> sequence);

    protected abstract CarModel getCarModel();
}
