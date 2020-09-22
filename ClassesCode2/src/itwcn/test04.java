/**
 * 
 */
package itwcn;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class test04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		System.out.println("请输入学生姓名：");
		String strName = scanner.next();			//从键盘返回一个字符串
		System.out.println("请输入学生成绩: ");
		float fScore = scanner.nextFloat();			//从键盘获取一个浮点数据：成绩
		String strScore = "不及格";

		switch(fScore) {
			case 90:
				strScore = "优秀";
				break;
			case 80:
				strScore = "良好";
			case 60:
				strScore = "及格";
		}
	}

}
