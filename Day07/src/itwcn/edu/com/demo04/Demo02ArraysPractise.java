package itwcn.edu.com.demo04;

/**
 * @program: Demo02ArraysPractise
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/19 16:59
 **/

import java.util.Arrays;

/**
 * ��ʹ��Arrays��ص�API����һ������ַ����е������ַ����������У��������ӡ
 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "afajhbfjkbfjkankla";

        //��ν������У�sort
        //������һ�����飬������Arrays.sort����
        //String  -->���飬��toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);     //���ַ����������������

        //��Ҫ�������
        //С���ɣ�chars.forr
//        for (int i = chars.length - 1; i >= 0; i--) {
//
//        }
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
