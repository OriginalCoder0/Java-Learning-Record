/**
 * 
 */
package circle;

/**
 * @author Administrator
 *
 */
public class  Circle {
	public static void main(String args[]) {
		ICircle c = new ICircle() {
			public double getArea(double r) {
				return Math.PI * Math.pow(r,2);
			}
		};
		
		//使用Lambda表达式定义实现方法体
		ICircle c2 = (double rB) -> {return Math.PI * Math.pow(rB, 2);};
		
		double dS = c.getArea(3.5);
		System.out.println("半径为3.5的圆的面积：" + dS);
		double rA = 3.5;
		
		c2.getArea(3.5);
		
	}
}
