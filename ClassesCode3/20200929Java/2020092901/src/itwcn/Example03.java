/**
 * 
 */
package itwcn;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Example03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scA = new Scanner(System.in);
		String strName = null;
		double dScore=0.00;
		String strPJ = "������";
		int iA = 0;//�����û��Ƿ�ѡ�����
		/*
		 * ���Ҫ����������ͬѧ�ĳɼ���ʹ��ѭ���ṹ���
		 */
		do {
			System.out.println("������ѧ��������");
			strName = scA.next();//�������������
			System.out.println("������" + strName + "ͬѧ�ĳɼ���");
			dScore = scA.nextDouble();
			if(dScore>=90) {
				strPJ = "����";
			} else if(dScore>=80) {
				strPJ = "����";
			} else if(dScore>=60) {
				strPJ = "����";
			} else {
				strPJ = "������";
			}
			System.out.println(strName + "ͬѧ�ĵ÷֣�" + dScore + "�ɼ�" + strPJ);
			System.out.println("������ѡ���ţ�0");
			System.out.println("	0����������1��������");
			iA = scA.nextInt();
		}while(iA == 1);
		scA.close();

	}

}
