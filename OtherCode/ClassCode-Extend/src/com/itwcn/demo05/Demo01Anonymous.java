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
        // 普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//
//        //匿名对象的方式
//        int num2 = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num2);

        //使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

//        //匿名对象的方式传入参数
//        methodParam(new Scanner(System.in));


        //带返回值的传入参数
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
