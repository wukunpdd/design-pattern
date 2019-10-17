package cn.wk.prototype;

import java.util.Scanner;

/**
 * Created by wukun on 2019/10/17.
 */
public class Square implements Shape {
    public Object clone() {
        Square c = null;
        try {
            c = (Square) super.clone();
        }catch(Exception e){
            System.out.println("拷贝正方形失败");
        }
        return c;
    }

    public void countArea() {
        int r = 0;
        System.out.println("这是一个正方形，请输入正方形的边长：");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        System.out.println("该正方形的面积等于：" + (r*r) + "\n");
    }
}
