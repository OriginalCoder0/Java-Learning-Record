package itwcn;

/**
 * @program: Day05
 * @description: 学习object类，它是所有类的父亲
 * @author: OriginalCoder
 * @create: 2020-10-07 21:45
 **/

//定义Animal类
class Animal {
    //定义动物叫的方法
//    void shout() {
//        System.out.println("叽叽叽叽~");
//    }


    //重写Object类的toString()方法
    public String toString() {
        return "一只鸟飞过~";
    }
}
//定义测试类
public class Exercise02 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.toString());
    }
}
