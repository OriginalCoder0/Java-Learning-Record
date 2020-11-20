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
        stu1.setName("迪丽热巴");
        stu1.setAge(25);
        System.out.println("姓名：" + stu1.getName() + ",年龄：" + stu1.getAge());
        System.out.println("===========");

        //一次性赋值
        Student stu2 = new Student("杨紫",23);
        System.out.println("姓名：" + stu2.getName() + ",年龄：" + stu2.getAge());
        stu2.setAge(26);
        System.out.println("姓名：" + stu2.getName() + ",年龄：" + stu2.getAge());
    }
}
