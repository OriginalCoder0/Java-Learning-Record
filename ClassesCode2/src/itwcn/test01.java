package itwcn;

/**
 * @program: test01
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/20 11:01
 **/

import java.util.Scanner;	//导入别人的方法包

/**
 * 课堂测试类
 * @author OriginalCoder
 *
 */
public class test01 {

    /**
     * 文档注释
     * @param args 环境参数
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /**
         * Today Goal!
         * 块注释：可以用来多行来描述信息
         * 根据用户输入的成绩数字，判断：
         * 优秀、良好、及格、不及格
         * 并且打印到控制台
         */
        int a = 18;
        long b = a;//自动类型转换，小类型转大类型

        //用final来定义常量
        final float PI;			//5.8默认为double类型
        //常变量和变量的区别：常量只能赋值一次，变量可以赋值多次

        PI = 3.14F;
        a = 18;
        System.out.println("fr=" + PI);

        boolean bA = true;			//true:逻辑常量1，表示真；false:逻辑常量，表示假
        Scanner scA = null;			//null:对象常量，表示没有引用对象

        boolean bR = (a>10) ^ (bA);//bA等价于(bA == true)
        System.out.println("bR=" + bR);

        //位运算符
        byte c = (byte)-8;
        byte d = (byte)(c>>2);
        System.out.println("d=" + d);

        //三目运算符
        int store = 0;
        System.out.println(store <= 0 ? "没有库存啦！" : "库存量为：" + store);
    }

}
