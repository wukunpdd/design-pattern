package cn.wk.factoryMethod;

/**
 * 工厂方法模式的定义：
 *  定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到其子类。
 * Created by wukun on 2019/10/15.
 */
public class AnimalFactory {
    public static <T extends Animal> T createAnimal(Class<T> C) {
        Animal animal = null;
        try{
            animal = (T)Class.forName(C.getName()).newInstance();
        }catch (Exception e) {
            System.out.println("动物生成错误");
        }
        return (T)animal;
    }

    public static void main(String[] args){
        Animal elephant = AnimalFactory.createAnimal(Elephant.class);
        elephant.eat();
        elephant.drink();
        elephant.whore();

        System.out.println();

        Animal snake = AnimalFactory.createAnimal(Snake.class);
        snake.eat();
        snake.drink();
        snake.whore();
    }
}
