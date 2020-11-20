package Extends.demo01;

/**
 * @program: Example01
 * @description: 学习Java的内部类
 * @author: OriginalCoder
 * @createtime:2020/10/27 17:36
 **/
class Outer {
    int m = 0;
    //定义外部类成员方法
    void test1() {
        System.out.println("外部类成员方法");
    }
    //定义成员内部类
    class Inner {
        int n = 1;
        //1.定义内部类方法，访问外部类成员变量和方法
        void show1() {
            System.out.println("外部类成员变量m="+m);
            test1();
        }
        void show2() {
            System.out.println("内部类成员方法");
        }
        //2.定义外部类方法，访问内部类变量和方法
        void test02() {
            Inner inner = new Inner();
            System.out.println("内部类成员变量n="+inner.n);
            inner.show2();
        }
    }
}

//定义测试类
public class Example01 {
    public static void main(String[] args) {
        Outer outer = new Outer();                  //创建外部类对象
        Outer.Inner inner = outer.new Inner();      //创建内部类对象
        inner.show1();      //测试在成员内部类中访问外部类成员变量和方法
        inner.show2();      //测试在外部类中访问内部类成员变量和方法
    }
}