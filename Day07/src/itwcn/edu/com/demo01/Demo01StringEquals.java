package itwcn.edu.com.demo01;

/**
 * @program: Demo01StringEquals
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 21:41
 **/

/**
 * == �ǽ��ж���ĵ�ֵַ���бȽϵģ����ȷʵ��Ҫ�ַ��������ݱȽϣ�����ʹ������������
 * public boolean equals(Object obj):�����������κζ���ֻ�в�����һ���ַ�������������ͬ�Ż��һ��true�����򷵻�ֵ��false
 * ע�����
 * 1.�κζ�������Object���н��ա�
 * 2.equals�������жԳ��ԣ�Ҳ����a.equals(b)��b.equals(a)Ч��һ��
 * 3.����Ƚ�˫��һ��������һ���������Ƽ��ѳ����ַ���д��ǰ��
 * �Ƽ���"abc".equals(str)             ���Ƽ���str.equals("abc")
 *
 *
 * public boolean equalIgnoreCase(String str):���Դ�Сд���������ݵıȽϡ�
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
        //�Ƽ�
        System.out.println("abc".equals(str5));
        //���Ƽ�
        System.out.println(str5.equals("abc"));


        System.out.println("==================");
        String strA = "java";
        String strB = "Java";
        //false���ϸ����ִ�Сд
        System.out.println(strA.equals(strB));
        //true,�����ִ�Сд
        System.out.println(strA.equalsIgnoreCase(strB));
        //ע�⣺ֻ����Ӣ�Ĵ�Сд������Ϊfalse
        System.out.println("һabc".equalsIgnoreCase("Ҽabc"));
    }
}
