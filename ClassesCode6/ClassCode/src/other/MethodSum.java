package other;

/**
 * @program: ClassCode
 * @description: ������1~100���ۼӺ�
 * @author: OriginalCoder
 * @create: 2020-10-20 18:38
 **/
public class MethodSum {
    public static void main(String[] args) {
        System.out.println("����ǣ�" + getSum());
    }

    /**
     * ��Ҫ�أ�
     * ����ֵ���з���ֵ����������һ��int����
     * �������ƣ�getSum
     * �����б����ݷ�Χ�Ѿ�ȷ�����ǹ̶��ģ����Բ���Ҫ˵���κ�����������Ҫ������
     */
    public static int getSum() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum  += i;
        }
        return sum;
    }
}
