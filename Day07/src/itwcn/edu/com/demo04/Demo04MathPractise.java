package itwcn.edu.com.demo04;

/**
 * @program: Demo04MathPractise
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/19 17:39
 **/

/**
 * ����-10.8��5.9֮�䣬����ֵ����6����С��2.1�������ж��ٸ���
 *
 * ������
 * 1.��Χȷ����forѭ��
 * 2.���λ��-10.8Ӧ��ת����Ϊ-10�����ְ취��
 *      2.1����ʹ��Math.ceil()���������ϣ���������ȡ��
 *      2.2ǿ������ת��Ϊint���Զ���������С��λ
 * 3.ÿһ�����ֶ������������Բ������ʽ��num++,ÿ�ζ���+1
 * 4.�õ�����ֵ��Math.abs()����
 * 5.һ������һ�����֣����ü�����++����ͳ��
 */
public class Demo04MathPractise {
    public static void main(String[] args) {
        int count = 0;      //ͳ�Ʒ���Ҫ�������
        double min = -10.8;
        double max = 5.9;
        //����i��������֮�ڵ���������
        for (int i = (int)min; i < max; i++) {
            int abs = Math.abs(i);      //����ֵ
            if (abs > 6 || abs <2.1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("�ܹ��У�" + count);
    }
}
