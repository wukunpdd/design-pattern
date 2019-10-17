package cn.wk.builder;

/**
 * 建造者模式：
 *  将一个复杂的对象的构建与它的表示分离，使用同样的构建过程，可以创建不同的表示
 *  最主要的功能是基本方法的调用顺序安排，也就是这些基本方法已经实现了
 *  通俗的讲就是零件的装配，顺序不同产生的对象也不同
 * 而工厂模式侧重创建，创建零件是它的职责，不关心组装顺序
 * Created by wukun on 2019/10/16.
 */
public class Client {
    public static void main(String[] args){
        Director director = new Director();
        for(int i = 0; i < 5; i++){
            BenzModel benzModel = director.getBenzModel_A();
            benzModel.run();
        }
        System.out.println();

        for(int i = 0; i < 2; i++){
            BMWModel bmwModel = director.getBMWModel_B();
            bmwModel.run();
        }
    }
}
