package Day09;

/**
 * @program: ClassesCode
 * @description: 学习接口的使用
 * @author: OriginalCoder
 * @create: 2020-10-19 22:01
 **/
//定义Animal接口
interface Animal {
    int ID = 1;                     //定义全局变量
    void breathe();                 //定义抽象方法breathe()
    //定义一个默认方法
    default void getType(String type) {
        System.out.println("该动物属于：" + type);
    }
    //定义一个静态方法
    static int getID() {
        return Animal.ID;
    }
}
//Dog类实现Animal的接口
class Dog implements Animal {
    //实现breathe()方法

    @Override
    public void breathe() {
        System.out.println("狗在呼吸");
    }
}
//定义测试类
public class Example02 {
    public static void main(String[] args) {
        System.out.println(Animal.getID());     //通过接口名调用类方法
        Dog dog = new Dog();                    //创建Dog类的实例对象
        System.out.println(dog.ID);             //在实现类中获取接口全局变量
        dog.breathe();                          //调用dog对象的breathe()方法
        dog.getType("犬科");                     //通过接口实现类Dog的实例化对象，调用接口默认方法
    }
}
