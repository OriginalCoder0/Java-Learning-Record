package Extends.demo04;

/**
 * @program: Demo01ScannerMax
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 23:47
 **/

import java.util.Scanner;

/**
 * 题目：从键盘输入三个int数字，然后求出其中的最大值
 * 思路：Scanner：导包、创建、使用
 */
public class Demo01ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入是三个数字：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = a>b?a:b;
        int max = temp>c?temp:c;
        System.out.println("最大值：" + max);
    }
}
