package com.itwcn.demo08;

/**
 * @program: Demo01ArrayListRandom
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 10:31
 **/

import java.util.ArrayList;
import java.util.Random;

/**
 * ��Ŀ��
 * ����6��1-33֮��������������ӵ����ϣ�����������
 *
 * ˼·��
 * 1.��Ҫ�洢6�����֣�����һ�����ϣ�<Integer>
 * 2.�������������Ҫ�õ�Random
 * 3.��ѭ��6�Σ�����6��������֣�forѭ��
 * 4.ѭ���ڵ���r.nextInt(int n)      ,������33��0-32������+1����33
 * 5.��������ӵ����ϵ��У�add
 * 6.�������ϣ�forѭ����size(),get()
 *
 */

public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1 ;
            list.add(num);
        }
        //��������
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
