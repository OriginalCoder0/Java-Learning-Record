package com.itwcn.demo07;

import java.util.ArrayList;

/**
 * @program: Demo04ArrayListEach
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 10:13
 **/

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("�����Ȱ�");
        list.add("��������");
        list.add("������");

        //��������
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //list.fori  ��ݼ�
//        for (int i = 0; i < list.size(); i++) {
//
//        }
    }
}
