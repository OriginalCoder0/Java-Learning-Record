package itwcn;

/**
 * @program: Runoob
 * @description: 学习Java的静态方法
 * @author: OriginalCoder
 * @create: 2020-10-03 22:04
 **/
/*
静态方法的使用，需要在类中定义的方法前加上static关键字即可，在使用时，静态方法可以通过以下两种方式来访问：
1：类名.方法
2：实例对象.方法
 */
class Person10 {
    public static void say() {               //定义静态方法
    System.out.println("Hello world!");
    }
}
public class Example07 {
    public static void main(String[] args) {
        //用“类名.方法”的方式调用静态方法
        Person10.say();
        //实例化对象
        Person10 person = new Person10();
        //用“实例对象.方法”的方式调用静态方法
        person.say();

    }
}
