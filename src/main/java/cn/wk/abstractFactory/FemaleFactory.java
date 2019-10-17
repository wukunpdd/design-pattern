package cn.wk.abstractFactory;

/**
 * 接口 - 抽象实现类 - 继承抽象实现类确定男女
 * Created by wukun on 2019/10/15.
 */
public class FemaleFactory implements BasicFactory {
    public Dog createWhiteDog() {
        return new FemaleWhiteDog();
    }
}
