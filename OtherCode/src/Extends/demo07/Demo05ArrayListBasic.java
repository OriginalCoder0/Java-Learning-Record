package Extends.demo07;


import java.util.ArrayList;

/**
 * @program: Demo05ArrayListBasic
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 10:18
 **/

/*
    ��JDK 1.5��ʼ��֧���Զ�װ�䣬�Զ�����

    �Զ�װ�䣺��������--->�������ͣ���װ���ͣ�
    �Զ����䣺��װ����--->��������
 */

/**
 * ���ϣ���򼯺�ArrayList���д洢�����������ͣ�����ʹ�û������Ͷ�Ӧ�ġ���װ�ࡰ
 *
 * ��������             ��װ��(�������ͣ���װ�඼λ��java.lang����)
 * byte                Byte
 * short               Short
 * int                 Integer          �����⡿
 * float               Float
 * double              Double
 * char                Character         �����⡿
 * boolean             Boolean
 *
 */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        //�����Ǵ���д��������ֻ�����������ͣ������ǻ�������
//        ArrayList<int> listB = new ArrayList<>();

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC);
        //[100,200]

        int num = listC.get(1);
        System.out.println("��1��Ԫ���ǣ� "+num);
    }
}
