package cn.wk.mediator;

/**
 * Created by wukun on 2019/11/8.
 */
public class Mediator extends AbstractMediator {
    public void execute(String str, Object... objects) {
        if(str.equals("purchase.buy")){
            this.buyComputer((Integer)objects[0]);
        }else if(str.equals("sale.sell")){
            this.sellComputer((Integer)objects[0]);
        }else if(str.equals("sale.offSale")){
            this.offSell();
        }else if(str.equals("stock.clear")){
            this.clearStock();
        }
    }

    private void buyComputer(int number){
        int saleStatus = super.sale.getSaleStatus();
        if(saleStatus >= 80){
            System.out.println("采购IBM电脑：" + number);
            super.stock.increase(number);
        }else{
            number = number / 2;
            System.out.println("采购IBM电脑：" + number);
        }
    }

    private void sellComputer(int number){
        if(super.sale.getSaleStatus() < number){
            super.purchase.buyIBMComputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell(){
        System.out.println("折价销售IBM电脑：" + super.sale.getSaleStatus());
    }

    private void clearStock(){
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
