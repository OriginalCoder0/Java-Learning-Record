package com.itwcn.demo05;

import com.itwcn.demo02.Person;

import java.util.Scanner;

/**
 * @program: Demo01Anonymous
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/28 17:39
 **/

public class Demo01Anonymous {
    public static void main(String[] args) {
        // ��ͨʹ�÷�ʽ
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//
//        //��������ķ�ʽ
//        int num2 = new Scanner(System.in).nextInt();
//        System.out.println("������ǣ�" + num2);

        //ʹ��һ��д���������
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

//        //��������ķ�ʽ�������
//        methodParam(new Scanner(System.in));


        //������ֵ�Ĵ������
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("������ǣ�" + num);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("������ǣ�" + num);
    }

    public static Scanner methodReturn() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
