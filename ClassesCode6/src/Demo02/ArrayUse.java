package Demo02;

/**
 * @program: ClassCode
 * @description: ��������Ԫ�ؽ��л�ȡ
 * @author: OriginalCoder
 * @create: 2020-10-20 21:28
 **/

/**
 * ʹ�ö�̬��ʼ�������ʱ�����е�Ԫ�ؽ����Զ�ӵ��һ��Ĭ��ֵ���������£�
 * ����������ͣ���ôĬ��Ϊ0
 * ����Ǹ����ͣ���ôĬ��Ϊ0.0
 * ������ַ����ͣ���ôĬ��Ϊ��\u0000��
 * ����ǲ������ͣ���ôĬ��Ϊfalse
 * ������������ͣ���ôĬ��Ϊnull
 *
 *
 * ע�����
 * ��̬��ʼ����ʵҲ����Ĭ��ֵ�ģ�ֻ����ϵͳ�Զ����Ͻ�Ĭ��ֵ�滻��Ϊ�˴����ŵ��еľ�����ֵ
 */
public class ArrayUse {
    public static void main(String[] args) {
        //��̬��ʼ����ʡ�Ը�ʽ
        int[] arrayA = {10,20,30};
        System.out.println(arrayA);     //�ڴ��ֵַ
        System.out.println(arrayA[0]);  //10
        System.out.println(arrayA[1]);  //20
        System.out.println(arrayA[2]);  //30
        System.out.println("=======");


        //��̬��ʼ��һ������
        int[] arrayB  = new int[3];
        //������123��ֵ��������arrayB���е�1��Ԫ��
        arrayB[1] = 123;
        System.out.println(arrayB[0]);  //0
        System.out.println(arrayB[1]);  //123
        System.out.println(arrayB[2]);  //0
    }
}







