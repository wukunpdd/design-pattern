package cn.wk.mediator;

/**
 * Created by wukun on 2019/11/8.
 */
public abstract class AbstrackColleague {
    protected AbstractMediator mediator;

    public AbstrackColleague(AbstractMediator mediator){
        this.mediator = mediator;
    }
}
