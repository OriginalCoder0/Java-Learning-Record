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
		
		//������̵ķ������
		final double  PI = 3.141926;			//������
		double dV = MathTools.getVolume(8.56);
		System.out.println("�뾶Ϊ8.56��������Ϊ=" + dV);
		
		double dA = MathTools.getArea(8.56,PI);
		System.out.println("�뾶Ϊ8.56��������Ϊ=" + dA);
		
		
		
		//�������ķ������
		Circle c1 = new Circle();			//����Բ��ʵ������
		c1.setRadius(12.5);
		System.out.println("�뾶=" + c1.getRadius() + ",���=" + 
							c1.getArea() + ",�ܳ�= " + c1.getLength());
		
		//�������ʵ������
		Ball ball = new Ball();
		ball.setRadius(10.2);
//		ball.setColor("��");
		System.out.println("�뾶Ϊ=" + ball.getRadius()  + ",���=" + 
							ball.getVolume());
//		System.out.println("��ɫ��"+ ball.getColor());
		
		

	}

}
