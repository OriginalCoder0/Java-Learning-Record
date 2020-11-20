/**
 * 
 */
package itwcn;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//面向过程的方法设计
		final double  PI = 3.141926;			//常变量
		double dV = MathTools.getVolume(8.56);
		System.out.println("半径为8.56的球的体积为=" + dV);
		
		double dA = MathTools.getArea(8.56,PI);
		System.out.println("半径为8.56的球的体积为=" + dA);
		
		
		
		//面向对象的方法设计
		Circle c1 = new Circle();			//创建圆的实例对象
		c1.setRadius(12.5);
		System.out.println("半径=" + c1.getRadius() + ",面积=" + 
							c1.getArea() + ",周长= " + c1.getLength());
		
		//创建球的实例对象
		Ball ball = new Ball();
		ball.setRadius(10.2);
//		ball.setColor("红");
		System.out.println("半径为=" + ball.getRadius()  + ",面积=" + 
							ball.getVolume());
//		System.out.println("颜色："+ ball.getColor());
		
		

	}

}
