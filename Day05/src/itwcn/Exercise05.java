package itwcn;

import java.util.Scanner;

/**
 * @program: Day05
 * @description: 学习API接口的使用，求输入三个数的最值
 * @author: OriginalCoder
 * @create: 2020-10-07 22:34
 **/
public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int a = scanner.nextInt();
        System.out.println("输入第二个数：");
        int b = scanner.nextInt();
        System.out.println("输入第三个数");
        int c = scanner.nextInt();

        //获取三个数的最大值
        int temp = (a>b?a:b);
        int max = (temp>c?temp:c);

        System.out.println("max:" + max);

    }
}
