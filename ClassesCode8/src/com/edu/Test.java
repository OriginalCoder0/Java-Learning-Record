/**
 * 
 */
package com.edu;

/**
 * 测试类：由于编写测试代码 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 面向过程的编程方法：
		double dA = MathTool.getCircleArea(3.85); // 使用类名称调用类的静态方法
		System.out.println("半径为 3.85 的圆面积=" + dA);
		double dL = MathTool.getCircleLength(3.85);
		System.out.println("半径为 3.85 的圆周长=" + dL);
		
		//面向对象的编程方法：
		Circle c1 = new Circle();
		c1.setRadius(3.85);
		System.out.println("半径为 3.85 的圆面积=" + c1.getCircleArea());
		System.out.println("半径为 3.85 的圆周长=" + c1.getCircleLength());	
		
		Circle ball = new Ball(); // 使用父类变量引用子类对象：实现多态
		ball.setRadius(5.0);
		//System.out.println("球的体积是：" + ((Ball)ball).gettiji());
		System.out.println("球的直径圆面积=" + ball.getCircleArea());
		System.out.println("球的直径圆周长=：" + ball.getCircleLength());	
		// 父类变量在不同的子类对象中，调用相同的方法，表现出不同的行为特征（结果）
		// 这种现象就称为多态！
		
		
		
		
		
		
		
		
		//使用接口作为数据类型，声明变量，借用接口的构造方法来创建对象
		ICircle c2 = new ICircle() {
			
			//匿名内部类
			@Override
			public double getCircleArea() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
		
		
		
		
		
		
		
		//try...catch的代码实践
		try {
			//可能发生的异常
			System.out.println("球的体积是：" + ((Ball)c1).gettiji());
		} catch (Exception e) {
			//对捕获到的异常进行处理
			System.out.println("发生异常了！");
			e.printStackTrace();
		} finally {
			//不管是否发生异常，都需要做的工作写在这里
			
		}
	}

}
