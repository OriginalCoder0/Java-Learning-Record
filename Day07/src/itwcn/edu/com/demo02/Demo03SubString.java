package itwcn.edu.com.demo02;

/**
 * @program: Demo03SubString
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 11:02
 **/

/**
 * �ַ����Ľ�ȡ������
 * public String substring(int index):��ȡ�Ӳ���λ��һֱ���ַ���ĩβ���������ַ���
 * public String substring(int begin,int end):��ȡһ����Χ����begin��ʼ��һֱ��end�������м���ַ���
 * ��ע��[begin,end):������ߣ��������ұߣ�����ҿ���
 * @author ���Ѻ�
 */
public class Demo03SubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("==============");

        //��ȡoWo
        String str3 = str1.substring(4,7);
        System.out.println(str3);

        String strA = "Hello";
        System.out.println(strA);
        strA = "Java";
        System.out.println(strA);
    }
}
