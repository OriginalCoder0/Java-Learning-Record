/**
 * 
 */
package cn.edu;

/**
 * 将设计者对于某个类的基本功能的设想，以代码的方式确定下来，
 * 通过约束实现类的编码，来规范程序设计！
 * 在类当中使用 implements 关键字来约束类：必须实现没有默认实现的方法。
 * 可以重写有默认实现的方法。
 */
public interface ICircle {
	
	public abstract double getCircleArea();  // 定义了一个方法（旧版本的接口）
	
	public default double getCircleLength() {  // 1.8 版本以后定义接口的方式
		return 0.00;
	} 
	
}
