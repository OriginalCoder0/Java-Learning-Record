package Extends.demo03;

/**
 * @program: Demo01Student
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 22:48
 **/

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("�����Ȱ�");
        stu1.setAge(25);
        System.out.println("������" + stu1.getName() + ",���䣺" + stu1.getAge());
        System.out.println("===========");

        //һ���Ը�ֵ
        Student stu2 = new Student("����",23);
        System.out.println("������" + stu2.getName() + ",���䣺" + stu2.getAge());
        stu2.setAge(26);
        System.out.println("������" + stu2.getName() + ",���䣺" + stu2.getAge());
    }
}
