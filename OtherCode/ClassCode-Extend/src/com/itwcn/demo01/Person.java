package com.itwcn.demo01;

/**
 * @program: Person
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 20:14
 **/

/**
 * ��������������Person����ʱ���޷���ֹ���������ֵ�����ý�����
 * �����������private�ؼ��ֽ���Ҫ�����ĳ�Ա������������
 *
 * һ������private�������Σ���ô���൱����Ȼ����������ʣ�
 * ���ǳ������෶Χ֮�⣬�Ͳ���ֱ�ӷ���
 *
 * ��ӷ���private��Ա���������Ƕ���һ��Getter/Setter����
 */
public class Person {
    String name;        //����
    private int age;    //����

    public int getAge() {
        return age;
    }

    //�����Ա������ר��������age��������
    public void setAge(int num) {
        if(num < 100 && num >= 0) {
            this.age = num;
        } else {
            System.out.println("���ݲ��Ϸ���");
        }
    }

    public  void show() {
        System.out.println("���ǣ�" + name + ",����" + age);
    }

}
