package Demo01;

/**
 * @program: ClassCode
 * @description: 学习方法的重载
 * @author: OriginalCoder
 * @create: 2020-10-20 19:14
 **/
public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }

    public static int sum(int a,int b) {
        System.out.println("两个参数执行");
        return a + b;
    }
    public static int sum(int a,int b,int c) {
        System.out.println("三个参数执行");
        return a + b + c;
    }
    public static int sum(int a,int b,int c,int d) {
        System.out.println("四个参数执行");
        return a + b + c + d;
    }
}
