package itwcn;

/**
 * @program: Runoob
 * @description:学习静态变量，使用static关键字
 * @author: OriginalCoder
 * @create: 2020-10-03 21:04
 **/
/*
静态变量可以使用以下方法来访问：
类名.变量名
 */
class Student {
    static String schoolName;
}
public class Example06 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();            //创建学生对象
        Student.schoolName = "华中科技大学";      //为静态变量赋值
        System.out.println("我是" + stu1.schoolName + "的学生");
        System.out.println("我是" + stu2.schoolName + "的学生");
    }
}
