package cn.wk.builder;

/**
 * Created by wukun on 2019/10/16.
 */
public class BMWModel extends CarModel {
    protected void start() {
        System.out.println("宝马启动");
    }

    protected void stop() {
        System.out.println("宝马熄火");
    }

    protected void alarm() {
        System.out.println("宝马鸣叫");
    }

    protected void engineBoom() {
        System.out.println("宝马引擎发动");
    }
}
