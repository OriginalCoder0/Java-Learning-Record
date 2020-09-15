package itwcn;

/**
 * @program: Day03
 * @description: 学习Java的类和面向对象
 * @author: OriginalCoder
 * @create: 2020-09-13 20:52
 **/

/**
* 定义一个Exercise02的类，并在类中定义了类的成员变量和成员方法。
 * Exercise02是类名，age是类的成员变量，speak()是类的成员方法。
 * 在成员方法speak()可以直接访问成员变量age
* */
//public class Exercise02 {
//    int age;                            //声明int类型的变量age
//    void speak() {
//        System.out.println("我的年龄:"+age);
//    }
//}


/**
 * 在Java中，定义在类中的变量被称为成员变量，定义在方法中的变量被称为局部变量。
 * 如果在某一个方法中的局部变量和成员变量名相同，这种情况是允许的，此时通过变量名访问到的是局部变量，
 * 而非成员变量。
 * **/

public class Exercise02 {
    int age = 10;                          //类中华定义的变量被称作成员变量
    void speak() {
        int age = 30;                      //方法内部定义的变量被称作局部变量
        System.out.println("我的年龄:"+age);
    }
}
