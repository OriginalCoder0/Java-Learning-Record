package com.itwcn.demo07;

/**
 * @program: Demo01Array
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/28 23:21
 **/

/**
 * ��Ŀ
 * ����һ�����飬�����洢3��Person����
 *
 * ������һ��ȱ�㣬һ�����������������ڼ䳤�Ȳ����Է����ı�
 * ��ô����ʹ��ArrayList���ı�����ĳ���
 */
public class Demo01Array {
    public static void main(String[] args) {
        //���ȴ���һ������Ϊ3�����飬�����������Person ���͵Ķ���
        Person[] array = new Person[3];
        Person one = new Person("����",18);
        Person two = new Person("����",20);
        Person three = new Person("��ţ",25);

        //��one�ĵ�ַ��ֵ��0��Ԫ��λ��
        array[0] = one;
        array[1] = two;
        array[2] = three;
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
            System.out.println(array[i].getName() + array[i].getAge());
        }

    }
}
