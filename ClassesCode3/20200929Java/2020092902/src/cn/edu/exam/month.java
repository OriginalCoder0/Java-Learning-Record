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
		int iR=1;//条件变量
		do{
			System.out.println("请输入月份数字：");
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
						System.out.println("输入月份不正确！！！");
						break;
			}
			System.out.println(month+"月份是"+day+"天。");
			System.out.println("需要继续吗？");
			System.out.println("0——不需要 1——需要");
			iR=scA.nextInt();
		}while(iR==1);
		scA.close();
	}
}
