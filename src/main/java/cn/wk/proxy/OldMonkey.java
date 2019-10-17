package cn.wk.proxy;

/**
 * Created by wukun on 2019/10/17.
 */
public class OldMonkey implements Monkey {
    private String name = "";
    private Monkey proxy = null;

    public OldMonkey(String name){
        this.name = name;
    }

    public Monkey getProxy() {
        this.proxy = new OldMonkeyProxy(this);
        return this.proxy;
    }

    public void eat() {
        if(this.isProxy()){
            System.out.println(this.name + "老猴子在吃放");
        }else{
            System.out.println("eat():请使用指定的代理访问");
        }
    }

    public void sleep() {
        if(this.isProxy()){
            System.out.println(this.name + "老猴子在睡觉");
        }else{
            System.out.println("sleep():请使用指定的代理访问");
        }
    }

    public void player() {
        if(this.isProxy()){
            System.out.println(this.name + "老猴子在打游戏");
        }else{
            System.out.println("player():请使用指定的代理访问");
        }
    }

    private boolean isProxy(){
        if(this.proxy == null){
            return false;
        }else{
            return true;
        }
    }
}
