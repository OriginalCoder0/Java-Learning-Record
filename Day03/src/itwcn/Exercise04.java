package itwcn;

/**
 * @program: Day03
 * @description: 了解为什么要对类封装
 * @author: OriginalCoder
 * @create: 2020-09-15 10:37
 **/
class Person1{
    String name;
    int age;
    public void speak() {
        System.out.println("我叫"+name+",今年"+age+"岁");
    }
}
public class Exercise04 {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.name = "张三";
        p.age = -18;
        p.speak();
    }
}