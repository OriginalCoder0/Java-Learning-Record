package other;

/**
 * @program: ClassCode
 * @description: ����ʹ�õ�ע������
 * @author: OriginalCoder
 * @create: 2020-10-20 18:47
 **/

/**
 * ʹ�÷�����ע�����
 * 1.�����Ķ���Ӧ�������У����ǲ����ڷ��������ٶ��巽��������д������Ƕ��
 * 2.�����Ķ���ǰ��˳������ν
 * 3.��������֮�󲻻�ִ�У����ϣ��ִ�У�һ��Ҫ���ã��������ã���ӡ���ã���ֵ����
 * 4.����з���ֵ����ô����д��return ����ֵ ������û�У�
 * 5.return����ķ���ֵ���ݣ�����ͷ����ķ���ֵ���ͣ���Ӧ����
 * 6.����һ��voidû�з���ֵ�ķ���������дreturn����ķ���ֵ��ֻ��дreturn�Լ�
 * 7.���ڷ��������һ�е�return����ʡ�Բ�д
 * 8.һ�������п����ж��return��䣬���Ǳ��뱣֤ͬʱֻ��һ���ᱻִ�У���������return��д
 */
public class MethodNotice {
    public static void main(String[] args) {

    }
    public static int method1() {
        return 10;
    }
    public static void method2() {
        return;     //û�з���ֵ��ֻ�ǽ���������ִ�ж���
    }

    public static int getMax(int a,int b) {
        //����һ��
//        int max;
//        if(a>b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        return max;

        //��������
//        if(a>b) {
//            return a;
//        } else {
//            return b;
//        }

        //��������
        return a > b ? a : b;

    }
}
