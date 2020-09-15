package itwcn;

/**
 * @program: Day04
 * @description: 有参构造方法
 * @author: OriginalCoder
 * @create: 2020-09-15 19:52
 **/
class Person1 {
    // 声明int类型的变量age
    int age;
    // 构造有参构造方法
    public Person1(int a) {
        age = a;                //为age属性赋值
    }
    //定义speak()方法
    public void speak() {
        System.out.println("我今年"+age+"岁!");
    }
}
public class Exercise02 {
    public static void main(String[] args) {
        Person1 p = new Person1(18);                  //实例化Person对象
        p.speak();
    }
}
