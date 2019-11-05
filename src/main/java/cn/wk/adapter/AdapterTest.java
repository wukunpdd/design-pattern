package cn.wk.adapter;

/**
 * 适配器模式：
 *  将一个类的接口编程客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作
 * Created by wukun on 2019/11/5.
 */
public class AdapterTest {
    public static void main(String[] args){
        IUserInfo userInfo = new UserInfo();
        info(userInfo);

        System.out.println("-------------------------------------------------------------");

        userInfo = new OutUserInfo();
        info(userInfo);
    }

    public static void info(IUserInfo userInfo){
        System.out.println("姓名：" + userInfo.getUsername());
        System.out.println("手机号：" + userInfo.getMobile());
        System.out.println("年龄：" + userInfo.getAge());
        System.out.println("职位：" + userInfo.getJobPosition());
        System.out.println("工资：" + userInfo.getWage());
    }
}
