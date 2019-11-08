package cn.wk.mediator;

/**
 * 采购管理
 * Created by wukun on 2019/11/8.
 */
public class Purchase extends AbstrackColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIBMComputer(int number){
        super.mediator.execute("purchase.buy", number);
    }

    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
