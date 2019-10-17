package cn.wk.proxy;

/**
 * Created by wukun on 2019/10/17.
 */
public class RealSubject implements Subject {
    public void player() {
        System.out.println("我是一个喜欢玩耍的人");
    }
}
