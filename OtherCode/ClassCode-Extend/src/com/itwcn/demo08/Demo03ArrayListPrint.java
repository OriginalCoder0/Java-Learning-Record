package com.itwcn.demo07;

/**
 * @program: DemoArrayListPrint
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 15:27
 **/

import java.util.ArrayList;

/**
 * ��Ŀ��
 * ������ָ����ʽ��ӡ���ϵķ�����ArrayList��Ϊ������ʹ��{}���𼯺ϣ�ʹ��@�ָ�ÿ��Ԫ��
 * ��ʽ����{Ԫ��@Ԫ��@Ԫ��}��
 *
 *
 * system.out.println(list);            [10,20,30]
 * printArrayList(list)                 {10@20@30}
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("���޼�");
        list.add("�Ŵ�ɽ");
        list.add("������");
        list.add("��Զ��");
        System.out.println(list);

        printArrayList(list);
    }


    /**
     *     ���巽������Ҫ�أ�
     *     ����ֵ���ͣ�ֻ�ǽ������㣬��������void
     *     �������ƣ�printArrayList
     *     �����б�ArrayList
     */

    public static void printArrayList(ArrayList<String> list) {
        //{10@20@30}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1) {
                System.out.println(name + "}");
            } else {
                System.out.print(name + "@");
            }
        }
    }

}
