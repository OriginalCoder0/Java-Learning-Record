package Extends.demo04;
/**
 * @program: Demo01ScannerSum
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 23:41
 **/

import java.util.Scanner;

/**
 * ��Ŀ��������������int���֣����������
 * ˼·:
 * 1.Scanner:������������ʹ��
 * 2.�������֣���������
 * 3.�õ��������֣����ӷ�
 * 4.��ӡ���
 */
public class Demo01ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�����������֣�");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("a+b=" + sum);
    }
}
