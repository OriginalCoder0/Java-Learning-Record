/**
 * 
 */
package com.edu;

/**
 * �����ࣺ��װ���־�̬���㷽�� <br/>
 * ��һ��ģ�黯����Ʒ�ʽ��
 */
public class MathTool {

	public static final double PI = 3.1415926;  // ������һ��������ֻ�ܸ�һ�θ�ֵ
	/**
	 * ��̬���������㲢����ָ���뾶��Բ���
	 * @param r ָ���İ뾶
	 * */
	public static double getCircleArea(double r) {
		double dR = PI * r * r;
		return dR;
	}
	
	/**
	 * ���㲢����ָ���뾶��Բ�ܳ�
	 * @param r ָ���İ뾶
	 * */
	public static double getCircleLength(double r) {
		return PI * 2 * r;
	}
}
