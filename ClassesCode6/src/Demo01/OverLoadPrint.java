package Demo01;

/**
 * @program: ClassCode
 * @description:
 * @author: OriginalCoder
 * @create: 2020-10-20 19:52
 **/

/**
 * byte short char int float double long string boolean
 * �ڵ����������ʱ��println��ʵ���ǽ����˶����������͵�������ʽ
 */
public class OverLoadPrint {
    public static void main(String[] args) {
        myPrint(100);
        myPrint("Hello Java");
    }
    public static void myPrint(byte num) {
        System.out.println(num);
    }
    public static void myPrint(short num) {
        System.out.println(num);
    }
    public static void myPrint(int num) {
        System.out.println(num);
    }
    public static void myPrint(long num) {
        System.out.println(num);
    }
    public static void myPrint(float num) {
        System.out.println(num);
    }
    public static void myPrint(double num) {
        System.out.println(num);
    }
    public static void myPrint(char num) {
        System.out.println(num);
    }
    public static void myPrint(String str) {
        System.out.println(str);
    }
}
