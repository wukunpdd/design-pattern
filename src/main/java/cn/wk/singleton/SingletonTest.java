package cn.wk.singleton;

/**
 * 单例模式
 *  定义：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
 *  实现方法：通过定义一个私有访问权限的构造函数，避免被其它类new出来一个对象，而Singleton自己可以new一个对象出来，
 *  其它类对该对象的访问都可以通过getInstance获得同一个对象。
 *  使用场景：在一个系统中，要求一个类有且仅有一个对象，如果出现多个对象就会出现不良反应
 *  可以采用单例模式，具体的场景如下：
 *      要求生成唯一序列号的环境
 *      创建一个对象需要消耗的资源过多，如果访问IO和数据库等资源
 *      在整个项目中需要一个共享访问点或共享数据
 *      需要定义大量的静态常量和静态方法（如工具类）的环境，可以采用单例模式（也可以直接声明为static的方式）
 * Created by wukun on 2019/10/14.
 */
public class SingletonTest {
    public static void main(String[] args){
        HungrySingleton singleton = HungrySingleton.getInstance();
        singleton.say();

        HungrySingleton singleton1 = HungrySingleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
