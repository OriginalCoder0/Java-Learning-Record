package cn.edu.exam;

import java.util.Scanner;

public class Example {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scA=new Scanner(System.in);
		System.out.println("�������������䣺");
		int age=scA.nextInt();//��ȡ����
		System.out.println("�����������Ա�");
		String sex=scA.next();//��ȡ�Ա�
		//�ж��û��������Ƿ��������Ҫ��
		if(age>=18) {
			if(sex.equals("��"))//equals�����Ƚϱ����볣����ֵ�Ƿ����
			{
				System.out.println("��ӭ��ͬѧ������ȤС�飡");
			}else if(sex.equals("Ů")) {
				System.out.println("��ӭŮͬѧ������ȤС�飡");
			}else {
				System.out.println("��ֻ��"+ age +"�꣬��ӭ�Ժ���ˣ�");
			}
		}
		scA.close();//�رռ������벶����
		scA=null;//ȡ�������Լ��̲��������������
	}

}
