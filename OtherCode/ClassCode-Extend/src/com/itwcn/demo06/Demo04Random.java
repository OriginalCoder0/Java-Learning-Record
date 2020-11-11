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
 * 用代码模拟猜数字的小游戏
 * 思路：
 * 首先需要产生一个随机的数字，并且不能再发生变化，用Random的nextInt()方法
 * 需要键盘输入，所以需要用到Scanner
 * 获取键盘输入的数字，用Scanner的nextInt()方法
 * 已经得到了两个数字，随机数和键盘输入的数字，需要判断一下
 *      如果输入的数太大，提示太大，并重试
 *      如果输入的数太小，提示太小，并重试
 *      如果猜中了，游戏结束！
 *      重试就是重新来一遍，循环次数不确定，用while(true)
 *
 */
public class Demo04Random {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1; //[1,100];如果不+1,那就是0-99
        Scanner sc = new Scanner(System.in);
//        while (true) {
        for (int i = 0; i < 10; i++) {  //限制次数
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt();
            if(randomNum < guessNum) {
                System.out.println("太大了！请重试");
            } else if (randomNum > guessNum) {
                System.out.println("太小了！请重试");
            } else {
                System.out.println("猜测对了");
                break;  //如果猜中，不再重试
            }
        }

//        }
        System.out.println("你尝试的次数太多了，游戏结束");
    }
}
