package itwcn;

/**
 * @program: Runoob
 * @description: 学习面向对象下，定义类和对象，并继承父类属性
 * @author: OriginalCoder
 * @create: 2020-10-04 10:59
 **/
//定义Animal类
class Animal {
    String name;                    //声明name
    //定义动物叫的方法
    void shout() {
        System.out.println("动物发出叫声");
    }
}
//定义Dog类继承Animal类
class Dog extends Animal {
    //定义一个打印name的方法
    public void printName() {
        System.out.println("name" + name);
    }
}
//定义测试类
public class Example09 {
    public static void main(String[] args) {
        Dog dog = new Dog();        //创建一个Dog类的实例对象
        dog.name = "金毛";          //为dog对象的name属性进行赋值
        dog.printName();           //调用dog对象的printName方法
        dog.shout();               //调用Dog类继承来的shout()方法
    }
}
