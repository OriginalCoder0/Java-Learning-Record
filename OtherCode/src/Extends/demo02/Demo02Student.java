package Extends.demo02;
/**
 * @program: Demo02Student
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 21:40
 **/

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();    //类名称就是构造方法名，这一步就是构造方法的使用(无参构造)

        Student stu2 = new Student("菜鸟",20);    //(全参构造)
        System.out.println("姓名：" + stu2.getName() + ",年龄：" + stu2.getAge());

        //如果需要改变对象当中的成员变量数据内容，仍然需要使用setXxx方法
        stu2.setAge(21);
        System.out.println("姓名：" + stu2.getName() + ",年龄：" + stu2.getAge());
    }
}
