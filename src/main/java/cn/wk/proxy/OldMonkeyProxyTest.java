package cn.wk.proxy;

/**
 * Created by wukun on 2019/10/17.
 */
public class OldMonkeyProxyTest {
    public static void main(String[] args){
        Monkey oldMonkey = new OldMonkey("zero");
        Monkey proxy = oldMonkey.getProxy();
        proxy.eat();
        proxy.player();
        proxy.sleep();
        System.out.println();

        Monkey test = new OldMonkeyProxy(oldMonkey);
        test.eat();
        test.player();
        test.sleep();
    }
}
