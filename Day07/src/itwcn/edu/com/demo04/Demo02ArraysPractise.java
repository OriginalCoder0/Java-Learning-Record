package itwcn.edu.com.demo04;

/**
 * @program: Demo02ArraysPractise
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/19 16:59
 **/

import java.util.Arrays;

/**
 * 请使用Arrays相关的API，将一个随机字符串中的所有字符串升序排列，并倒序打印
 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "afajhbfjkbfjkankla";

        //如何进行排列？sort
        //必须是一个数组，才能用Arrays.sort方法
        //String  -->数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);     //对字符数组进行升序排列

        //需要倒序遍历
        //小技巧：chars.forr
//        for (int i = chars.length - 1; i >= 0; i--) {
//
//        }
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
