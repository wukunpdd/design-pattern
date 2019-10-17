package cn.wk.templateMethod;

/**
 * Created by wukun on 2019/10/15.
 */
public abstract class CatLife {
    protected abstract void eat();

    protected abstract void getUp();

    protected abstract void sleep();

    public final void life(){
        getUp();
        eat();
        sleep();
    }
}
