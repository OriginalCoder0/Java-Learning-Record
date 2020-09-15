package itwcn;

/**
 * @program: Day03
 * @description: 实现方法的重载，方法的名称相同，但是参数的类型和个数不同
 * @author: OriginalCoder
 * @create: 2020-09-15 11:54
 * @Notice: 方法的重载与返回值类型无关，它只需要满足两个条件，一是方法的名称相同，二是参数个数或参数类型不同
 **/
public class Exercise07 {
    //1.实现两个整数相加
    public static int add(int x,int y) {
        return x+y;
    }
    //2.实现三个整数相加
    public static int add(int x,int y,int z) {
        return x+y+z;
    }
    //3.实现两个小数相加
    public static double add(double x,double y) {
        return x+y;
    }

    public static void main(String[] args) {
        //针对求和方法的调用
        int sum1 = add(1,2);
        int sum2 = add(3,4,7);
        double sum3 = add(0.5,5.6);
        //打印求和的结构
        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
        System.out.println("sum3="+sum3);
    }
}
