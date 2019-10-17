package cn.wk.proxy;

/**
 * Created by wukun on 2019/10/17.
 */
public class ProxySubjectTest {
    public static void main(String[] args){
        Subject subject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(subject);
        proxySubject.player();
    }
}
