package Animal;

/**
 * @program: demoTest01
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/10 18:42
 **/

//定义Animal类
class Animal {
    //定义Animal无参的构造方法
    public Animal() {
        System.out.println("我是一只飞不高的小小鸟");
    }
    //定义Animal有参的构造方法
    public Animal(String name) {
        System.out.println("我是一只" + name);
    }
}
//定义Bird类继承Animal类
class Bird extends Animal {
    //定义无参的构造方法
    public Bird() {
    }
}

//定义测试类
public class Demo01 {
    public static void main(String[] args) {
        Bird bird = new Bird();     //创建一个Bird类的实例对象
    }
}

