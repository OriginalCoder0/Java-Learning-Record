package itwcn.com;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Example01 {
    public static void main(String[] args)  {
        /**
         * �����޲����Ĺ��췽����������
         */
        Dog dog = new Dog();
        dog.setKind("��ë");
        dog.setName("����");
        try {
            //�����쳣
            dog.setWeight(7.0);

        } catch (Exception e){
            e.printStackTrace();
        }
        dog.showInfo();
        /**���������������Ԫ�ص�������Dog**/
        Dog[] dA = new Dog[4];
        //��һ���Ѿ����ڵĶ��������ֵ��ֵ��0��Ԫ��
        dA[0] = dog;
        try {
            dA[1] = new Dog("�л���԰Ȯ","���",25);
            dA[2] = new Dog("��ë","����",35);
            dA[3] = new Dog("��ĦҮ","���",30);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //����Java����򼯺ϵı���ѭ���ṹ������d�����������鵱�е�ÿ��Ԫ��
        for (Dog d:dA) {
            if(d != null) {
                d.showInfo();
            }
        }

//        List<String> list = new ArrayList<String>();
//        Scanner sc = new Scanner(System.in);
//        BigInteger dogName = sc.nextBigInteger();
//        list.add("��ë");
    }
}
