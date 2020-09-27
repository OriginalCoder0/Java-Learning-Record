package itwcn;

/**
 * @program: Day04
 * @description: 学习static静态代码块
 * @author: OriginalCoder
 * @create: 2020-09-27 22:57
 **/
class Person06{
    static {
        System.out.println("执行了Person类中的静态代码块");
    }
}
public class Exercise06 {
    static {
        System.out.println("执行了测试类中的静态代码块");
    }

    public static void main(String[] args) {
        //实例化2个Person对象
        Person06 p1 = new Person06();
        Person06 p2 = new Person06();
    }
}
