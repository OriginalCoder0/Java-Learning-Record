package itwcn.edu.com.demo02;

/**
 * @program: Demo01StringGet
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 23:02
 **/

/**
 * String 当中获取相关的常用方法：
 * public int length():获取字符串当中含有的字符个数，拿到字符串长度
 * public String concat(String str):将当前字符串和参数字符串拼接成为返回值新的字符串。
 * public char charAt(int index):获取指定索引位置的单个字符。（索引从0开始）
 * public int indexOf(String str):查找参数字符串在本字符串当中首次出现的位置，如果没有，则返回-1值，
 *
 *
 * @author 王佳涵
 */
public class  Demo02StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "afaksnfjksdhaohfsfahos".length();
        System.out.println("字符串的长度：" + length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        /**拼接字符串**/
        System.out.println(str3);

        System.out.println("=========");

        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch);

        System.out.println("=========");

        //查找参数字符串在原来字符串当中第一次出现的索引位置
        //如果根本没有，则返回-1值
        String origin = "Hello World";
        int index = origin.indexOf("llo");
        System.out.println("第一次索引值是：" + index);
    }
}
