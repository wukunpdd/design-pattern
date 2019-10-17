package cn.wk.prototype;

/**
 * 原型模式：
 *  用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象
 *
 * 模式的结构：
 *  1.抽象原型类：规定了具体原型对象必需实现的接口
 *  2.具体原型类：实现抽象原型类的clone()方法，它是可被复制的对象
 *  3.访问类：实现具体原型类中的clone()方法来复制新的对象
 *
 * 适用场景：
 *  对象之间相同或相似，即使只是个别的几个属性不同的时候
 *  对象的创建过程比较复杂，但复制比较简单的时候
 *
 * Java 中的 Object 类提供了浅克隆的 clone() 方法，具体原型类只要实现 Cloneable 接口就可实现对象的浅克隆
 *
 * 深克隆和浅克隆的区别：
 *  对象属性引用的对象是否需要进行克隆
 *
 * Created by wukun on 2019/10/17.
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype realizetype1 = (Realizetype) realizetype.clone();
        System.out.println("obj1 == obj2 " + (realizetype == realizetype1));

        ProtoTypeManager pm=new ProtoTypeManager();
        Circle circle = (Circle)pm.getShape("Circle");
        circle.countArea();
        Square square = (Square) pm.getShape("Square");
        square.countArea();
    }
}
