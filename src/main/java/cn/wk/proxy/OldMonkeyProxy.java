package cn.wk.proxy;

/**
 * Created by wukun on 2019/10/17.
 */
public class OldMonkeyProxy implements Monkey{
    private Monkey monkey = null;

    public OldMonkeyProxy(Monkey monkey){
        this.monkey = monkey;
    }

    public void eat() {
        this.monkey.eat();
    }

    public void sleep() {
        this.monkey.sleep();
    }

    public void player() {
        this.monkey.player();
    }

    public Monkey getProxy() {
        return this;
    }
}
