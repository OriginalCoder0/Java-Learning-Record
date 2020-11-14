package itwcn.edu.com.demo01;

/**
 * @program: Demo01String
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 20:42
 **/

/**
 * 字符串的特点：
 * 1.字符串的内容永不改变
 * 2.正是字符串的内容永不改变，所以字符串是可以共享使用的
 * 3.字符串的效果上相当于是char[]的字符数组，但是底层原理是byte[]数组
 *
 * 创建字符串的常用3+1种方式。
 * 三种构造方法：
 * public String : 创建一个空白字符串，不含有任何内容。
 * public String(char[] array):根据字符数组的内容，来创建对应的字符串。
 * public String(byte[] array):根据字节数组的内容，来创建对应的字符串。
 *
 * 一种直接创建:
 * String str = "Hello world!"      //右边直接用双引号
 *
 * 注意：直接写上双引号，就是字符串对象。
 * @author 王佳涵
 */

public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        //小括号留空，说明字符串什么内容都没有。
        System.out.println("第一个字符串是：" + str1);


        //根据字符数组创建字符串
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串是：" + str2);


        //根据字节数组创建字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串是：" + str3);

        //直接创建
        String str4 = "Hello";
        System.out.println("第四个字符串是：" + str4);
    }
}
