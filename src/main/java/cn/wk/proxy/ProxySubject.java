package cn.wk.proxy;

/**
 * Created by wukun on 2019/10/17.
 */
public class ProxySubject implements Subject {
    private Subject subject = null;

    public ProxySubject(){
        this.subject = new ProxySubject();
    }

    public ProxySubject(Subject subject){
        this.subject = subject;
    }

    public void after(){
        System.out.println("在玩耍之前");
    }

    public void before(){
        System.out.println("在玩耍之后");
    }

    public void player() {
        this.after();
        this.subject.player();
        this.before();
    }
}
