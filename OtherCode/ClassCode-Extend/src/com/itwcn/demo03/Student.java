package com.itwcn.demo03;

/**
 * @program: Student
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 22:41
 **/

/**
 * һ����ͨ����ͨ���������ĸ���ɲ���:
 * 1.���еĳ�Ա������Ҫʹ��private�ؼ���������
 * 2.Ϊÿһ����Ա������дһ��Getter/Setter����
 * 3.��дһ���޲����Ĺ��췽��
 * 4.��дһ��ȫ�����Ĺ��췽��
 */

public class Student {

    private int age;        //����
    private String name;    //����
    public Student() {
    }
    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

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

}
