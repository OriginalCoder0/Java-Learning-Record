package Extends.demo04;

/**
 * @program: Demo01ScannerMax
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 23:47
 **/

import java.util.Scanner;

/**
 * ��Ŀ���Ӽ�����������int���֣�Ȼ��������е����ֵ
 * ˼·��Scanner��������������ʹ��
 */
public class Demo01ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������������֣�");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = a>b?a:b;
        int max = temp>c?temp:c;
        System.out.println("���ֵ��" + max);
    }
}
