package cn.wk.strategy;

/**
 * Created by wukun on 2019/10/21.
 */
public class Context {
    private IStrategy iStrategy;

    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }

    public void operate(){
        this.iStrategy.operate();
    }
}
