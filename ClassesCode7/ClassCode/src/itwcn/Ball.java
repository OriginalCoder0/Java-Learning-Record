/**
 * 
 */
package itwcn;

/**
 * @author Administrator
 *
 */
//public class Ball {
//	/**���Ա����������뾶**/
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
//			System.out.println("���ݲ��Ϸ�");
//		}
//	}
//	/**��ȡ������**/
//	public double getVolume() {
//		return (4.0/3) * PI * this.radius * this.radius * this.radius;
//	}
//	/**��ȡ������**/
//	public double getArea() {
//		return 4 * PI * this.radius * this.radius;
//	}
//	
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String c) {
//		if(c == "��" || c == "��" || c== "��" || c == "��" || c == "��" || c == "��" || c == "��") {
//			this.color = c;
//		} else {
//			System.out.println("��ɫ����ȷ��");
//		}
//		
//	}
//
//}




/**
 * ʵ���ࣺ���������Ϣ
 *
 */

public class Ball extends Circle {
	private final double PI = 3.1415926;
	public Ball() {
		super();			//���ø�����޲ι��캯��
	}
	
	/**
	 * �������Ĺ��췽��
	 * @param r
	 */
	public Ball(double r) {
		super();			//���ø����һ�������Ĺ��캯��
	}
	
	public double getVolume() {
		return (4.0/3) * PI * this.getRadius() * this.getRadius() * this.getRadius();
	}
	
}