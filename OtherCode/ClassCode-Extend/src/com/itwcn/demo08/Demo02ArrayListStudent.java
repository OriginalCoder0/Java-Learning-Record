package com.itwcn.demo08;

/**
 * @program: Demo02ArrayListStudent
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 10:43
 **/

import java.util.ArrayList;

/**
 * ��Ŀ���Զ���4��ѧ��������ӵ����ϣ�������
 *
 * ˼·��
 * 1.�Զ���Studentѧ���࣬�ĸ����֡�
 * 2.�������ϣ������洢ѧ�����󣬷��ͣ�Student����
 * 3.�����࣬����4��Student����
 * 4.��4��ѧ��������ӵ�������
 * 5.�������ϣ�for,size,get
 *
 *
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student a = new Student("С����",20);
        Student b = new Student("�����",22);
        Student c = new Student("�ϲ���",21);
        Student d = new Student("�޲���",24);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        
        //��������
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("������" + stu.getName() + ",���䣺" + stu.getAge());
        }
    }

}
