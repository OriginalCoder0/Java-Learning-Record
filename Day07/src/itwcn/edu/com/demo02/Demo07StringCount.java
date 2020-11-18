package itwcn.edu.com.demo02;

/**
 * @program: Demo07StringCount
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 17:24
 **/

import java.util.Scanner;

/**
 * ��Ŀ����������һ���ַ���������ͳ�����и����ַ����ֵĴ����������У���Сд��ĸ�����֣�����
 * ˼·��
 * 1.�������룬�õ�Scanner��
 * 2.���������ַ�������ô��String str = sc.next();
 * 3.�������ֱ������ֱ���������ַ����ֵ�������
 * 4.��Ҫ���ַ���һ���֣�һ����顣String->char[],��������toCharArray()
 * 5.����char[]�ַ����飬�Ե�ǰ�ַ�����������жϣ��������ĸ������Լ�
 * 6.��ӡ����ĸ��������ֱ���������ַ����ֵ�������
 *
 * @author ���Ѻ�
 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ�����");
        //��ȡ����������ַ���
        String str = sc.next();

        int countUpper = 0;     //��д��ĸ
        int countLower = 0;     //Сд��ĸ
        int countNumber = 0;    //����
        int countOther = 0;     //������ĸ

        char[] charArray= str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch  = charArray[i];    //��ǰ�����ַ�
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("����ĸ����= " + countUpper);
        System.out.println("С��ĸ����= " + countLower);
        System.out.println("������ĸ����= " + countNumber);
        System.out.println("������ĸ����= " + countOther);
    }
}
