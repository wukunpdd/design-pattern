# 创建型模式
## 单例模式(Singleton)
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

## 原型模式(Prototype)
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

## 工厂方法模式(FactoryMethod)
#### 定义：
定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到其子类。

## 抽象工厂模式(AbstractFactory)
#### 定义：
1. 为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类
2. 接口 - 抽象实现类 - 继承抽象实现类确定男女

## 建造者模式
#### 定义：
将一个复杂的对象的构建与它的表示分离，使用同样的构建过程，可以创建不同的表示，最主要的功能是基本方法的调用顺序安排，也就是这些基本方法已经实现了，通俗的讲就是零件的装配，顺序不同产生的对象也不同

#### 与工厂模式的区别：
而工厂模式侧重创建，创建零件是它的职责，不关心组装顺序

# 结构型模式
## 代理模式
#### 定义：
其它对象提供一种代理以控制对这个对象的访问

#### 代理分类：
1. 普通代理：客户端只能访问代理角色不能访问真实角色
2. 强制代理：访问者直接调用真实角色不用关心代理类是否存在，但必须通过真实角色查找到代理角色，否则无法访问

#### 特性：
1. 代理类可以为真实角色预处理消息、过滤消息、消息转发、事后处理消息等功能
2. 一个代理类可以，可以代理多个真实角色，并且真实角色之间可以有耦合关系

动态代理研究 面向横切面编程（AOP）即可，此处不研究

## 适配器模式
#### 定义：
将一个类的接口编程客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作

# 行为型模式
## 模板方法模式
#### 定义：
一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构即可重新定义算法的某些特定步骤

## 中介者模式
#### 定义
用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立的改变它们之间的交互
