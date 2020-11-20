package itwcn;

/**
 * @program: Runoob
 * @description: 学习重写父类方法。在继承关系中，子类会自动继承父类中公共的方法。
 * @author: OriginalCoder
 * @create: 2020-10-04 20:34
 **/
//定义Animal类
class Animal1 {
    //定义动物叫的方法
    void shout() {
        System.out.println("动物发出叫声");
    }
}
class Dog1 extends Animal1 {
    //定义狗叫的方法
    void shout() {
        System.out.println("汪汪汪~汪汪汪~");
    }
}
//定义测试类
public class Example10 {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();                //创建Dog类的实例对象
        dog.shout();                        //调用Dog重写的shout方法
    }
}
