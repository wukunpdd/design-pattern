package cn.wk.templateMethod;

/**
 * Created by wukun on 2019/10/15.
 */
public class YellowCatLife extends CatLife {
    protected void eat() {
        System.out.println("黄猫要吃东西啦！");
    }

    protected void getUp() {
        System.out.println("黄猫要起床床啦！");
    }

    protected void sleep() {
        System.out.println("黄猫要睡觉觉啦！");
    }
}
