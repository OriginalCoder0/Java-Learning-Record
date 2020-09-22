package itwcn;

/**
 * @program: ClassesCode
 * @description: 了解Java中的常量和变量
 * @author: OriginalCoder
 * @create: 2020-09-15 16:44
 **/
public class Example03 {
    public static void main(String[] args) {
        final int a = 0,b;      //定义一个整型常量a
        b=1;
        final double PI = 3.1415926;
        float pi = (float)PI;
        double dLen = 6.8 * PI;          //周长
        double dS = 3.4 * 3.4 * PI;      //面积
        System.out.println("半径为3.4的圆周长："+dLen);
        System.out.println("半径为3.4的圆面积："+dS);
    }

}
