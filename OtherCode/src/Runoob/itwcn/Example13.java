package itwcn;

/**
 * @program: Runoob
 * @description: 学习super关键字的使用
 * @author: OriginalCoder
 * @create: 2020-10-04 21:35
 **/
//定义Animal4类
class Animal4 {
    //定义Animal4类有参的构造方法
    public Animal4(String name) {
        System.out.println("我是一只" + name);
    }
}
//定义Dog4类继承Animal4类
class Dog4 extends Animal4 {
    public Dog4() {
        super("哈皮狗");                   //调用父类有参的构造方法
    }
}
//定义测试类
public class Example13 {
    public static void main(String[] args) {
        Dog4 dog4 = new Dog4();                 //创建Dog4类的实例对象
    }
}
