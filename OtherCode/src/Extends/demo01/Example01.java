package Extends.demo01;

/**
 * @program: Example01
 * @description: ѧϰJava���ڲ���
 * @author: OriginalCoder
 * @createtime:2020/10/27 17:36
 **/
class Outer {
    int m = 0;
    //�����ⲿ���Ա����
    void test1() {
        System.out.println("�ⲿ���Ա����");
    }
    //�����Ա�ڲ���
    class Inner {
        int n = 1;
        //1.�����ڲ��෽���������ⲿ���Ա�����ͷ���
        void show1() {
            System.out.println("�ⲿ���Ա����m="+m);
            test1();
        }
        void show2() {
            System.out.println("�ڲ����Ա����");
        }
        //2.�����ⲿ�෽���������ڲ�������ͷ���
        void test02() {
            Inner inner = new Inner();
            System.out.println("�ڲ����Ա����n="+inner.n);
            inner.show2();
        }
    }
}

//���������
public class Example01 {
    public static void main(String[] args) {
        Outer outer = new Outer();                  //�����ⲿ�����
        Outer.Inner inner = outer.new Inner();      //�����ڲ������
        inner.show1();      //�����ڳ�Ա�ڲ����з����ⲿ���Ա�����ͷ���
        inner.show2();      //�������ⲿ���з����ڲ����Ա�����ͷ���
    }
}