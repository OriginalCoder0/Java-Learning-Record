/**
 * 
 */
package cn.edu;

/**
 * 实例类：描述圆的特征和行为
 */
public class Circle implements ICircle {

	public Circle() {
		System.out.println("执行Circle()方法！");
	}
	
	/**重载构造方法*/
	public Circle(double r) {
		setRadius(r);
	}
	
	public static final double PI = 3.1415926;  // 声明了一个常量：只能给一次赋值	
	protected double radius = 0.00; // protected修饰的变量，子类可以使用！

	/**获取圆半径*/
	public double getRadius() {
		return radius;
	}

	/**设置圆半径
	 * @param r 圆半径
	 * */
	public void setRadius(double r) {
		if(r>0) {
			this.radius = r;
		}		
	}
	
	/**获取当前圆对象的面积*/
	@Override
	public double getCircleArea() {
		return this.radius * this.radius * PI;
	}
	
	/**获取当前圆对象的周长*/
	@Override  // 方法重写
	public double getCircleLength() {
		return 2 * this.radius * PI;
	}
}
