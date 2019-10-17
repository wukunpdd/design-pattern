package cn.wk.abstractFactory;

/**
 * Created by wukun on 2019/10/15.
 */
public class MaleFactory implements BasicFactory {
    public Dog createWhiteDog() {
        return new MaleWhiteDog();
    }
}
