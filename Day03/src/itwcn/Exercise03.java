package itwcn;

/**
 * @program: Day03
 * @description: 学习Java对象的创建和使用
 * @author: OriginalCoder
 * @create: 2020-09-13 21:15
 **/


class Person {
    int age = 10;                          //类中定义的变量被称作成员变量
    void speak() {
//        int age = 30;                      //方法内部定义的变量被称作局部变量
        System.out.println("我的年龄:" + age);

    }
}
public class Exercise03 {
    public static void main(String[] args) {
        Person p1 = new Person();           //创建第一个Person类对象
        Person p2 = new Person();           //创建第二个Person类对象
        p1.age = 18;                        //为age属性赋值
        p1.speak();                         //调用对象的方法
        p2.speak();
    }
}

