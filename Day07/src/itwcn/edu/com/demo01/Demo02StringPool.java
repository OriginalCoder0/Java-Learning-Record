package itwcn.edu.com.demo01;

/**
 * @program: Demo02StringPool
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 21:11
 **/

/**
 * �ַ��������أ�������ֱ��д�ϵ�˫�����ַ��������ַ����������С�
 *
 * ���ڻ������ͣ�==�ǽ�����ֵ�ıȽ�
 * ����Ӧ�����ͣ�==�ǽ��С���ֵַ���ıȽ�
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
