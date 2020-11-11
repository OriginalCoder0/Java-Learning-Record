package com.itwcn.demo03;

/**
 * @program: Student
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 22:41
 **/

/**
 * 一个普通的类通常有下面四个组成部分:
 * 1.所有的成员变量都要使用private关键字来修饰
 * 2.为每一个成员变量编写一个Getter/Setter方法
 * 3.编写一个无参数的构造方法
 * 4.编写一个全参数的构造方法
 */

public class Student {

    private int age;        //年龄
    private String name;    //姓名
    public Student() {
    }
    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

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
        this.age = age;
    }

}
