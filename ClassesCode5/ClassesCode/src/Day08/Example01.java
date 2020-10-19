package Day08;
/**
 * @program: ClassesCode
 * @description: 学习抽象类和接口
 * @author: OriginalCoder
 * @create: 2020-10-19 21:39
 **/

//定义抽象类Animal
abstract class Animal {
    //定义抽象方法
    public abstract void shout();
}
//定义Dog类继承抽象类Animal
class Dog extends Animal {
    //实现抽象方法shout(),编写方法体
    public void shout() {
        System.out.println("汪汪汪~");
    }
}
//定义测试类
public class Example01 {
    public static void main(String[] args) {
        Dog dog = new Dog();            //创建Dog类的实例对象
        dog.shout();                    //调用dog对象的shout()方法
    }
}
