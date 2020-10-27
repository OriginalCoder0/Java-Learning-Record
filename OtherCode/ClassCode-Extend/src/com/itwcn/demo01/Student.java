package com.itwcn.demo01;

/**
 * @program: Student
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 20:37
 **/

/**
 * 对于基本类型当中的boolean值，Getter方法一定要写成isXxx，Setter方法不变
 */
public class Student {
    private String name;    //姓名
    private int age;        //年龄
    private boolean male;   //性别

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

    public boolean isMale() {
        return male;
    }
    public void setMale(boolean male) {
        this.male = male;
    }


}
