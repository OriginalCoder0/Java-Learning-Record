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
		
		//ʹ��Lambda����ʽ����ʵ�ַ�����
		ICircle c2 = (double rB) -> {return Math.PI * Math.pow(rB, 2);};
		
		double dS = c.getArea(3.5);
		System.out.println("�뾶Ϊ3.5��Բ�������" + dS);
		double rA = 3.5;
		
		c2.getArea(3.5);
		
	}
}