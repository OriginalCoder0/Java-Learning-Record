package cn.edu.exam;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *
 */

public class sum2 {
	
	/**
	 * �Զ���ͨ�÷���������
	 * @param i
	 * @param max
	 */

	private static int getsum(int min,int max) {
		// TODO Auto-generated method stub
		int sum=0;
		while(min<max) {
			sum=sum+min;
			min=min+2;
		}
		return sum;
	}
	public static void main(String[] args) {

		Scanner scA = new Scanner(System.in);
		int min,max;
		System.out.println("��������ʼ������ż����");
		min=scA.nextInt();
		System.out.println("���������������ż����");
		max=scA.nextInt();
		int r=getsum(min,max);
		
		String strout="ż��";
		if(min % 2 !=0){
			strout="����";
		}
		System.out.println("��"+min+"��"+max+"��"+strout+"֮��="+r);
		
	}
}
