package itwcn;

/**
 * @program: Runoob
 * @description: 学习静态代码块
 * @author: OriginalCoder
 * @create: 2020-10-03 22:24
 **/
class Person {
    static {
        System.out.println("执行Person中的静态代码块");
    }
}
public class Example08 {
    static {
        System.out.println("执行了测试类中的静态代码块");
    }

    public static void main(String[] args) {
        //实例化2个Person对象
        Person p1 = new Person();
        Person p2 = new Person();
    }
}
