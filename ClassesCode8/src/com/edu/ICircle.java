/**
 * 
 */
package com.edu;

/**
 * @author Administrator
 *
 */
/**
 * 将设计者对于某个类的基本功能的设想，以代码的方式确定下来
 * 用过约束实现类的编码，来规范程序设计
 * 在类当中使用Implements关键字来约束，必须实现没有默认实现的方法，可以重写有默认方法的类
 *
 */
public interface ICircle {
	public abstract double getCircleArea();
	//定义了一个方法(旧版本的接口),允许定义抽象的方法
	
	public default double getCircleLength() {
		return 0.00;
	}
	// 1.8版本以后的定义接口的方式
}
