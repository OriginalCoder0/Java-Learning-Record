package study;

/**
 * @program: ClassesCode
 * @description: 学习接口的使用
 * @author: OriginalCoder
 * @create: 2020-10-13 23:00
 **/
interface Animal {
    int ID = 1;                     //定义全局变量
    void breathe();                 //定义抽象方法
    //定义一个默认方法
    default void getType(String type) {
        System.out.println("该动物属于" + type);
    }

    //定义静态方法
    static int getID() {
        return Animal.ID;
    }
}
//Dog类实现了Animal的接口
class Dog implements Animal {
    //实现breathe()方法
    public void breathe() {
        System.out.println("狗在呼吸");
    }
}
//定义测试类
public class Example01 {
    public static void main(String[] args) {
        System.out.println(Animal.getID());         //通过接口名调用类方法
        Dog dog = new Dog();                        //创建Dog类的实例对象
        System.out.println(dog.ID);                 //在实现类中获取接口全局常量
        dog.breathe();                              //调用dog类对象的breathe()方法
        dog.getType("犬科");                         //通过接口实现类Dog的实例化对象，调用接口默认方法
    }
}
