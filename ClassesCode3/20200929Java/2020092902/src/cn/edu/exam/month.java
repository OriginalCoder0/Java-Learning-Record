package cn.edu.exam;

import java.util.Scanner;

public class month {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scA=new Scanner(System.in);
		int iR=1;//��������
		do{
			System.out.println("�������·����֣�");
			int month=scA.nextInt();
			int day=0;
			switch(month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					day=31;
					break;
				case 2:
					day=28;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					day=30;
					break;
					default:
						System.out.println("�����·ݲ���ȷ������");
						break;
			}
			System.out.println(month+"�·���"+day+"�졣");
			System.out.println("��Ҫ������");
			System.out.println("0��������Ҫ 1������Ҫ");
			iR=scA.nextInt();
		}while(iR==1);
		scA.close();
	}
}
