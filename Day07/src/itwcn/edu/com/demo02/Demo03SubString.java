package itwcn.edu.com.demo02;

/**
 * @program: Demo03SubString
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 11:02
 **/

/**
 * 字符串的截取方法：
 * public String substring(int index):截取从参数位置一直到字符串末尾，返回新字符串
 * public String substring(int begin,int end):截取一个范围，从begin开始，一直到end结束，中间的字符串
 * 备注：[begin,end):包含左边，不包含右边，左闭右开。
 * @author 王佳涵
 */
public class Demo03SubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("==============");

        //截取oWo
        String str3 = str1.substring(4,7);
        System.out.println(str3);

        String strA = "Hello";
        System.out.println(strA);
        strA = "Java";
        System.out.println(strA);
    }
}
