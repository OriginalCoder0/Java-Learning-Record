package Extends.demo06;

/**
 * @program: Demo01Random
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/28 18:03
 **/

import java.util.Random;

/**
 * Random����������������֣�ʹ��������Ȼ����������
 * 1.����
 *      import java.util.Random
 * 2.����
 *      Random r = new Random();
 * 3.ʹ��
 *      ��ȡһ�������int����(��Χ��int���з�Χ������������)��r.nextInt()
 *      ��ȡһ�������int����(���������˷�Χ������ҿ�����)��int num = r.nextInt(3)
 *      ʵ�ʴ���ĺ��壺[0,3)
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("������ǣ�" + num);
    }
}
