package com.itwcn.demo02;

/**
 * @program: Student
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 21:32
 **/

/**
 * ���췽����ר��������������ķ�����������ͨ��new����������ʱ����ʵ���ǵ��ù��췽����
 * ��ʽ��
 * public �����ƣ��������� �������ƣ� {
 *     ������
 * }
 *
 * ע�����
 * 1.���췽�������Ʊ�����������������ȫһ������СдҲ���뱣��һ��
 * 2.���췽����Ҫд����ֵ���ͣ���void����д
 * 3.���췽������returnһ������ķ���ֵ
 * 4.���û�б�д�κι��캯������ô��������һ��Ĭ�ϵĹ��캯������������ʲô������ִ��
 * public Student() { }
 * 5.һ����д������һ�����췽������ô��������������Ĭ�ϵĹ��캯��
 */
public class Student {

    //��Ա����
    private String name;
    private int age;

    //�޲����Ĺ��췽��
    public Student() {
        System.out.println("�޲ι��췽��ִ���ˣ�");
    }

    public Student(String name,int age) {
        System.out.println("ȫ�ι��췽��ִ���ˣ�");
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

}
