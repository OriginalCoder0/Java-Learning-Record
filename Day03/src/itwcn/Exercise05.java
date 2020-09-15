package itwcn;

/**
 * @program: Day03
 * @description: 学习类如何实现封装，将类中的属性私有化，使用关键字private
 * @author: OriginalCoder
 * @create: 2020-09-15 11:03
 **/
class Person2 {
    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("您输入的年龄不正确！");
        } else {
            this.age = age;
        }
    }
    public void speak() {
        System.out.println("我叫"+name+",今年"+age+"岁!");
    }
}
public class Exercise05 {
    public static void main(String[] args) {
        Person2 p = new Person2();
        p.setName("张三");
        p.setAge(-18);
        p.speak();
    }
}
