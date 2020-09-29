/**
 * 
 */
package itwcn;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Example01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scA = new Scanner(System.in);
		System.out.println("请输入成绩：");
		double dScore = scA.nextDouble();
		String strPJ = "不及格";
		if(dScore>=90) {
			strPJ = "优秀";
		} else if(dScore>=80) {
			strPJ = "良好";
		} else if(dScore>=60) {
			strPJ = "及格";
		} else {
			strPJ = "不及格";
		}
		System.out.println("成绩：" + strPJ);
		scA.close();
	}

}
