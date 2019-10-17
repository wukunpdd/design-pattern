package cn.wk.templateMethod;

/**
 * Created by wukun on 2019/10/15.
 */
public class RedCatLife extends CatLife {
    protected void eat() {
        System.out.println("红猫不喜欢吃垃圾食品啦！");
    }

    protected void getUp() {
        System.out.println("红猫是个起床困难户啦！");
    }

    protected void sleep() {
        System.out.println("红猫睡觉比较早的啦！");
    }
}
