package itwcn.edu.com.demo03;

/**
 * @program: Demo03StaticStudent
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 22:23
 **/

public class Demo03StaticStudent {
    public static void main(String[] args) {
        //首先设置一下教室，静态的内容，应该通过类名称来调用
        Student.room = "101教室";

        Student one = new Student("郭靖",19);
        System.out.println("one的姓名：" + one.getName());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("one的教室：" + Student.room);

        System.out.println("==========================");

        Student two = new Student("黄蓉",17);
        System.out.println("two的姓名：" + two.getName());
        System.out.println("two的年龄：" + two.getAge());
        System.out.println("two的教室：" + Student.room);

    }
}
