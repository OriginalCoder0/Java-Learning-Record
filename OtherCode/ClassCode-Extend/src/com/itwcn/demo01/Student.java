package com.itwcn.demo01;

/**
 * @program: Student
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 20:37
 **/

/**
 * ���ڻ������͵��е�booleanֵ��Getter����һ��Ҫд��isXxx��Setter��������
 */
public class Student {
    private String name;    //����
    private int age;        //����
    private boolean male;   //�Ա�

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

    public boolean isMale() {
        return male;
    }
    public void setMale(boolean male) {
        this.male = male;
    }


}
