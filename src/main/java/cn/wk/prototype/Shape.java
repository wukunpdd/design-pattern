package cn.wk.prototype;

/**
 * Created by wukun on 2019/10/17.
 */
public interface Shape extends Cloneable{
    //拷贝
    Object clone();

    //计算面积
    void countArea();
}
