/**
 * 
 */
package cn.edu;

/**
 * ʵ���ࣺ����Բ����������Ϊ
 */
public class Circle implements ICircle {

	public Circle() {
		System.out.println("ִ��Circle()������");
	}
	
	/**���ع��췽��*/
	public Circle(double r) {
		setRadius(r);
	}
	
	public static final double PI = 3.1415926;  // ������һ��������ֻ�ܸ�һ�θ�ֵ	
	protected double radius = 0.00; // protected���εı������������ʹ�ã�

	/**��ȡԲ�뾶*/
	public double getRadius() {
		return radius;
	}

	/**����Բ�뾶
	 * @param r Բ�뾶
	 * */
	public void setRadius(double r) {
		if(r>0) {
			this.radius = r;
		}		
	}
	
	/**��ȡ��ǰԲ��������*/
	@Override
	public double getCircleArea() {
		return this.radius * this.radius * PI;
	}
	
	/**��ȡ��ǰԲ������ܳ�*/
	@Override  // ������д
	public double getCircleLength() {
		return 2 * this.radius * PI;
	}
}
