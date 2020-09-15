package itwcn;

/**
 * @program: Day04
 * @description: 学习构造方法（有参构造和无参构造的方法）
 * @author: OriginalCoder
 * @create: 2020-09-15 12:13
 **/
class Person {
    //类的构造方法
    public Person() {
        System.out.println("调用了无参的构造方法");
    }
}
public class Exercise01 {
    public static void main(String[] args) {
        Person p = new Person();        //实例化Person对象
    }
}
