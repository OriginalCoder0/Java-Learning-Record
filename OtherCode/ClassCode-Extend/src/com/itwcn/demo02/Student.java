package com.itwcn.demo02;

/**
 * @program: Student
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 21:32
 **/

/**
 * 构造方法是专门用来创建对象的方法，当我们通过new来创建对象时，其实就是调用构造方法。
 * 格式：
 * public 类名称（参数类型 参数名称） {
 *     方法体
 * }
 *
 * 注意事项：
 * 1.构造方法的名称必须和所在类的名称完全一样，大小写也必须保持一致
 * 2.构造方法不要写返回值类型，连void都不写
 * 3.构造方法不能return一个具体的返回值
 * 4.如果没有编写任何构造函数，那么编译器有一个默认的构造函数，方法体重什么都不会执行
 * public Student() { }
 * 5.一旦编写了至少一个构造方法，那么编译器将不再有默认的构造函数
 */
public class Student {

    //成员变量
    private String name;
    private int age;

    //无参数的构造方法
    public Student() {
        System.out.println("无参构造方法执行了！");
    }

    public Student(String name,int age) {
        System.out.println("全参构造方法执行了！");
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

}
