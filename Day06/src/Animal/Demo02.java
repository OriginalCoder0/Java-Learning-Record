package Animal;

/**
 * @program: Demo02
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/10 19:50
 **/


//定义Animal接口
interface Animala {
    int ID = 1;         //定义全局变量
    void breathe();     //定义抽象方法breathe()
    //定义一个默认方法
    default void getType(String type) {
        System.out.println("该动物属于：" + type);
    }
    //定义一个静态方法
    static int getID() {
        return Animala.ID;
    }
}

//Dog类实现Animal接口
class Dog implements Animala {
    //实现breathe()方法
    public void breathe() {
        System.out.println("狗子在睡觉！");
    }
}
//定义测试类
public class Demo02 {
    public static void main(String[] args) {
        System.out.println(Animala.getID());            //通过接口名调用类方法
        Dog dog = new Dog();                            //创建Dog类实例对象
        System.out.println(dog.ID);                     //在实现类中获取接口的全局常量
        dog.breathe();                                  //调用dog对象的breathe()方法
        dog.getType("犬类");                             //通过接口实现类Dog的实例化对象，调用接口默认方法
    }
}
