package com.itwcn.demo08;

/**
 * @program: Demo02ArrayListStudent
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 10:43
 **/

import java.util.ArrayList;

/**
 * 题目：自定义4个学生对象，添加到集合，并遍历
 *
 * 思路：
 * 1.自定义Student学生类，四个部分。
 * 2.创建集合，用来存储学生对象，泛型，Student类型
 * 3.根据类，创建4个Student对象
 * 4.将4个学生对象添加到集合中
 * 5.遍历集合，for,size,get
 *
 *
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student a = new Student("小菜鸟",20);
        Student b = new Student("大菜鸟",22);
        Student c = new Student("老菜鸟",21);
        Student d = new Student("巨菜鸟",24);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + ",年龄：" + stu.getAge());
        }
    }

}
