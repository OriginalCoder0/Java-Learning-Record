package itwcn.edu.com.demo01;

/**
 * @program: Demo01String
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 20:42
 **/

/**
 * �ַ������ص㣺
 * 1.�ַ��������������ı�
 * 2.�����ַ��������������ı䣬�����ַ����ǿ��Թ���ʹ�õ�
 * 3.�ַ�����Ч�����൱����char[]���ַ����飬���ǵײ�ԭ����byte[]����
 *
 * �����ַ����ĳ���3+1�ַ�ʽ��
 * ���ֹ��췽����
 * public String : ����һ���հ��ַ������������κ����ݡ�
 * public String(char[] array):�����ַ���������ݣ���������Ӧ���ַ�����
 * public String(byte[] array):�����ֽ���������ݣ���������Ӧ���ַ�����
 *
 * һ��ֱ�Ӵ���:
 * String str = "Hello world!"      //�ұ�ֱ����˫����
 *
 * ע�⣺ֱ��д��˫���ţ������ַ�������
 * @author ���Ѻ�
 */

public class Demo01String {
    public static void main(String[] args) {
        //ʹ�ÿղι���
        String str1 = new String();
        //С�������գ�˵���ַ���ʲô���ݶ�û�С�
        System.out.println("��һ���ַ����ǣ�" + str1);


        //�����ַ����鴴���ַ���
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("�ڶ����ַ����ǣ�" + str2);


        //�����ֽ����鴴���ַ���
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("�������ַ����ǣ�" + str3);

        //ֱ�Ӵ���
        String str4 = "Hello";
        System.out.println("���ĸ��ַ����ǣ�" + str4);
    }
}
