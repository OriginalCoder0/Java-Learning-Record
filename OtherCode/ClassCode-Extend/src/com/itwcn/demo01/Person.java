package com.itwcn.demo01;

/**
 * @program: Person
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 20:14
 **/

/**
 * 问题描述：定义Person年龄时，无法阻止不合理的数值被设置进来。
 * 解决方案：用private关键字将需要保护的成员变量进行修饰
 *
 * 一旦采用private进行修饰，那么本类当中任然可以随意访问，
 * 但是超出本类范围之外，就不能直接访问
 *
 * 间接访问private成员变量，就是定义一对Getter/Setter方法
 */
public class Person {
    String name;        //姓名
    private int age;    //年龄

    public int getAge() {
        return age;
    }

    //这个成员方法，专门用于向age设置数据
    public void setAge(int num) {
        if(num < 100 && num >= 0) {
            this.age = num;
        } else {
            System.out.println("数据不合法！");
        }
    }

    public  void show() {
        System.out.println("我是：" + name + ",年龄" + age);
    }

}
