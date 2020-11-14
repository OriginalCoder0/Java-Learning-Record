package itwcn.edu.com.demo01;

/**
 * @program: Demo02StringPool
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 21:11
 **/

/**
 * 字符串常量池，程序当中直接写上的双引号字符，就在字符串常量池中。
 *
 * 对于基本类型，==是进行数值的比较
 * 对于应用类型，==是进行【地址值】的比较
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
    }
}
