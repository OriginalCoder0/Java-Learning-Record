package itwcn;

/**
 * @program: Day04
 * @description: 学习this关键字的使用，增加代码的可读性
 * @author: OriginalCoder
 * @create: 2020-09-15 22:33
 **/
//public class Exercise04 {
//    int age;                        //成员变量age
//    public Exercise04(int age) {    //局部变量age
//        this.age = age;             //将局部变量age的值赋值给成员变量age
//    }
//}
/**
 * 在上述的代码中，构造方法的参数被定义为age，它是一个局部变量，在类中还定义了一个成员变量，名称也是age.
 * 在构造方法中如果使用“age”，则是访问局部变量，但如果使用“this.age”则是访问成员变量
 */

class Person4 {
    public Person4() {
        System.out.println("无参的构造函数被调用");
    }
    public Person4(int age) {
        this();
        System.out.println("有参的构造函数被调用了");
    }
}
public class Exercise04 {
    public static void main(String[] args) {
        Person4 p = new Person4(18);
    }
}
