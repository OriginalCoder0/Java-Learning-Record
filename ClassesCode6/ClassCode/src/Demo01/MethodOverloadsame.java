package Demo01;

/**
 * @program: ClassCode
 * @description: ��ϰ��
 * @author: OriginalCoder
 * @create: 2020-10-20 19:32
 **/

/**
 * �Ƚ����������Ƿ����
 * �������ͷֱ�Ϊ����byte���ͣ�����short���ͣ�����int���ͣ�����long����
 * ��main�����н��в���
 */
public class MethodOverloadsame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)20, (short) 20));

        System.out.println(isSame(11,20));
        System.out.println(isSame(10L,20L));
    }

    public static boolean isSame(byte a,byte b) {
        System.out.println("����byte�����ķ���ִ��");
        boolean same;
        if(a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a,short b) {
        System.out.println("����short�����ķ���ִ��");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a,int b) {
        System.out.println("����int�����ķ���ִ��");
        return a == b;
    }

    public static boolean isSame(long a,long b) {
        System.out.println("����long�����ķ���ִ��");
        if(a == b) {
            return true;
        } else {
            return false;
        }
    }
}
