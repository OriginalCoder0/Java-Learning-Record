package com.itwcn.demo04;

/**
 * @program: Demo01Scanner
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 23:17
 **/

import java.util.Scanner;

/**
 * Scanner��Ĺ��ܣ�����ʵ�ּ����������ݣ���������
 * Ӧ�����͵�һ��ʹ�ò��裺
 * 1.����
 * import ��·��.�����ƣ�
 *      �����Ҫʹ�õ�Ŀ���࣬�͵�ǰ��λ��ͬһ�����£������ʡ�Ե�����䲻д
 *      ֻ��java.lang���µ����ݲ���Ҫ����������������Ҫimport���
 * 2.����
 *      ������ ������ = new ������();
 * 3.ʹ��
 *      ������.��Ա������()
 *   ��ȡ���������һ��int���֣�int num = sc.nextInt();
 *   ��ȡ���������һ���ַ�����String str = sc.next();
 *
 * */
public class Demo01Scanner {

    public static void main(String[] args) {
        //2.����
        //��ע��System.in����Ӽ�������
        Scanner sc = new Scanner(System.in);
        //3.��ȡ���������int����
        int num = sc.nextInt();
        String str = sc.next();
        System.out.println("��ȡ����һ��int���֣�" + num + ",��ȡ�����ַ�����" + str);
    }
}
