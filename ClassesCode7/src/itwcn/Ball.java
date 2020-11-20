/**
 * 
 */
package itwcn;

/**
 * @author Administrator
 *
 */
//public class Ball {
//	/**属性变量：描述半径**/
//	private double radius = 0.00;
//	private final double PI = 3.1415926;
//	private String color = null;
//	public double getRadius() {
//		return radius;
//	}
//	public void setRadius(double r) {
//		if(r>0) {
//			this.radius = r;
//		} else {
//			System.out.println("数据不合法");
//		}
//	}
//	/**获取球的体积**/
//	public double getVolume() {
//		return (4.0/3) * PI * this.radius * this.radius * this.radius;
//	}
//	/**获取球的面积**/
//	public double getArea() {
//		return 4 * PI * this.radius * this.radius;
//	}
//	
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String c) {
//		if(c == "赤" || c == "橙" || c== "黄" || c == "绿" || c == "青" || c == "靛" || c == "紫") {
//			this.color = c;
//		} else {
//			System.out.println("颜色不正确！");
//		}
//		
//	}
//
//}




/**
 * 实体类：描述球的信息
 *
 */

public class Ball extends Circle {
	private final double PI = 3.1415926;
	public Ball() {
		super();			//调用父类的无参构造函数
	}
	
	/**
	 * 带参数的构造方法
	 * @param r
	 */
	public Ball(double r) {
		super();			//调用父类的一个参数的构造函数
	}
	
	public double getVolume() {
		return (4.0/3) * PI * this.getRadius() * this.getRadius() * this.getRadius();
	}
	
}