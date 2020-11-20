package itwcn.edu.com.demo04;

/**
 * @program: Demo03Math
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/19 17:25
 **/

/**
 * java.util.Math������ѧ��صĹ����࣬�����ṩ�˴����ľ�̬�������������ѧ��صĲ���
 *
 * public static double abs(double number),��ȡ����ֵ��
 * public static double ceil(double number),����ȡ����
 * public static double floor(double number),����ȡ����
 * public static long round(double number),��������
 *
 * Math.PI������Ƶ�Բ���ʳ���
 */
public class Demo03Math {
    public static void main(String[] args) {
        //��ȡ����ֵ
        System.out.println(Math.abs(3.14));     //3.14
        System.out.println(Math.abs(0));        //0
        System.out.println(Math.abs(-10.5));    //10.5
        System.out.println("==================");

        //����ȡ��
        System.out.println(Math.ceil(3.9));     //4.0
        System.out.println(Math.ceil(3.1));     //4.0
        System.out.println(Math.ceil(3.0));     //3.0
        System.out.println("==================");

        //����ȡ��
        System.out.println(Math.floor(3.1));    //3.0
        System.out.println(Math.floor(3.9));    //3.0
        System.out.println(Math.floor(3.0));    //3.0
        System.out.println("=================");

        //��������
        System.out.println(Math.round(20.4));   //20.0
        System.out.println(Math.round(11.5));   //12.0
    }
}
