package itwcn.edu.com.demo02;

/**
 * @program: Demo07StringCount
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 17:24
 **/

import java.util.Scanner;

/**
 * 题目：键盘输入一个字符串，并且统计其中各种字符出现的次数。种类有：大小写字母，数字，其他
 * 思路：
 * 1.键盘输入，用到Scanner类
 * 2.键盘输入字符串，那么，String str = sc.next();
 * 3.定义四种变量，分别代表四种字符出现的字数。
 * 4.需要对字符串一个字，一个检查。String->char[],方法就是toCharArray()
 * 5.遍历char[]字符数组，对当前字符的种类进行判断，并且用四个变量自加
 * 6.打印输出四个变量，分别代表四种字符出现的字数，
 *
 * @author 王佳涵
 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        //获取键盘输入的字符串
        String str = sc.next();

        int countUpper = 0;     //大写字母
        int countLower = 0;     //小写字母
        int countNumber = 0;    //数字
        int countOther = 0;     //其他字母

        char[] charArray= str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch  = charArray[i];    //当前单个字符
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("大字母个数= " + countUpper);
        System.out.println("小字母个数= " + countLower);
        System.out.println("数字字母个数= " + countNumber);
        System.out.println("其他字母个数= " + countOther);
    }
}
