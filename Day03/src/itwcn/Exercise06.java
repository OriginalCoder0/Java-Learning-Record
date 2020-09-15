package itwcn;

/**
 * @program: Day03
 * @description: 学习方法的重载，如何在类中定义和调用方法。在程序中实现一个队数字求和的方法。
 * @author: OriginalCoder
 * @create: 2020-09-15 11:16
 * @others: 从Exercise06中可知道，程序中对每一种求和都定义了一个方法，如果每个方法的名称都不相同，在调用方法的时候很难分辨
 *          调用了哪个方法。因此，在Java中，允许在一个程序中定义多个名称相同，但是参数的类型或个数不同的方法，
 *          这就实现了方法的重载。
 * @Details: 关于方法的重载将在下一个例子进行说明和代码的详细实现
 **/
public class Exercise06 {
    //1.实现两个整数相加
    public static int add01(int x,int y) {
        return x+y;
    }
    //2.实现三个整数相加
    public static int add02(int x,int y,int z) {
        return x+y+z;
    }
    //3.实现两个小数相加
    public static double add03(double x,double y) {
        return x+y;
    }

    public static void main(String[] args) {
        //针对求和方法的调用
        int sum1 = add01(1,2);
        int sum2 = add02(3,4,7);
        double sum3 = add03(0.5,5.6);
        //打印求和的结构
        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
        System.out.println("sum3="+sum3);
    }
}
