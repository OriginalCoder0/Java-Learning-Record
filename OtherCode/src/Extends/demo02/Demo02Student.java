package Extends.demo02;
/**
 * @program: Demo02Student
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 21:40
 **/

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();    //�����ƾ��ǹ��췽��������һ�����ǹ��췽����ʹ��(�޲ι���)

        Student stu2 = new Student("����",20);    //(ȫ�ι���)
        System.out.println("������" + stu2.getName() + ",���䣺" + stu2.getAge());

        //�����Ҫ�ı�����еĳ�Ա�����������ݣ���Ȼ��Ҫʹ��setXxx����
        stu2.setAge(21);
        System.out.println("������" + stu2.getName() + ",���䣺" + stu2.getAge());
    }
}
