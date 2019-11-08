package cn.wk.mediator;

/**
 * Created by wukun on 2019/11/8.
 */
public abstract class AbstractMediator {

    protected Purchase purchase;

    protected Sale sale;

    protected Stock stock;

    public AbstractMediator(){
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String str, Object...objects);
}
