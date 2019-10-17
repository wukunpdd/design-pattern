package cn.wk.prototype;

import java.util.Scanner;

/**
 * Created by wukun on 2019/10/17.
 */
public class Circle implements Shape {
    public Object clone() {
        Circle c = null;
        try {
            c = (Circle) super.clone();
        }catch(Exception e){
            System.out.println("拷贝圆失败");
        }
        return c;
    }

    public void countArea() {
        int r = 0;
        System.out.println("这是一个圆，请输入圆的半径：");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        System.out.println("该圆的面积等于：" + (3.14*r*r) + "\n");
    }
}
