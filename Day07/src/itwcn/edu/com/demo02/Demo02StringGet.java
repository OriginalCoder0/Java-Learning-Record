package itwcn.edu.com.demo02;

/**
 * @program: Demo01StringGet
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 23:02
 **/

/**
 * String ���л�ȡ��صĳ��÷�����
 * public int length():��ȡ�ַ������к��е��ַ��������õ��ַ�������
 * public String concat(String str):����ǰ�ַ����Ͳ����ַ���ƴ�ӳ�Ϊ����ֵ�µ��ַ�����
 * public char charAt(int index):��ȡָ������λ�õĵ����ַ�����������0��ʼ��
 * public int indexOf(String str):���Ҳ����ַ����ڱ��ַ��������״γ��ֵ�λ�ã����û�У��򷵻�-1ֵ��
 *
 *
 * @author ���Ѻ�
 */
public class  Demo02StringGet {
    public static void main(String[] args) {
        //��ȡ�ַ����ĳ���
        int length = "afaksnfjksdhaohfsfahos".length();
        System.out.println("�ַ����ĳ��ȣ�" + length);

        //ƴ���ַ���
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        /**ƴ���ַ���**/
        System.out.println(str3);

        System.out.println("=========");

        //��ȡָ������λ�õĵ����ַ�
        char ch = "Hello".charAt(1);
        System.out.println("��1������λ�õ��ַ��ǣ�" + ch);

        System.out.println("=========");

        //���Ҳ����ַ�����ԭ���ַ������е�һ�γ��ֵ�����λ��
        //�������û�У��򷵻�-1ֵ
        String origin = "Hello World";
        int index = origin.indexOf("llo");
        System.out.println("��һ������ֵ�ǣ�" + index);
    }
}
