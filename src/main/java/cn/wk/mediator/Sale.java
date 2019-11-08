package cn.wk.mediator;

import java.util.Random;

/**
 * 销售管理
 * Created by wukun on 2019/11/8.
 */
public class Sale extends AbstrackColleague {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellIBMComputer(int number){
        super.mediator.execute("sale.sell", number);
        System.out.println("销售IBM电脑：" + number);
    }

    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为：" + saleStatus);
        return saleStatus;
    }

    public void offSale(){
        super.mediator.execute("sale.offSell");
    }
}
