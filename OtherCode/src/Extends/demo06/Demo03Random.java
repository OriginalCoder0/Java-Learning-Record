package Extends.demo06;

/**
 * @program: Demo03Random
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/28 22:28
 **/

import java.util.Random;
import java.util.Scanner;

/**
 * ��ĿҪ��
 * ����int����n��ֵ������ȡ������ݣ���Χ��1~n;
 * ˼·��
 * 1.����һ��int����n,���⸳ֵ
 * 2.Ҫʹ��Random���������裺������������ʹ��
 * 3.���д��10���Ǿ���0~9,���Է�������+1����
 * 4.��ӡ�������
 */

public class Demo03Random {
    public static void main(String[] args) {
        System.out.println("������һ������n��");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            //��Χ��0~n,����+1,�����ķ�Χ��[0,n),+1֮��ͱ����[1,n+1)
            int result = r.nextInt(n)+1;
            System.out.println(result);
        }
    }
}
