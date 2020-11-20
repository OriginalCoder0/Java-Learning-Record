package Extends.demo07;


/**
 * @program: Demo03ArrayListMethod
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/11 9:53
 **/

import java.util.ArrayList;

/**
 * ArrayList���г��õķ����У�
 * public boolean add(E e):�򼯺������Ԫ�أ����������ͺͷ���һ�¡�
 * ��ע������ArrayList������˵��add��Ӷ���һ���ǳɹ��ģ����Է���ֵ�����ÿ��Բ���
 * public E get(int index)���Ӽ����л�ȡԪ�أ�������������ţ�����ֵ���Ƕ�Ӧλ�õ�Ԫ�ء�
 * public E remove(int index):�Ӽ�����ɾ��Ԫ�أ�������������ţ�����ֵ���Ǳ�ɾ������Ԫ��
 * public int size:��ȡ���ϵĳߴ糤�ȣ�����ֵ�Ǽ����а�����Ԫ�ظ���
 * @author ���Ѻ�
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        //�򼯺������Ԫ��
        boolean success = list.add("����");
        System.out.println(list);
        System.out.println("��ӵĶ����Ƿ�ɹ���" + success);
        //true

        list.add("����");
        list.add("��ţ");
        System.out.println(list);
        //[����, ����, ��ţ]

        //�Ӽ����л�ȡԪ��:get������ֵ��0��ʼ
        String name = list.get(1);
        System.out.println("��һ������ֵ�ǣ�" + name);

        // �Ӽ�����ɾ��Ԫ�أ�remove������ֵ��0��ʼ
        String whoRemoved = list.remove(1);
        System.out.println("��ɾ�������ǣ�" + whoRemoved);
        System.out.println(list);

        //��ȡ���ϵĳ��ȣ�Ҳ����Ԫ�صĸ���
        int size = list.size();
        System.out.println("���ϵĳ����ǣ�" + size);
    }
}
