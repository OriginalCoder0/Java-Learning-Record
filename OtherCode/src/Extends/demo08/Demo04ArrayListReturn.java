package Extends.demo08;

/**
 * @program: Demo04ArrayListReturn
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 15:57
 **/

import java.util.ArrayList;
import java.util.Random;

/**
 * ��Ŀ��
 * ��һ���󼯺ϴ���20��������֣�ɸѡ���е�ż����Ԫ�أ�����С������
 * Ҫ��ʹ���Զ���ķ�������ɸѡ
 *
 * ������
 * 1.��Ҫ����һ�����ϣ������洢int���֣�<Integer>
 * 2.������֣�Random  nextInt
 * 3.ѭ��20�Σ���������ַ���󼯺��У�forѭ��,add����
 * 4.����һ����������������ɸѡ
 * ɸѡ�����ݴ󼯺ϣ�ɸѡ����Ҫ���Ԫ�أ��õ�С����
 * ��Ҫ�أ�
 * ����ֵ���ͣ�       ArrayListС���ϣ�����Ԫ�ظ�����ȷ����
 * ��������:         getSmallList
 * �����б�:         ArrayList�󼯺ϣ�װ��20��������֣�
 * 5.�жϣ�if����ż����num%2 == 0
 * 6.�����ż�����ͷ���С���ϵ��У����򲻷�
 *
 * @author ���Ѻ�
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            // 0~99   ,����+1 ����ʾ 1~100
            bigList.add(num);
        }
        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("ż���ܹ��У�" + smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }

    }


    /**������������ܴ󼯺ϲ���������С���Ͻ��**/
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        //����һ��С���ϣ�����װż�����
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }
}
