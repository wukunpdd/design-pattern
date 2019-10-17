# 创建型模式
## 单例模式
#### 定义：
确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例

#### 实现方法：
1. 通过定义一个私有访问权限的构造函数，避免被其它类new出来一个对象，而Singleton自己可以new一个对象出来，
2. 其它类对该对象的访问都可以通过getInstance获得同一个对象。

#### 使用场景：
在一个系统中，要求一个类有且仅有一个对象，如果出现多个对象就会出现不良反应

#### 可以采用单例模式，具体的场景如下：
1. 要求生成唯一序列号的环境
2. 创建一个对象需要消耗的资源过多，如果访问IO和数据库等资源
3. 在整个项目中需要一个共享访问点或共享数据
4. 需要定义大量的静态常量和静态方法（如工具类）的环境，可以采用单例模式（也可以直接声明为static的方式）

## 原型模式：
#### 定义： 
用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象

#### 模式的结构：
1. 抽象原型类：规定了具体原型对象必需实现的接口
2. 具体原型类：实现抽象原型类的clone()方法，它是可被复制的对象
3. 访问类：实现具体原型类中的clone()方法来复制新的对象

#### 适用场景：
1. 对象之间相同或相似，即使只是个别的几个属性不同的时候
2. 对象的创建过程比较复杂，但复制比较简单的时候

Java 中的 Object 类提供了浅克隆的 clone() 方法，具体原型类只要实现 Cloneable 接口就可实现对象的浅克隆

#### 深克隆和浅克隆的区别：
对象属性引用的对象是否需要进行克隆
