package cn.wk.strategy;

/**
 * Created by wukun on 2019/10/21.
 */
public class StrategyTest {
    public static void main(String[] args){
        Context context = null;

        System.out.println("刘备来到东吴之后");
        context = new Context(new BackDoor());
        context.operate();

        System.out.println("刘备要见孙尚香之前");
        context = new Context(new GivenGreenLight());
        context.operate();

        System.out.println("刘备准备逃亡荆州的过程中");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
