package Extends.demo04;
/**
 * @program: Demo01ScannerSum
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 23:41
 **/

import java.util.Scanner;

/**
 * 题目：键盘输入两个int数字，并且求其和
 * 思路:
 * 1.Scanner:导包、创建、使用
 * 2.两个数字，调用两次
 * 3.得到两个数字，做加法
 * 4.打印输出
 */
public class Demo01ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入两个数字：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("a+b=" + sum);
    }
}
