/**
 * 
 */
package com.edu;

/**
 * 工具类：封装各种静态计算方法 <br/>
 * 是一种模块化的设计方式！
 */
public class MathTool {

	public static final double PI = 3.1415926;  // 声明了一个常量：只能给一次赋值
	/**
	 * 静态方法：计算并返回指定半径的圆面积
	 * @param r 指定的半径
	 * */
	public static double getCircleArea(double r) {
		double dR = PI * r * r;
		return dR;
	}
	
	/**
	 * 计算并返回指定半径的圆周长
	 * @param r 指定的半径
	 * */
	public static double getCircleLength(double r) {
		return PI * 2 * r;
	}
}
