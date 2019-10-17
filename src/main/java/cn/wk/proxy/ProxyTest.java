package cn.wk.proxy;

import cn.wk.common.TimeUtils;

/**
 * 代理模式：
 *  为其它对象提供一种代理以控制对这个对象的访问
 *
 * 代理分类：
 *  普通代理：客户端只能访问代理角色不能访问真实角色
 *  强制代理：访问者直接调用真实角色不用关心代理类是否存在，但必须通过真实角色查找到代理角色，否则无法访问
 *
 * 代理类可以为真实角色预处理消息、过滤消息、消息转发、事后处理消息等功能
 * 一个代理类可以，可以代理多个真实角色，并且真实角色之间可以有耦合关系
 *
 * 动态代理研究 面向横切面编程（AOP）即可，此处不研究
 *
 * Created by wukun on 2019/10/17.
 */
public class ProxyTest {
    public static void main(String[] args){
        IGamePlayer player = new GamePlayerProxy("吴堃");

        System.out.println("开始时间是：" + TimeUtils.getToday(TimeUtils.yyyyMMddHHmmss));
        player.login("wukun", "555555");
        player.killBoss();

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        player.uograde();
        System.out.println("结束时间是：" + TimeUtils.getToday(TimeUtils.yyyyMMddHHmmss));
    }
}
