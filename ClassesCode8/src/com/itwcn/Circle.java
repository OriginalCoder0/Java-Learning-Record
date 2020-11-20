/**
 * 
 */
package com.itwcn;

/**
 * @author Administrator
 *
 */
public class Circle implements ICircle{
	
	public Circle() {
		System.out.println("Ö´ÐÐCircle()·½·¨");
	}
	public Circle(double r) {
		setRadius(r);
	}
	
	public static final double PI = 3.1415926;
	protected double radius = 0.00;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		if(r>0) {
			this.radius = r;
		}
		
	}
	@Override
	public double getCircleArea() {
		// TODO Auto-generated method stub
		return this.radius * this.radius * PI;
	}
	

}
