package itwcn;

/**
 * @program: test03
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/20 11:02
 **/

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class test03 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner =  new Scanner(System.in);
        System.out.println("������ѧ��������");
        String strName = scanner.next();			//�Ӽ��̷���һ���ַ���
        System.out.println("������ѧ���ɼ�: ");
        float fScore = scanner.nextFloat();			//�Ӽ��̻�ȡһ���������ݣ��ɼ�
        String strScore = "������";

        if(fScore>=90) {
            strScore = "����";
        } else if(fScore>=80) {
            strScore = "����";
        } else if(fScore>=60) {
            strScore = "����";
        }
        System.out.println(strName + "ͬѧ����" + fScore + ',' + strScore);
        scanner.close();
    }
}
