package itwcn.edu.com.demo03;

/**
 * @program: Demo03StaticStudent
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 22:23
 **/

public class Demo03StaticStudent {
    public static void main(String[] args) {
        //��������һ�½��ң���̬�����ݣ�Ӧ��ͨ��������������
        Student.room = "101����";

        Student one = new Student("����",19);
        System.out.println("one��������" + one.getName());
        System.out.println("one�����䣺" + one.getAge());
        System.out.println("one�Ľ��ң�" + Student.room);

        System.out.println("==========================");

        Student two = new Student("����",17);
        System.out.println("two��������" + two.getName());
        System.out.println("two�����䣺" + two.getAge());
        System.out.println("two�Ľ��ң�" + Student.room);

    }
}
