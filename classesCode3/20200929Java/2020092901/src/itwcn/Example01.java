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
		System.out.println("������ɼ���");
		double dScore = scA.nextDouble();
		String strPJ = "������";
		if(dScore>=90) {
			strPJ = "����";
		} else if(dScore>=80) {
			strPJ = "����";
		} else if(dScore>=60) {
			strPJ = "����";
		} else {
			strPJ = "������";
		}
		System.out.println("�ɼ���" + strPJ);
		scA.close();
	}

}
