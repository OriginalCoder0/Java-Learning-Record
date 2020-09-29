package cn.edu.exam;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *
 */

public class sum2 {
	
	/**
	 * 自定义通用方法：计算
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
		System.out.println("请输入起始奇数或偶数：");
		min=scA.nextInt();
		System.out.println("请输入最大奇数或偶数：");
		max=scA.nextInt();
		int r=getsum(min,max);
		
		String strout="偶数";
		if(min % 2 !=0){
			strout="奇数";
		}
		System.out.println("从"+min+"到"+max+"的"+strout+"之和="+r);
		
	}
}
