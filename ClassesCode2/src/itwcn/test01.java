package itwcn;

/**
 * @program: test01
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/20 11:01
 **/

import java.util.Scanner;	//������˵ķ�����

/**
 * ���ò�����
 * @author OriginalCoder
 *
 */
public class test01 {

    /**
     * �ĵ�ע��
     * @param args ��������
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /**
         * Today Goal!
         * ��ע�ͣ���������������������Ϣ
         * �����û�����ĳɼ����֣��жϣ�
         * ���㡢���á����񡢲�����
         * ���Ҵ�ӡ������̨
         */
        int a = 18;
        long b = a;//�Զ�����ת����С����ת������

        //��final�����峣��
        final float PI;			//5.8Ĭ��Ϊdouble����
        //�������ͱ��������𣺳���ֻ�ܸ�ֵһ�Σ��������Ը�ֵ���

        PI = 3.14F;
        a = 18;
        System.out.println("fr=" + PI);

        boolean bA = true;			//true:�߼�����1����ʾ�棻false:�߼���������ʾ��
        Scanner scA = null;			//null:����������ʾû�����ö���

        boolean bR = (a>10) ^ (bA);//bA�ȼ���(bA == true)
        System.out.println("bR=" + bR);

        //λ�����
        byte c = (byte)-8;
        byte d = (byte)(c>>2);
        System.out.println("d=" + d);

        //��Ŀ�����
        int store = 0;
        System.out.println(store <= 0 ? "û�п������" : "�����Ϊ��" + store);
    }

}
