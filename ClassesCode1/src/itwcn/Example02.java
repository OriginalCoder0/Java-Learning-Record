package itwcn;

/**
 * @program: ClassesCode
 * @description: 学习数据类型的强制转换
 * @author: OriginalCoder
 * @create: 2020-09-15 16:12
 **/
public class Example02 {
    public static void main(String[] args) {
        byte b = 3;
        int x = b;          //自动类型转换
        float y = x;
        System.out.println("b="+b+",x="+x+",y="+y);
//        System.out.println("x="+x);
//        System.out.println("y="+y);
        //强制类型转换方式
        final double PI = 3.1415926;        //定义一个圆周率常量
        float pi = (float) PI;
        x = (int)pi;
        System.out.println("π="+PI+",π="+pi+",x="+x);
    }
}
