package cn.wk.mediator;

/**
 * 中介者模式测试类
 *  定义：用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用
 *  从而使其耦合松散，而且可以独立的改变它们之间的交互
 * Created by wukun on 2019/11/8.
 */
public class MediatorTest {
    public static void main(String[] args){
        AbstractMediator mediator = new Mediator();

        System.out.println("采购人员采购电脑");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(50);

        System.out.println("\n销售人员销售电脑");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(25);

        System.out.println("\n库房管理人员清理库存");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
