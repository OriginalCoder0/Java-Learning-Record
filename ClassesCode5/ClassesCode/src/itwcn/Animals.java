/**
 * 
 */
package itwcn;

/**
 * 
 * ����ʵ����
 * 
 * @author Administrator
 * 
 * ������Animals���ܴ�����
 *
 */
public abstract class Animals {
	private double weight = 0.0;
	/*
	 * ��������
	 * @param w �������ص�ֵ
	 * */
	public void setWeight(double w) {
		if(w>0) {
			this.weight = w;
		} else {
			System.out.println(w + "����һ���Ϸ�������");
		}
	}
	/*���ض��������*/
	public double getWeight() {
		return this.weight;
	}
	
	public abstract double move();			//���󷽷�

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
