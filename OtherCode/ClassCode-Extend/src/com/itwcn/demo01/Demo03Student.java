package com.itwcn.demo01;

/**
 * @program: Demo04Student
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 20:41
 **/

public class Demo03Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("����");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("������" + stu.getName() + ",���䣺" + stu.getAge()
                            + ",�Ա�" + stu.isMale());
    }
}
