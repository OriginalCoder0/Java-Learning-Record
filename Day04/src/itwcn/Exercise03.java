package itwcn;

/**
 * @program: Day04
 * @description: 了解和学习构造方法的重载
 * @author: OriginalCoder
 * @create: 2020-09-15 20:03
 **/

/**
 * Person2类中定义了两个构造方法，他们实现了方法的重载。在创建p1和p2对象时，根据传入参数个数的不同，
 * 分别调用了不同的构造方法。两个构造方法对属性赋值情况是不同的，其中p1对象只对age属性进行赋值，
 * 在调用speak()方法后，输出年龄信息；而p2对name和age属性进行赋值，在调用say()方法后，会输出姓名和年龄信息
 */
class Person2 {
    //声明String类型的变量name
    String name;
    //声明int类型的变量age
    int age;
    //定义有参构造方法
    public Person2(int a) {
        age = a;                //为age属性赋值
    }
    public Person2(String n,int a) {
        name = n;                //为name属性赋值
        age = a;                //为age属性赋值
    }
    //定义speak()方法
    public void speak() {
        System.out.println("我今年"+age+"岁！");
    }
    //定义say方法
    public void say() {
        System.out.println("我叫"+name+",今年"+age+"岁！");
    }
}
public class Exercise03 {
    public static void main(String[] args) {
        Person2 p1 = new Person2(18);
        Person2 p2 = new Person2("张三",22);
        p1.speak();
        p2.say();
    }
}
