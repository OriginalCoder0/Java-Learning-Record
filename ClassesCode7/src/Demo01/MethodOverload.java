package Demo01;

/**
 * @program: ClassCode
 * @description: ѧϰ����������
 * @author: OriginalCoder
 * @create: 2020-10-20 19:14
 **/
public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }

    public static int sum(int a,int b) {
        System.out.println("��������ִ��");
        return a + b;
    }
    public static int sum(int a,int b,int c) {
        System.out.println("��������ִ��");
        return a + b + c;
    }
    public static int sum(int a,int b,int c,int d) {
        System.out.println("�ĸ�����ִ��");
        return a + b + c + d;
    }
}
