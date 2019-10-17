package cn.wk.templateMethod;

/**
 * 模板方法模式：
 *  定义一个操作中的算法的框架，而将一些步骤延迟到子类中。
 *  使得子类可以不改变一个算法的结构即可重新定义算法的某些特定步骤
 * Created by wukun on 2019/10/15.
 */
public class CatLifeTest {
    public static void main(String[] args){
        CatLife yellowCatLife = new YellowCatLife();
        yellowCatLife.life();

        System.out.println();

        CatLife redCatLife = new RedCatLife();
        redCatLife.life();
    }
}
