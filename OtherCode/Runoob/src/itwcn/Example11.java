package itwcn;

/**
 * @program: Runoob
 * @description: 回忆模式Example09
 * @author: OriginalCoder
 * @create: 2020-10-04 20:46
 **/
class Animal2 {
    //定义动物叫的方法
    void shout() {
        System.out.println("动物叫！");
    }
}
//定义Dog2继承Animal2类
class Dog2 extends Animal2 {
    //定义喵叫的方法
    void shout() {
        System.out.println("喵喵喵~");
    }
}
//定义测试类
public class Example11 {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();                 //创建Dog2的实例对象
        dog2.shout();                           //调用Dog2类重写的shout方法
    }
}
