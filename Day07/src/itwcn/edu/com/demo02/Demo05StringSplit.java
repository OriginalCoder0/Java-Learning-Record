package itwcn.edu.com.demo02;

/**
 * @program: Demo05StringSplit
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 11:43
 **/

/**
 * �ָ��ַ����ķ�����
 * public String[] split(String regex):���ղ����Ĺ��򣬽��ַ����и��Ϊ���ɲ���
 * ע�����
 * split�����Ĳ�����ʵ��һ��������ʽ��
 * �������Ӣ�ľ�㡰.�������з֣�����д��\\.����ת���ַ�
 * @author ���Ѻ�
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bb,c";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("==============");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("==============");

        String str3 = "XXX.yyy.zzz";
        String[] array3 = str3.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
