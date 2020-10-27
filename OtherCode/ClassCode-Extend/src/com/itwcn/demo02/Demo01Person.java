package com.itwcn.demo02;

/**
 * @program: Demo01Person
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 20:56
 **/

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        //设置我自己的名字
        person.name = "菜鸟";
        person.sayHello("大佬");
        System.out.println(person);
    }
}
