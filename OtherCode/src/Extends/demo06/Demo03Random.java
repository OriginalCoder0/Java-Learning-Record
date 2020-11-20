package Extends.demo06;

/**
 * @program: Demo03Random
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/28 22:28
 **/

import java.util.Random;
import java.util.Scanner;

/**
 * 题目要求：
 * 根据int变量n的值，来获取随机数据，范围是1~n;
 * 思路：
 * 1.定义一个int变量n,随意赋值
 * 2.要使用Random：三个步骤：导包、创建、使用
 * 3.如果写上10，那就是0~9,可以发现整体+1即可
 * 4.打印随机数字
 */

public class Demo03Random {
    public static void main(String[] args) {
        System.out.println("请输入一个数字n：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            //范围是0~n,所以+1,本来的范围是[0,n),+1之后就变成了[1,n+1)
            int result = r.nextInt(n)+1;
            System.out.println(result);
        }
    }
}
