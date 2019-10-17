package cn.wk.singleton;

/**
 * Created by wukun on 2019/10/15.
 */
public class HungrySingleton {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    public void say(){
        System.out.println("喵！");
    }
}
