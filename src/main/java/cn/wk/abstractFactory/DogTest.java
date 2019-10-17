package cn.wk.abstractFactory;

/**
 * 抽象工厂模式：
 *  为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类
 *  接口 - 抽象实现类 - 继承抽象实现类确定男女
 * Created by wukun on 2019/10/15.
 */
public class DogTest {
    public static void main(String[] args){
        BasicFactory femaleFactory = new FemaleFactory();
        BasicFactory maleFactory = new MaleFactory();
        FemaleWhiteDog femaleWhiteDog = (FemaleWhiteDog) femaleFactory.createWhiteDog();
        MaleWhiteDog maleWhiteDog = (MaleWhiteDog) maleFactory.createWhiteDog();

        femaleWhiteDog.color();
        femaleWhiteDog.sex();

        maleWhiteDog.color();
        maleWhiteDog.sex();
    }
}
