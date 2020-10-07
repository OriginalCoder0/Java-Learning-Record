package itwcn;

import java.util.Scanner;

/**
 * @program: Day05
 * @description: 学习Application Programming Interface，API接口方法的使用，Scanner类、Random类、ArrayList类
 * @author: OriginalCoder
 * @create: 2020-10-07 22:24
 **/
public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int a = scanner.nextInt();
        System.out.println("输入第二个数：");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("sum:" + sum);


    }
}
