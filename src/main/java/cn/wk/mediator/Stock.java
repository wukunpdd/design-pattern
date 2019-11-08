package cn.wk.mediator;

/**
 * 库存管理
 * Created by wukun on 2019/11/8.
 */
public class Stock extends AbstrackColleague {
    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    private static int COMPUTER_NUMBER = 100;

    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为：" + number);
    }

    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为：" + number);
    }

    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    public void clearStock(){
        System.out.println("清理存货数量为：" + COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}
