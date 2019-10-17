package cn.wk.prototype;

/**
 * Created by wukun on 2019/10/17.
 */
public class Realizetype implements Cloneable {
    public Realizetype(){
        System.out.println("原型创建成功!");
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Realizetype)super.clone();
    }
}
