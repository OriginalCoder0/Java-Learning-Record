package com.itwcn.demo06;

/**
 * @program: Demo04Random
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/28 22:57
 **/

import java.util.Random;
import java.util.Scanner;

/**
 * �ô���ģ������ֵ�С��Ϸ
 * ˼·��
 * ������Ҫ����һ����������֣����Ҳ����ٷ����仯����Random��nextInt()����
 * ��Ҫ�������룬������Ҫ�õ�Scanner
 * ��ȡ������������֣���Scanner��nextInt()����
 * �Ѿ��õ����������֣�������ͼ�����������֣���Ҫ�ж�һ��
 *      ����������̫����ʾ̫�󣬲�����
 *      ����������̫С����ʾ̫С��������
 *      ��������ˣ���Ϸ������
 *      ���Ծ���������һ�飬ѭ��������ȷ������while(true)
 *
 */
public class Demo04Random {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1; //[1,100];�����+1,�Ǿ���0-99
        Scanner sc = new Scanner(System.in);
//        while (true) {
        for (int i = 0; i < 10; i++) {  //���ƴ���
            System.out.println("��������²�����֣�");
            int guessNum = sc.nextInt();
            if(randomNum < guessNum) {
                System.out.println("̫���ˣ�������");
            } else if (randomNum > guessNum) {
                System.out.println("̫С�ˣ�������");
            } else {
                System.out.println("�²����");
                break;  //������У���������
            }
        }

//        }
        System.out.println("�㳢�ԵĴ���̫���ˣ���Ϸ����");
    }
}
