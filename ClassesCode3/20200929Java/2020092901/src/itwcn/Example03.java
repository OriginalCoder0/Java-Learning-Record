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
		String strPJ = "不及格";
		int iA = 0;//接受用户是否选择结束
		/*
		 * 如果要连续输入多个同学的成绩，使用循环结构语句
		 */
		do {
			System.out.println("请输入学生姓名：");
			strName = scA.next();//接受输入的姓名
			System.out.println("请输入" + strName + "同学的成绩：");
			dScore = scA.nextDouble();
			if(dScore>=90) {
				strPJ = "优秀";
			} else if(dScore>=80) {
				strPJ = "良好";
			} else if(dScore>=60) {
				strPJ = "及格";
			} else {
				strPJ = "不及格";
			}
			System.out.println(strName + "同学的得分：" + dScore + "成绩" + strPJ);
			System.out.println("请输入选择编号：0");
			System.out.println("	0——结束；1——继续");
			iA = scA.nextInt();
		}while(iA == 1);
		scA.close();

	}

}
