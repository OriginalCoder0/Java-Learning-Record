package itwcn;

/**
 * @program: Runoob
 * @description: 学习使用super关键字
 * @author: OriginalCoder
 * @create: 2020-10-04 21:11
 **/
/*
当子类重写父类的方法后，子类对象将无法直接访问父类被重写的方法，为解决这个问题，Java提供了一个super关键字来访问父类的成员
，例如访问父类的成员变量、成员方法和构造方法。有两种方法来学习使用super关键字的具体用法
 */
/*
使用super关键字调用父类的成员变量和成员方法。格式：
super.成员变量
super.成员方法([参数1,参数2,···])
 */

//定义Animal3类
class Animal3 {
    String name = "动物";
    //定义动物叫的方法
    void shout() {
        System.out.println("动物发出叫声");
    }
}
class Dog3 extends Animal3{
    String name = "犬类";
    //重写父类shout()方法
    void shout() {
        super.shout();              //调用父类的成员方法
    }
    //定义打印name的方法
    void printName() {
        System.out.println("name " + super.name);       //访问父类的成员变量
    }
}
//定义测试类
public class Example12 {
    public static void main(String[] args) {
        Dog3 dog3 = new Dog3();             //创建一个dog3对象
        dog3.shout();                       //调用dog3对象重写的shout()方法
        dog3.printName();                   //调用dog3对象的printName()方法
    }
}
