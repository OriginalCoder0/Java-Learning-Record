package itwcn.edu.com.demo02;

/**
 * @program: Demo04StringConvert
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 11:17
 **/

/**
 * String������ת����صĳ��÷����У�
 * public char[] toCharArray():����ǰ�ַ�����ֳ��ַ�������Ϊ����ֵ��
 * public byte[] getBytes():��õ�ǰ�ַ����ײ���ֽ����顣
 * public String replace(CharSequence oldString,CharSequence newString):
 * �����г��ֵ����ַ����滻���µ��ַ����������滻֮��Ľ�����ַ���
 *
 * ��ע��CharSequence��˼����˵���Խ����ַ������͡�
 * @author ���Ѻ�
 */
public class Demo04StringConvert {
    public static void main(String[] args) {
        //ת����Ϊ�ַ�����
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        System.out.println("================");

        //ת����Ϊ�ֽ�����
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String str1 = "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("=================");

        String lang1 = "�᲻���氡�����ү�ģ����ү�ģ����ү��";
        String lang2 = lang1.replace("���ү��","****");
        System.out.println(lang2);
    }
}
