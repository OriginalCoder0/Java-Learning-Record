package other;

/**
 * @program: ClassCode
 * @description: Ҫ���ӡ���ٴ�
 * @author: OriginalCoder
 * @create: 2020-10-20 18:42
 **/
public class MethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }
    /**
     * ��Ҫ�أ�
     * ����ֵ���ͣ����д�ӡ������û�в�����Ҳû�н�����ظ����ô�
     * �������ƣ�printCount
     * �����б�����Ҫ��ӡ���ٴΣ�
     */
    public static void printCount(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Hello!" + (i+1));
        }
    }
}
