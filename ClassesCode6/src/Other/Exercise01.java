package other;

/**
 * @program: ClassCode
 * @description: ѧϰ�ж���ֵ�Ƿ�һ��
 * @author: OriginalCoder
 * @create: 2020-10-20 18:37
 **/
public class Exercise01 {
    public static void main(String[] args) {
        System.out.println(isSame(5,9));
    }
    /**
     * ��Ҫ�أ�
     * ����ֵ���ͣ�boolean
     * �������ƣ�isSame
     * �����б�int a,int b
     */
    public static boolean isSame(int a,int b) {
        //����һ��
        /*boolean same;
        if(a == b) {
            same = true;
        } else  {
            same = false;
        }*/

        //��������
//        boolean same = a == b ? true : false;
        //��������
//        boolean same = a == b;

//        return same;

        //�����ģ�
        return a == b;
    }
}
