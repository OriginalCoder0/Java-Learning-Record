package itwcn.edu.com.demo01;

/**
 * @program: Demo01StringEquals
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 21:41
 **/

/**
 * == 是进行对象的地址值进行比较的，如果确实需要字符串的内容比较，可以使用两个方法：
 * public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同才会给一个true，否则返回值是false
 * 注意事项：
 * 1.任何对象都能用Object进行接收。
 * 2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
 * 3.如果比较双方一个常量，一个变量，推荐把常量字符串写在前面
 * 推荐："abc".equals(str)             不推荐：str.equals("abc")
 *
 *
 * public boolean equalIgnoreCase(String str):忽略大小写，进行内容的比较。
 *
 */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H' ,'e', 'l', 'l' ,'o'};
        String str3 = new String(charArray);

        //true
        System.out.println(str1.equals(str2));
        //true
        System.out.println(str1.equals(str3));
        //true
        System.out.println(str3.equals("Hello"));
        //true
        System.out.println("Hello".equals(str1));

        String str4 = "hello";
        //false
        System.out.println(str1.equals(str4));

        System.out.println("==================");
        String str5 = "abc";
        //推荐
        System.out.println("abc".equals(str5));
        //不推荐
        System.out.println(str5.equals("abc"));


        System.out.println("==================");
        String strA = "java";
        String strB = "Java";
        //false，严格区分大小写
        System.out.println(strA.equals(strB));
        //true,不区分大小写
        System.out.println(strA.equalsIgnoreCase(strB));
        //注意：只区分英文大小写，下面为false
        System.out.println("一abc".equalsIgnoreCase("壹abc"));
    }
}
