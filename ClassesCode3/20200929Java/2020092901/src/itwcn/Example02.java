/**
 * 
 */
package itwcn;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Example02 {

	/**根据输入的月份判断当月天数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scA = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
		System.out.println("请输入年份：");
		year = scA.nextInt();
		System.out.println("请输入月份：");
		month = scA.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			if(year%4==0&&year%100!=0||year%400==0) {
				day = 28;
			} else 
				day = 29;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		default:
			System.out.println("请输入正确的月份！");	
		}
		System.out.println("你输入的年份是：" + year + "，月份：" + month + "月，当月有" + day + "天！");
		scA.close();
	}

}
