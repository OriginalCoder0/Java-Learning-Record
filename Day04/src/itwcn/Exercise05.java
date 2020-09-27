package itwcn;

/**
 * @program: Day04
 * @description: 学习静态方法
 * @author: OriginalCoder
 * @create: 2020-09-27 22:36
 **/
class Person5 {
    public static void say() {              //定义静态方法
        System.out.println("Hello World!");
    }
}
public class Exercise05 {
    public static void main(String[] args) {
        //用”类名.方法“的方式调用静态方法
        Person5.say();
        //实例化对象
        Person5 person5 = new Person5();
        person5.say();
    }
}
