package itwcn;

import java.util.Scanner;

/**
 * @program: TestCode
 * @description: 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * @author: OriginalCoder
 * @create: 2020-09-17 10:09
 **/
public class Exercise04 {
    public static void main(String[] args) {
        System.out.println("请输入需要分解因数的整数：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();//获取输入的整数
        decompose(a);
    }

    public static void decompose(int num) {
        int tmp = num/2;
        for (int i = 2; i < tmp; i++) {
            if (num%i == 0) {
                num = num/i;
                System.out.println("质因数为:"+i);
                i = 1;
                continue;
            }
        }
    }
}
